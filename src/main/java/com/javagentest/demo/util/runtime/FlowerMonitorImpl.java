package com.javagentest.demo.util.runtime;

import com.javagentest.demo.util.device.Meacon;

public class FlowerMonitorImpl implements FlowerMonitor {
private double Humidity;
private String id;
private String locationName;
private String deviceName;
private String status;
private String type;
private Meacon device;
@Override
public double getHumidity() {
Humidity=device.getHumidity();
    return Humidity;
}
@Override
public void setHumidity(double Humidity) {
    device.setHumidity(Humidity);
    this.Humidity =device.getHumidity();
}
@Override
public String getId() {
    id=device.getId();
    return id;
}
@Override
public void setId(String id) {
    device.setId(id);
    this.id = id;
}
@Override
public String getLName() {
    locationName=device.getLocation();
    return locationName;
}
@Override
public void setLName(String locationName) {
    device.setLocation(locationName);
    this.locationName = locationName;
}
@Override
public String getDName() {
    deviceName=device.getDeviceName();
    return deviceName;
}
@Override
public void setDName(String deviceName) {
    device.setDeviceName(deviceName);
    this.deviceName = deviceName;
}
@Override
public String getStatus() {
    status=device.getStatus();
    return status;
}
@Override
public void setStatus(String status) {
    device.setStatus(status);
    this.status = status;
}
@Override
public String getType() {
    type=device.getType();
    return type;
}
@Override
public void setType(String type) {
    device.setType(type);
    this.type = type;
}
}