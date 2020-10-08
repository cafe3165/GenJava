package com.javagentest.demo.util.runtime;

import com.javagentest.demo.util.device.Mi;

public class AirCleanerImpl implements AirCleaner {
private double PM2_5;
private String id;
private String locationName;
private String deviceName;
private String status;
private String type;
private Mi mi;

public AirCleanerImpl(Mi mi){
    this.mi=mi;
}
@Override
public double getPM2_5() {
PM2_5=mi.getPM2_5();
    return PM2_5;
}
@Override
public void setPM2_5(double PM2_5) {
    mi.setPM2_5(PM2_5);
    this.PM2_5 =mi.getPM2_5();
}
@Override
public String getId() {
    id=mi.getId();
    return id;
}
@Override
public void setId(String id) {
    mi.setId(id);
    this.id = id;
}
@Override
public String getLName() {
    locationName=mi.getLocation();
    return locationName;
}
@Override
public void setLName(String locationName) {
    mi.setLocation(locationName);
    this.locationName = locationName;
}
@Override
public String getDName() {
    deviceName=mi.getDeviceName();
    return deviceName;
}
@Override
public void setDName(String deviceName) {
    mi.setDeviceName(deviceName);
    this.deviceName = deviceName;
}
@Override
public String getStatus() {
    status=mi.getStatus();
    return status;
}
@Override
public void setStatus(String status) {
    mi.setStatus(status);
    this.status = status;
}
@Override
public String getType() {
    type=mi.getType();
    return type;
}
@Override
public void setType(String type) {
    mi.setType(type);
    this.type = type;
}
@Override
public void purify() {
    mi.purify();
    }
}