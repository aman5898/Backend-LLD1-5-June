package MethodReferencing.Q1Session;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {


    private static volatile FileBasedConfigurationManagerImpl instance = null;

    private FileBasedConfigurationManagerImpl() {}

    @Override
    public String getConfiguration(String key) {
        return this.properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String value = this.properties.getProperty(key);

        return this.convert(value,type);
    }

    @Override
    public void setConfiguration(String key, String value) {
        this.properties.setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        this.properties.setProperty(key, value.toString());
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        this.properties.remove(key);
    }

    @Override
    public void clear() {
        this.properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        if(instance==null){
            synchronized (FileBasedConfigurationManagerImpl.class){
                if(instance==null){
                    instance = new FileBasedConfigurationManagerImpl();
                }
            }
        }

        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

}

//Implement the following methods for configuration management in your extended class:
//
//String getConfiguration(String key): Retrieve a configuration value based on a given key.
//<T> T getConfiguration(String key, Class<T> type): Retrieve a configuration value and perform type conversion.
//void setConfiguration(String key, String value): Set a configuration value.
//<T> void setConfiguration(String key, T value): Set a configuration value with type checking.
//void removeConfiguration(String key): Remove a configuration value based on a given key.
//void clear(): Clear all configuration settings.