package com.androidsdk.snaphy.snaphyandroidsdk.presenter;

import android.util.Log;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;
import java.util.HashMap;


/**
 * Created by snaphy on 13/9/16.
 */
public final class Presenter {
    private static Presenter instance;
    private HashMap<String, EventType> eventTypeHashMap;

    private class EventType{
        Class type;
        DataList<? extends Object> dataList;
        String Id;

        public EventType(String Id, DataList<? extends Object> dataList){
            //this.type = type;
            this.Id = Id;
            this.dataList = dataList;
        }
    }

    /**
     * Constructor
     * */
    public Presenter() {
        eventTypeHashMap = new HashMap<>();
    }


    public void addList(String Id, DataList<? extends Object> dataList){
        EventType eventType = new EventType(Id, dataList);
        eventTypeHashMap.put(Id, eventType);
    }

    //http://stackoverflow.com/questions/450807/how-do-i-make-the-method-return-type-generic
    //Generic return type..
    public <T> DataList<T> getList(Class<T> type, String Id){
        //Find the given Object..
        EventType eventType = eventTypeHashMap.get(Id);
        if(eventType == null){
            Log.e("Snaphy", "EventType is not found. Wrong id");
            return null;
        }else{
            DataList<? extends Object> dataList = eventType.dataList;
            //Now cast according to its type..
            DataList<T> tDataList = (DataList < T >) (DataList) dataList;
            //type.cast(dataList);
            return tDataList;
        }
    }


    /**
     * Finding the thread safe instance of the Presenter class.
     * @return Return the instance of the presenter class.
     */
    public static Presenter getInstance(){
        if(instance == null){
            Class var0 = Presenter.class;
            synchronized (Presenter.class){
                if(instance == null){
                    instance = new Presenter();
                }
            }
        }
        return instance;
    }




}
