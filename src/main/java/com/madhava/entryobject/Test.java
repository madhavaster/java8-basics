package com.madhava.entryobject;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("1", new Student("1", "Hemanth", "hyderabad"));
        studentMap.put("2", new Student("2", "Manas", "hyderabad"));
        studentMap.put("3", new Student("3", "Madhav", "hyderabad"));
        studentMap.put("4", new Student("4", "Swapna", "hyderabad"));

        var studentsEntrySet = studentMap.entrySet();

        studentsEntrySet.forEach(entry -> {
            String key = entry.getKey();
            Student student = entry.getValue();
            System.out.println(student);
        });
    }
}
