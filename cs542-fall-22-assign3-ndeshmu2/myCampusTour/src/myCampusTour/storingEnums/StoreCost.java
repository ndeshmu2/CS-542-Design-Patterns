package myCampusTour.storingEnums;

public enum StoreCost{
    BUS_RIDE(3.0),
    ON_FOOT(1.0),
    EVENT_CENTER(13.0),
    UNIVERSITY_UNION(15.0),
    CIW(8.0),
    MOUNTAINVIEW(8.4),
    CS540(10.0),
    CS542(11.0),
    SCHOOL_OF_MANAGEMENT(2.0),
    HARPUR_COLLEGE_OF_ARTS(2.3),
    WATSON_COLLEGE_OF_ENGINEERING(2.5),
    DECKER_COLLEGE_OF_NURSING(2.7);


    private double cost;

    private StoreCost(double reqCost){
        cost = reqCost;
    }

    public double getCost(){
        return cost;
    }
}   