package studentCoursesBackup.driver;

import java.util.HashMap;
import java.util.Map;

public class Course {
    private HashMap<String, Integer> capacityMap;
    private HashMap<String, Integer> timingMap;
    private HashMap<String, Integer> counterMap;

    public Course(){
        capacityMap = new HashMap<String, Integer>(9);
        timingMap = new HashMap<String, Integer>(9);
        counterMap = new HashMap<String, Integer>(9);
    }

    public void addCourse(String name, Integer cap, Integer time ){
        capacityMap.put(name,cap);
        timingMap.put(name,time);
        counterMap.put(name,0);
    }

    public  void addStudent(String name, Student student){
        counterMap.put(name, counterMap.get(name)+1);
    }

    public Integer getCounter(String name){
        return counterMap.get(name);
    }
    public Integer getCapicity(String name){
        return capacityMap.get(name);
    }

    public Integer getTiming(String name){
        return timingMap.get(name);
    }

    public  Integer getCount(){
        return capacityMap.size();
    }

    public  boolean isComplete(){
        return capacityMap.equals(counterMap);
    }
}