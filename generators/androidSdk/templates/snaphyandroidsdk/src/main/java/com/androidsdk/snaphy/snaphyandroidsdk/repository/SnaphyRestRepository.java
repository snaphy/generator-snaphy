package com.androidsdk.snaphy.snaphyandroidsdk.repository;

import android.content.Context;

import com.strongloop.android.remoting.Repository;
import com.strongloop.android.remoting.VirtualObject;
import com.strongloop.android.remoting.adapters.RestContract;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;
import com.strongloop.android.loopback.RestRepository;

public class SnaphyRestRepository<T extends VirtualObject> extends RestRepository<T>{
    public SnaphyRestRepository(String className) {
        super(className);
    }

    public SnaphyRestRepository(String className, Class<T> objectClass) {
        super(className, objectClass);
    }

    public RestContract createContract() {
        return new RestContract();
    }

    public SnaphyRestAdapter getRestAdapter() {
        return (SnaphyRestAdapter) getAdapter();
    }

    protected Context getApplicationContext() {
        return getRestAdapter().getApplicationContext();
    }
}