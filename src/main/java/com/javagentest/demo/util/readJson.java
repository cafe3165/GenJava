package com.javagentest.demo.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:cafe3165
 * Date:2020-04-10
 */
public class readJson {
    public static List<Map<String, String>> read(List<String> mapname, String configpath) throws IOException {
        if (configpath.equals("src/main/java/com/javagentest/demo/Config/DevicesInterfacesImplConfig.json")) {
            configpath = "src/main/java/com/javagentest/demo/Config/DevicesInterfacesConfig.json";
        }
        File file = new File(configpath);
        String fstr = FileUtils.readFileToString(file);
        JSONArray jsonArray = JSON.parseArray(fstr);
        List<Map<String, String>> dlist = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Map<String, String> dataMap = new HashMap<>();
            for (String name : mapname) {
                dataMap.put(name, jsonObject.get(name).toString());
            }
            dlist.add(dataMap);
        }
        return dlist;
    }
}
