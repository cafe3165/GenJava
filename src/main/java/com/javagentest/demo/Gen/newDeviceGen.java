package com.javagentest.demo.Gen;

import com.javagentest.demo.util.readJson;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Author:cafe3165
 * Date:2020-04-10
 */
public class newDeviceGen {
    private static final String TEMPLATE_PATH = "src/main/java/com/javagentest/demo/templates";
    private static final String CLASS_PATH = "src/main/java/com/javagentest/demo/Proxy";
    public static void gen(String type) throws IOException, TemplateException {
        String tmplname, configpath;
        if (type.equals("Config")) {
            configpath = "src/main/java/com/javagentest/demo/Config/DevicesConfig.json";
            tmplname = "Config";
        } else {
            tmplname = type;
            configpath = "src/main/java/com/javagentest/demo/Config/" + type + "Config.json";
        }
        String pkgname = type.equals("Devices") ? "device" : "runtime";

        List<String> mapname = new ArrayList<>();
        mapname.add("classPath");
        mapname.add("className");
        mapname.add("attribute");
        mapname.add("IncreaseFunc");
        mapname.add("ReduceFunc");
        if (type.equals("Config")) {
            pkgname = "device";
            mapname.add("Type");
        }
        List<Map<String, String>> dl = readJson.read(mapname, configpath);
        for (Map<String, String> dataMap : dl) {
            Gen(dataMap, tmplname, pkgname);
        }
    }

    public static void Gen(Map<String, String> dataMap, String templatesName, String packageName) throws IOException, TemplateException {
        Configuration configuration = new Configuration();
        configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
        Template template = configuration.getTemplate(templatesName + ".ftl");
        String impl = "";
        if (templatesName.equals("DevicesInterfacesImpl")) {
            impl = "Impl";
        }
        File docFile;
        if (templatesName.equals("Config")) {
            docFile = new File(CLASS_PATH + "\\" + "DeviceConfig" + "\\" + "Config" + dataMap.get("Type") + ".java");
        } else {
            docFile = new File(CLASS_PATH + "\\" + packageName + "\\" + dataMap.get("className") + impl + ".java");
        }
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
        template.process(dataMap, out);
    }
}
