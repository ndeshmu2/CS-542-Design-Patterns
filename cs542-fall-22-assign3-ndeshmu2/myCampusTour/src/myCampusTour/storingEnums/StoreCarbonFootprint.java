package myCampusTour.storingEnums;

import javax.xml.ws.handler.HandlerResolver;

public enum StoreCarbonFootprint {
    BUS_RIDE(0.5),
    ON_FOOT(0.0),
    CS542(0.0),
    CS540(0.2),
    CIW(0.04),
    MOUNTAINVIEW(0.05),
    EVENT_CENTER(0.07),
    UNIVERSITY_UNION(0.08),
    SCHOOL_OF_MANAGEMENT(0.1),
    WATSON_COLLEGE_OF_ENGINEERING(0.25),
    HARPUR_COLLEGE_OF_ARTS(0.13),
    DECKER_COLLEGE_OF_NURSING(0.19);
    
    private double carbon;

    private StoreCarbonFootprint(double carbonFootprint){
        carbon = carbonFootprint;
    }

    public double getCarbonFootprint(){
        return carbon;
    }
}