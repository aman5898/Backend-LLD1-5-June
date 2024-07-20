package PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> students = new HashMap<>();


    public void register(String key,Student s){
        students.put(key,s);
    }

    public Student get(String key){
        return students.get(key).Copy();
    }
}
