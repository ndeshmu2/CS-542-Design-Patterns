package myCampusTour.storingEnums;

import javax.xml.ws.handler.HandlerResolver;

public enum StoreDuration {
    BUS_RIDE(30),
    ON_FOOT(100),
    CS542(60),
    CS540(60),
    CIW(15),
    MOUNTAINVIEW(20),
    EVENT_CENTER(25),
    UNIVERSITY_UNION(35),
    SCHOOL_OF_MANAGEMENT(12),
    WATSON_COLLEGE_OF_ENGINEERING(15),
    HARPUR_COLLEGE_OF_ARTS(16),
    DECKER_COLLEGE_OF_NURSING(18);
    
    private int time;

    private StoreDuration(int timeTaken){
        time = timeTaken;
    }

    public int getTime(){
        return time;
    }
}