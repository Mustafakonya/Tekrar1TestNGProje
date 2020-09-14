package com.techproed.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {

    static Properties properties;

    static {
        String path = "/Users/admin/IdeaProjects/Tekrar1TestNGProje/configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {

        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
        
    }
}
