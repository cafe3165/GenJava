package com.javagentest.demo.util.runtime;

import com.javagentest.demo.util.device.Gree;

public class AirConditionImpl implements AirCondition {
private double Temperature;
private String id;
private String locationName;
private String deviceName;
private String status;
private String type;
private Gree gree;
public AirConditionImpl(Gree gree){
    this.gree=gree;
}
@Override
public double getTemperature() {
Temperature=gree.getTemperature();
    return Temperature;
}
@Override
public void setTemperature(double Temperature) {
    gree.setTemperature(Temperature);
    this.Temperature =gree.getTemperature();
}
@Override
public String getId() {
    id=gree.getId();
    return id;
}
@Override
public void setId(String id) {
    gree.setId(id);
    this.id = id;
}
@Override
public String getLName() {
    locationName=gree.getLocation();
    return locationName;
}
@Override
public void setLName(String locationName) {
    gree.setLocation(locationName);
    this.locationName = locationName;
}
@Override
public String getDName() {
    deviceName=gree.getDeviceName();
    return deviceName;
}
@Override
public void setDName(String deviceName) {
    gree.setDeviceName(deviceName);
    this.deviceName = deviceName;
}
@Override
public String getStatus() {
    status=gree.getStatus();
    return status;
}
@Override
public void setStatus(String status) {
    gree.setStatus(status);
    this.status = status;
}
@Override
public String getType() {
    type=gree.getType();
    return type;
}
@Override
public void setType(String type) {
    gree.setType(type);
    this.type = type;
}
@Override
public void cool() {
    gree.cool();
    }
@Override
public void warm() {
    gree.warm();
    }
}