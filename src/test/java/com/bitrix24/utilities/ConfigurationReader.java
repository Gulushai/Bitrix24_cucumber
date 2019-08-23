package com.bitrix24.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    static Properties properties;

    static {
        try{
            String path = "C:/Users/Gulushai/IdeaProjects/birtix24_cucumber/configuration.properties";
            FileInputStream input = new FileInputStream(path);

            properties = new Properties();
            properties.load(input);

            //input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String get(String keyName) {
        return properties.getProperty(keyName);
    }

}
