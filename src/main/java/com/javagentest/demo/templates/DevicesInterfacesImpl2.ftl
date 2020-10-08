package ${classPath};

public class ${className}Impl implements ${className} {
private double ${attribute};
private String id;
private String locationName;
private String deviceName;
private String status;
private String type;
private Device device;
@Override
public double get${attribute}() {
${attribute}=device.get${attribute}();
    return ${attribute};
}
@Override
public void set${attribute}(double ${attribute}) {
    device.set${attribute}(${attribute});
    this.${attribute} =device.get${attribute}();
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
<#if ReduceFunc !="" >
@Override
public void ${ReduceFunc}() {
    device.${ReduceFunc}();
    }
</#if>
<#if IncreaseFunc !="" >
@Override
public void ${IncreaseFunc}() {
    device.${IncreaseFunc}();
    }
</#if>
}