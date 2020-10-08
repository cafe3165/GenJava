package ${classPath};
public class ${className}Impl implements ${className} {
private double ${attribute};
private String id;
private String locationName;
private String deviceName;
private String status;
private String type;
@Override
public double get${attribute}() {return ${attribute};}
@Override
public void set${attribute}(double ${attribute}) {this.${attribute} = ${attribute};}
@Override
public String getId() {return id;}
@Override
public void setId(String id) {this.id = id;}
@Override
public String getLName() {return locationName;}
@Override
public void setLName(String locationName) {this.locationName = locationName;}
@Override
public String getDName() {return deviceName;}
@Override
public void setDName(String deviceName) {this.deviceName = deviceName;}
@Override
public String getStatus() {return status;}
@Override
public void setStatus(String status) {this.status = status;}
@Override
public String getType() {return type;}
@Override
public void setType(String type) {this.type = type;}
<#if ReduceFunc !="" >
@Override
public void ${ReduceFunc}() {}
</#if>
<#if IncreaseFunc !="" >
@Override
public void ${IncreaseFunc}() {}
</#if>
}