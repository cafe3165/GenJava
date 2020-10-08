package com.javagentest.demo.util;

import com.javagentest.demo.util.*;
import com.javagentest.demo.util.device.Gree;
import com.javagentest.demo.util.device.Mi;
import com.javagentest.demo.util.device.Panasonic;
import com.javagentest.demo.util.runtime.AirCleaner;
import com.javagentest.demo.util.runtime.AirCleanerImpl;
import com.javagentest.demo.util.runtime.AirCondition;
import com.javagentest.demo.util.runtime.AirConditionImpl;

/**
 * Author:cafe3165
 * Date:2020-05-14
 */
public class DevicesInstance {
    public static void main(String[] args) {
        Gree gree=new Gree();
        AirCondition a = new AirConditionImpl(gree);
        a.setTemperature(0.0);
        a.setType("Gree");
        a.warm();
        a.cool();





    }
}
