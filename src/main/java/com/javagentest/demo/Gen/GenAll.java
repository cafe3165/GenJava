package com.javagentest.demo.Gen;

import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * Author:cafe3165
 * Date:2020-04-10
 */
public class GenAll {
    public static void main(String[] args) throws IOException, TemplateException {
        newDeviceGen.gen("Devices");
        newDeviceGen.gen("DevicesInterfaces");
        newDeviceGen.gen("DevicesInterfacesImpl");
        newDeviceGen.gen("Config");
//        implGen.gen("DevicesInterfacesImpl");
    }
}
