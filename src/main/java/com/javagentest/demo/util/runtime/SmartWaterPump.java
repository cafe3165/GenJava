package com.javagentest.demo.util.runtime;

public interface SmartWaterPump {
    void water() ;
public double getHumidity() ;
public void setHumidity(double Humidity);
public String getId() ;
public void setId(String id);
public String getLName() ;
public void setLName(String locationName) ;
public String getDName() ;
public void setDName(String deviceName);
public String getStatus() ;
public void setStatus(String status);
public String getType();
public void setType(String type);
}