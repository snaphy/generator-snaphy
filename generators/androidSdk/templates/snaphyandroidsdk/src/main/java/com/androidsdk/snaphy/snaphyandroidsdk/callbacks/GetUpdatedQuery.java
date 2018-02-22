package com.androidsdk.snaphy.snaphyandroidsdk.callbacks;

import java.util.HashMap;

/**
 * Created by robinskumargupta on 17/02/18.
 */

/**
 * Will get called by user for updating query..
 */
public interface GetUpdatedQuery {
    HashMap<String, Object> onQueryChange();
    String onOrderByChange();
}
