package com.javagentest.demo.Proxy.DeviceConfig;
import com.javagentest.demo.Proxy.device.${className};
import com.javagentest.demo.Proxy.runtime.${Type};
import com.javagentest.demo.Proxy.runtime.${Type}Impl;
import java.util.*;
public class Config${Type} {
public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {
    classMaps.put(${className}.class.getName(), ${Type}Impl.class.getName());
    apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("set${attribute}", double.class).getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("set${attribute}", double.class).getName()));
    apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("get${attribute}").getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("get${attribute}").getName()));
    apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("setId", String.class).getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("setId", String.class).getName()));
    apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("getId").getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("getId").getName()));
    apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("setLName", String.class).getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("setLocationName", String.class).getName()));
    apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("getLName").getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("getLocationName").getName()));
    apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("setStatus", String.class).getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("setStatus", String.class).getName()));
    apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("getStatus").getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("getStatus").getName()));
    apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("setDName", String.class).getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("setDeviceName", String.class).getName()));
    apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("getDName").getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("getDeviceName").getName()));
    apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("setType", String.class).getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("setType", String.class).getName()));
    apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("getType").getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("getType").getName()));
    <#if ReduceFunc !="" >
        apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("${ReduceFunc}").getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("${ReduceFunc}").getName()));
    </#if>
    <#if IncreaseFunc!="" >
        apiMaps.put(${Type}.class.getName() + "." + ${Type}.class.getMethod("${IncreaseFunc}").getName(), Collections.singletonList(${className}.class.getName() + "." + ${className}.class.getMethod("${IncreaseFunc}").getName()));
    </#if>
    }
}