package com.androidsdk.snaphy.snaphyandroidsdk.list;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.ObjectCallback;
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.VoidCallback;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by robinskumargupta on 14/02/18.
 */

public class LazyList<T> extends ArrayList<T> {

    private Cursor mCursor;
    private ItemFactory<T> mCreator;
    private ObjectCallback<T> mCallback;
    private ArrayList<OnDataChanged> mSubscriberList = new ArrayList<>();
    private SQLiteDatabase mDb;
    private String mQuery;
    private OnQueryChange mQueryChange;
    private int count = 0;


    /**
     * Initialize the lazy list..
     * @param db
     //* @param query
     * @param creator
     * @param callback
     */
    public LazyList(SQLiteDatabase db, ItemFactory<T> creator, ObjectCallback<T> callback, OnQueryChange onQueryChange) {
        //mQuery = query;
        mDb    = db;
        mCreator = creator;
        mCallback = callback;
        mQueryChange = onQueryChange;
        updateCursor();
    }


    public void updateCursor(){
        int oldSize = 0;
        int newSize = 0;
        try{
            Cursor oldCursor = mCursor;
            try{
                clear();
            }catch (Exception e){
                Log.e("LazyLoading", e.toString());
            }

            if(mQueryChange != null){
                //Fetch the updated Query data..
                mQuery = mQueryChange.getUpdateQuery();
            }

            if(mQuery != null){
                if(!mQuery.isEmpty()){
                    
                    Cursor cursor = mDb.rawQuery(mQuery, null);
                    setCursor(cursor, mCreator, mCallback);
                    if(cursor != null){
                        newSize = cursor.getCount();
                    }


                    count = newSize;

                }
            }

            //Close the old cursor first..
            //Prevent the memory leak
            try{
                if(oldCursor != null){
                    oldSize = oldCursor.getCount();
                    oldCursor.close();
                    oldCursor = null;
                }
            } catch (Exception e){
                Log.e("LazyList", e.toString());
            }
        }catch (Exception e){
            Log.e("LazyList", e.getMessage());
        }finally {
            count = newSize;
            //Now publish the change the subscriber list..
            publishChange(oldSize, newSize);
        }


    }


    /**
     * Subscribe to the data..
     * @param onDataChanged
     */
    public void subscribe(OnDataChanged onDataChanged){
        mSubscriberList.add(onDataChanged);
    }


    /**
     * UnSubscribe and item from list..
     * @param onDataChanged
     */
    public void unSubscribe(OnDataChanged onDataChanged){
        if(onDataChanged != null){
            mSubscriberList.remove(onDataChanged);
        }
    }


    /**
     * Publish Change..
     */
    private void publishChange(int oldSize, int newSize){
        if(mSubscriberList != null){
            if(mSubscriberList.size() != 0){
                for(OnDataChanged onDataChanged : mSubscriberList){
                    //Call onChange data..
                    onDataChanged.onChange(oldSize, newSize);
                }
            }
        }
    }


    /**
     * Remove all subscribers..
     */
    public void unSubscribeAll(){
        mSubscriberList.clear();
    }

    /**
     * Set cursor..
     * @param cursor
     * @param creator
     * @param callback
     */
    public void setCursor(Cursor cursor, ItemFactory<T> creator, ObjectCallback<T> callback){
        mCursor = cursor;
        mCreator = creator;
        mCallback = callback;
        //Now close the cursor if there is not data in the cursor..
        if(mCursor.getCount() == 0){
            //Closing the cursor for safe data..preventing memory leakage..
            closeCursor();
        }

    }



    public void fillList(){
        int size = this.size();

    }





    @Override
    public T get(int index) {
        try{
            /*T item = mCreator.create(mCursor, index);
            //Now call callback on data add..
            mCallback.onSuccess(item);
            return item;*/


            int size = super.size();
            if (index < size) {
                // find item in the collection
                T item = super.get(index);
                if (item == null) {
                    item = mCreator.create(mCursor, index);
                    //Now call callback on data add..
                    mCallback.onSuccess(item);
                    set(index, item);
                }
                return item;
            } else {
                // we have to grow the collection
                for (int i = size; i < index; i++) {
                    add(null);
                }
                // create last object, add and return
                T item = mCreator.create(mCursor, index);
                //Now call callback on data add..
                mCallback.onSuccess(item);
                add(item);
                return item;
            }
        }catch (Exception e){
            //attempt to re-open an already-closed object
            //Cursor closed ignore..
            return null;
        }

    }

    @Override
    public void clear(){
        try{
            if(mCursor != null) {
                mCursor.close();
                mCursor = null;
            }
        }catch (IllegalStateException e){

        }
        count = 0;
        super.clear();
    }



    @Override
    public int size() {
        try{
            /*if(mCursor == null){
                return 0;
            }
            return mCursor.getCount();*/
            return count;
        }catch (IllegalStateException e){
            //Cursor got closed
            return 0;
        }
    }


    public void closeCursor() {
        try{
            if(mCursor != null){
                mCursor.close();
                mCursor = null;
            }
        }catch (IllegalStateException e){
            //Cursor got closed
            //Do nothing here..
        }

    }


    public interface  OnDataChanged {
        void onChange(int oldSize, int newSize);
    }

    /**
     * On where query change..Private for internal use only..
     */
    public interface OnQueryChange{
        String getUpdateQuery();
    }



    public interface ItemFactory<T> {
        T create(Cursor cursor, int index);
    }

}
