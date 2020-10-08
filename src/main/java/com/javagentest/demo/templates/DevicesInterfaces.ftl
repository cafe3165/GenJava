package ${classPath};
public interface ${className} {
<#if ReduceFunc !="" >
    void ${ReduceFunc}() ;
</#if>
<#if IncreaseFunc !="" >
    void ${IncreaseFunc}() ;
</#if>
public double get${attribute}() ;
public void set${attribute}(double ${attribute});
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