package com.javagentest.demo;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:cafe3165
 * Date:2020-04-08
 */
public class DevicesGen {

    private static final String TEMPLATE_PATH = "src/main/java/com/javagentest/demo/templates";
    //    private static final String CLASS_PATH = "src/main/java/com/javagentest/demo/Proxy/device";
    private static final String CLASS_PATH = "src/main/java/com/javagentest/demo/Proxy";

    public static void main(String[] args) {
        // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
            // step3 创建数据模型
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("classPath", "com.javagentest.demo.Proxy.device");
            dataMap.put("className", "Gree");
            dataMap.put("attribute", "Temperature");
            dataMap.put("IncreaseFunc", "warm");
            dataMap.put("ReduceFunc", "cool");
            // step4 加载模版文件
            Template template = configuration.getTemplate("Devices.ftl");
            // step5 生成数据
            File docFile = new File(CLASS_PATH + "\\" + dataMap.get("className") + ".java");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            // step6 输出文件
            template.process(dataMap, out);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^User.java 文件创建成功 !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }


    public static void Gen(Map<String, String> dataMap, String templatesName, String packageName) throws IOException, TemplateException {
        Configuration configuration = new Configuration();
        Writer out = null;
        configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
        Template template = configuration.getTemplate(templatesName + ".ftl");
        File docFile = new File(CLASS_PATH + "\\" + packageName + "\\" + dataMap.get("className") + ".java");
        out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
        template.process(dataMap, out);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^" + dataMap.get("className") + ".java 文件创建成功 !");


    }

}
