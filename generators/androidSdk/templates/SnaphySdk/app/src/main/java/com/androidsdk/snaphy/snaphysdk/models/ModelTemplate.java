package com.example.ravi_gupta.retailerapp;

import com.strongloop.android.loopback.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ravi-Gupta on 1/20/2016.
 */
public class ModelTemplate extends Model {

    //private int id;
    private String date;
    private int pincode;
    private List<HashMap<String, Object>> prescription;


    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }


}
