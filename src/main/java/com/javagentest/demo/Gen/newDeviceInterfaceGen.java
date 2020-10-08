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
 *
 * @blame Android Team
 */
public class newDeviceInterfaceGen {
    private static final String TEMPLATE_PATH = "src/main/java/com/javagentest/demo/templates";
    private static final String CLASS_PATH = "src/main/java/com/javagentest/demo/Proxy";
    public static void main(String[] args) throws IOException, TemplateException {
        List<String> mapname=new ArrayList<>();
        mapname.add("classPath");
        mapname.add("className");
        mapname.add("attribute");
        mapname.add("IncreaseFunc");
        mapname.add("ReduceFunc");
        String configpath="src/main/java/com/javagentest/demo/Config/DevicesInterfacesConfig.json";
        List<Map<String, String>> dl = readJson.read(mapname,configpath);

//        for (Map<String, String> dataMap : dl) {
//            String tmplname = "DevicesInterfaces", pkgname = "runtime";
//            Gen(dataMap, tmplname, pkgname);
//        }
//
//    }
//    public static void Gen(Map<String, String> dataMap, String templatesName, String packageName) throws IOException, TemplateException {
//        Configuration configuration = new Configuration();
//        Writer out = null;
//        configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
//        Template template = configuration.getTemplate(templatesName + ".ftl");
//        File docFile = new File(CLASS_PATH + "\\" + packageName + "\\" + dataMap.get("interfaceName") + ".java");
//        out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
//        template.process(dataMap, out);
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^" + dataMap.get("interfaceName") + ".java 文件创建成功 !");
    }

}
