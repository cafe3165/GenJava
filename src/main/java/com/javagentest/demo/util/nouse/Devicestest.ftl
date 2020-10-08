package ${classPath};

public class ${className} {

private double ${attribute};
private String type;
private String id;
private String locationName;
private String deviceName;
private String status;
public String getLocation() {return locationName;}
public void setLocation(String location) {this.locationName = location;}
public String getDeviceName() {return deviceName;}
public void setDeviceName(String deviceName) {this.deviceName = deviceName;}
public String getId() {return id;}
public void setId(String id) {
this.id = id;
}
<#if ReduceFunc !="" >
    public void ${ReduceFunc}() {
    ${attribute}-= 0.1;
    System.out.println("${className}"+"开始进行"+"${ReduceFunc}操作.");
    //System.out.println("目标"+"${attribute}"为： " + ${attribute});
    }
</#if>
<#if IncreaseFunc!="" >
    public void ${IncreaseFunc}() {
    ${attribute} += 0.1;
    System.out.println("设备："+id+" 开始进行"+"${IncreaseFunc}"+"操作.");
    //System.out.println("目标"+"${attribute}"为： " + ${attribute});
    }
</#if>
public double get${attribute}() {
return ${attribute};
}
public void set${attribute}(double t) {
${attribute} = t;
}
public String getStatus() {
return status;
}
public void setStatus(String status) {
this.status = status;
}
public String getType() {
return type;
}
public void setType(String type) {
this.type = type;
}
}