package MethodReferencingAndSingleton.Q1Session;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class FileBasedConfigurationManager {

    protected final Properties properties;

    public FileBasedConfigurationManager() {
        this.properties = new Properties();
    }

    public void load(String filePath) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Error while loading configuration file", e);
        }
    }

    public static FileBasedConfigurationManager getInstance() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected static void resetInstance() {

    }

    public abstract String getConfiguration(String key);

    public abstract <T> T getConfiguration(String key, Class<T> type);

    public abstract void setConfiguration(String key, String value);

    public abstract <T> void setConfiguration(String key, T value);

    public abstract void removeConfiguration(String key);

    public abstract void clear();

    protected Properties getProperties() {
        return properties;
    }

    protected <T> T convert(String value, Class<T> type) {
        System.out.println("Converting " + value + " to " + type.getSimpleName());
        switch (type.getSimpleName()) {
            case "Integer":
                return (T) Integer.valueOf(value);
            case "Long":
                return (T) Long.valueOf(value);
            case "Float":
                return (T) Float.valueOf(value);
            case "Double":
                return (T) Double.valueOf(value);
        }
        throw new UnsupportedOperationException("Invalid type: " + type.getSimpleName());
    }

}


//The FileBasedConfigurationManager abstract class provides a foundation for managing configuration settings using a
// file-based approach.
//
//It already has a load method that loads configuration settings from a file and stores it in a Properties object.
// The Properties object is a collection of key-value pairs, where the key is a string and the value is an object.
//
//Implement the following methods for configuration management in your extended class:
//
//String getConfiguration(String key): Retrieve a configuration value based on a given key.
//<T> T getConfiguration(String key, Class<T> type): Retrieve a configuration value and perform type conversion.
//void setConfiguration(String key, String value): Set a configuration value.
//<T> void setConfiguration(String key, T value): Set a configuration value with type checking.
//void removeConfiguration(String key): Remove a configuration value based on a given key.
//void clear(): Clear all configuration settings.