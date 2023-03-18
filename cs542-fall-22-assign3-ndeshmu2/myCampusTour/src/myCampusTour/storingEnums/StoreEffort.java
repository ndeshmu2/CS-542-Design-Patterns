package myCampusTour.storingEnums;

import javax.xml.ws.handler.HandlerResolver;

public enum StoreEffort {
    BUS_RIDE(50),
    ON_FOOT(400),
    CS542(160),
    CS540(80),
    CIW(110),
    MOUNTAINVIEW(70),
    EVENT_CENTER(140),
    UNIVERSITY_UNION(160),
    SCHOOL_OF_MANAGEMENT(90),
    WATSON_COLLEGE_OF_ENGINEERING(130),
    HARPUR_COLLEGE_OF_ARTS(150),
    DECKER_COLLEGE_OF_NURSING(200);
    
    private int effort;

    private StoreEffort(int effortTaken){
        effort = effortTaken;
    }

    public int getEffort(){
        return effort;
    }
}
