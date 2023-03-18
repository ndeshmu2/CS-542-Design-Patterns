package myCampusTour.myTour;

import myCampusTour.storingEnums.AttendingLectureEnum;
import myCampusTour.storingEnums.BuildingsEnum;
import myCampusTour.storingEnums.CafeteriaForLunchEnum;
import myCampusTour.storingEnums.PickingGiftEnum;
import myCampusTour.storingEnums.StoreCarbonFootprint;
import myCampusTour.storingEnums.StoreCost;
import myCampusTour.storingEnums.StoreDuration;
import myCampusTour.storingEnums.StoreEffort;
import myCampusTour.storingEnums.MethodToVisitEnum;

public class Values implements CarbonFootprintI,CostI,DurationI,EffortI {

    //effort
    public int calEffortLecture(AttendingLectureEnum lect) {

        if(AttendingLectureEnum.CS540 == lect)
            return StoreEffort.CS540.getEffort();
        else
            return StoreEffort.CS542.getEffort();
    }

    public int calEffortBuilding1(BuildingsEnum building1) {

        if(BuildingsEnum.SCHOOL_OF_MANAGEMENT == building1){
            return StoreEffort.SCHOOL_OF_MANAGEMENT.getEffort();
        }
        else if (BuildingsEnum.DECKER_COLLEGE_OF_NURSING == building1){
            return StoreEffort.DECKER_COLLEGE_OF_NURSING.getEffort();
        }
        else if (BuildingsEnum.HARPUR_COLLEGE_OF_ARTS == building1){
            return StoreEffort.DECKER_COLLEGE_OF_NURSING.getEffort();
        }
        else if (BuildingsEnum.WATSON_COLLEGE_OF_ENGINEERING == building1){
            return StoreEffort.WATSON_COLLEGE_OF_ENGINEERING.getEffort();
        }
        return 0;
    }

    public int calEffortBuilding2(BuildingsEnum building2) {

        if(BuildingsEnum.SCHOOL_OF_MANAGEMENT == building2){
            return StoreEffort.SCHOOL_OF_MANAGEMENT.getEffort();
        }
        else if (BuildingsEnum.DECKER_COLLEGE_OF_NURSING == building2){
            return StoreEffort.DECKER_COLLEGE_OF_NURSING.getEffort();
        }
        else if (BuildingsEnum.HARPUR_COLLEGE_OF_ARTS == building2){
            return StoreEffort.DECKER_COLLEGE_OF_NURSING.getEffort();
        }
        else if (BuildingsEnum.WATSON_COLLEGE_OF_ENGINEERING == building2){
            return StoreEffort.WATSON_COLLEGE_OF_ENGINEERING.getEffort();
        }
        return 0;
    }

    public int calEffortLunch(CafeteriaForLunchEnum cafes){

        if(CafeteriaForLunchEnum.CIW == cafes)
            return StoreEffort.CIW.getEffort();
        else
            return StoreEffort.MOUNTAINVIEW.getEffort();
    }

    public int calEffortGift(PickingGiftEnum shop){

        if(PickingGiftEnum.EVENT_CENTER == shop)
            return StoreEffort.EVENT_CENTER.getEffort();
        else    
            return StoreEffort.UNIVERSITY_UNION.getEffort();
    }

    public int calEffortVisitingMethod(MethodToVisitEnum method){

        if(MethodToVisitEnum.BUS_RIDE == method)
            return StoreEffort.BUS_RIDE.getEffort();
        else
            return StoreEffort.ON_FOOT.getEffort();
    }

    //cost
    public double calCostLecture(AttendingLectureEnum lect) {

        if(AttendingLectureEnum.CS540 == lect)
            return StoreCost.CS540.getCost();
        else
            return StoreCost.CS542.getCost();
    }

    public double calCostBuilding2(BuildingsEnum building2) {

        if(BuildingsEnum.SCHOOL_OF_MANAGEMENT == building2){
            return StoreCost.SCHOOL_OF_MANAGEMENT.getCost();
        }
        else if (BuildingsEnum.DECKER_COLLEGE_OF_NURSING == building2){
            return StoreCost.DECKER_COLLEGE_OF_NURSING.getCost();
        }
        else if (BuildingsEnum.HARPUR_COLLEGE_OF_ARTS == building2){
            return StoreCost.DECKER_COLLEGE_OF_NURSING.getCost();
        }
        else if (BuildingsEnum.WATSON_COLLEGE_OF_ENGINEERING == building2){
            return StoreCost.WATSON_COLLEGE_OF_ENGINEERING.getCost();
        }
        return 0.0;
    }

    public double calCostBuilding1(BuildingsEnum building1) {

        if(BuildingsEnum.SCHOOL_OF_MANAGEMENT == building1){
            return StoreCost.SCHOOL_OF_MANAGEMENT.getCost();
        }
        else if (BuildingsEnum.DECKER_COLLEGE_OF_NURSING == building1){
            return StoreCost.DECKER_COLLEGE_OF_NURSING.getCost();
        }
        else if (BuildingsEnum.HARPUR_COLLEGE_OF_ARTS == building1){
            return StoreCost.DECKER_COLLEGE_OF_NURSING.getCost();
        }
        else if (BuildingsEnum.WATSON_COLLEGE_OF_ENGINEERING == building1){
            return StoreCost.WATSON_COLLEGE_OF_ENGINEERING.getCost();
        }
        return 0.0;
    }

    public double calCostLunch(CafeteriaForLunchEnum cafes){

        if(CafeteriaForLunchEnum.CIW == cafes)
            return StoreCost.CIW.getCost();
        else
            return StoreCost.MOUNTAINVIEW.getCost();
    }

    public double calCostGift(PickingGiftEnum shop){

        if(PickingGiftEnum.EVENT_CENTER == shop)
            return StoreCost.EVENT_CENTER.getCost();
        else    
            return StoreCost.UNIVERSITY_UNION.getCost();
    }

    public double calCostVisitingMethod(MethodToVisitEnum method){

        if(MethodToVisitEnum.BUS_RIDE == method)
            return StoreCost.BUS_RIDE.getCost();
        else
            return StoreCost.ON_FOOT.getCost();
    }

    //duration
    public int calTimeLecture(AttendingLectureEnum lect) {

        if(AttendingLectureEnum.CS540 == lect)
            return StoreDuration.CS540.getTime();
        else
            return StoreDuration.CS542.getTime();
    }

    public int calTimeBuilding1(BuildingsEnum building1) {

        if(BuildingsEnum.SCHOOL_OF_MANAGEMENT == building1){
            return StoreDuration.SCHOOL_OF_MANAGEMENT.getTime();
        }
        else if (BuildingsEnum.DECKER_COLLEGE_OF_NURSING == building1){
            return StoreDuration.DECKER_COLLEGE_OF_NURSING.getTime();
        }
        else if (BuildingsEnum.HARPUR_COLLEGE_OF_ARTS == building1){
            return StoreDuration.DECKER_COLLEGE_OF_NURSING.getTime();
        }
        else if (BuildingsEnum.WATSON_COLLEGE_OF_ENGINEERING == building1){
            return StoreDuration.WATSON_COLLEGE_OF_ENGINEERING.getTime();
        }
        return 0;
    }

    public int calTimeBuilding2(BuildingsEnum building2) {

        if(BuildingsEnum.SCHOOL_OF_MANAGEMENT == building2){
            return StoreDuration.SCHOOL_OF_MANAGEMENT.getTime();
        }
        else if (BuildingsEnum.DECKER_COLLEGE_OF_NURSING == building2){
            return StoreDuration.DECKER_COLLEGE_OF_NURSING.getTime();
        }
        else if (BuildingsEnum.HARPUR_COLLEGE_OF_ARTS == building2){
            return StoreDuration.DECKER_COLLEGE_OF_NURSING.getTime();
        }
        else if (BuildingsEnum.WATSON_COLLEGE_OF_ENGINEERING == building2){
            return StoreDuration.WATSON_COLLEGE_OF_ENGINEERING.getTime();
        }
        return 0;
    }

    public int calTimeLunch(CafeteriaForLunchEnum cafes){

        if(CafeteriaForLunchEnum.CIW == cafes)
            return StoreDuration.CIW.getTime();
        else
            return StoreDuration.MOUNTAINVIEW.getTime();
    }

    public int calTimeGift(PickingGiftEnum shop){

        if(PickingGiftEnum.EVENT_CENTER == shop)
            return StoreDuration.EVENT_CENTER.getTime();
        else    
            return StoreDuration.UNIVERSITY_UNION.getTime();
    }

    public int calTimeVisitingMethod(MethodToVisitEnum method){

        if(MethodToVisitEnum.BUS_RIDE == method)
            return StoreDuration.BUS_RIDE.getTime();
        else
            return StoreDuration.ON_FOOT.getTime();
    }

    //carbon_footprint
    public double calCO2Lecture(AttendingLectureEnum lect) {

        if(AttendingLectureEnum.CS540 == lect)
            return StoreCarbonFootprint.CS540.getCarbonFootprint();
        else
            return StoreCarbonFootprint.CS542.getCarbonFootprint();
    }

    public double calCO2Building1(BuildingsEnum building1) {

        if(BuildingsEnum.SCHOOL_OF_MANAGEMENT == building1){
            return StoreCarbonFootprint.SCHOOL_OF_MANAGEMENT.getCarbonFootprint();
        }
        else if (BuildingsEnum.DECKER_COLLEGE_OF_NURSING == building1){
            return StoreCarbonFootprint.DECKER_COLLEGE_OF_NURSING.getCarbonFootprint();
        }
        else if (BuildingsEnum.HARPUR_COLLEGE_OF_ARTS == building1){
            return StoreCarbonFootprint.DECKER_COLLEGE_OF_NURSING.getCarbonFootprint();
        }
        else if (BuildingsEnum.WATSON_COLLEGE_OF_ENGINEERING == building1){
            return StoreCarbonFootprint.WATSON_COLLEGE_OF_ENGINEERING.getCarbonFootprint();
        }
        return 0;
    }

    public double calCO2Building2(BuildingsEnum building2) {

        if(BuildingsEnum.SCHOOL_OF_MANAGEMENT == building2){
            return StoreCarbonFootprint.SCHOOL_OF_MANAGEMENT.getCarbonFootprint();
        }
        else if (BuildingsEnum.DECKER_COLLEGE_OF_NURSING == building2){
            return StoreCarbonFootprint.DECKER_COLLEGE_OF_NURSING.getCarbonFootprint();
        }
        else if (BuildingsEnum.HARPUR_COLLEGE_OF_ARTS == building2){
            return StoreCarbonFootprint.DECKER_COLLEGE_OF_NURSING.getCarbonFootprint();
        }
        else if (BuildingsEnum.WATSON_COLLEGE_OF_ENGINEERING == building2){
            return StoreCarbonFootprint.WATSON_COLLEGE_OF_ENGINEERING.getCarbonFootprint();
        }
        return 0;
    }

    public double calCO2Lunch(CafeteriaForLunchEnum cafes){

        if(CafeteriaForLunchEnum.CIW == cafes)
            return StoreCarbonFootprint.CIW.getCarbonFootprint();
        else
            return StoreCarbonFootprint.MOUNTAINVIEW.getCarbonFootprint();
    }

    public double calCO2Gift(PickingGiftEnum shop){

        if(PickingGiftEnum.EVENT_CENTER == shop)
            return StoreCarbonFootprint.EVENT_CENTER.getCarbonFootprint();
        else    
            return StoreCarbonFootprint.UNIVERSITY_UNION.getCarbonFootprint();
    }

    public double calCO2VisitingMethod(MethodToVisitEnum method){

        if(MethodToVisitEnum.BUS_RIDE == method)
            return StoreCarbonFootprint.BUS_RIDE.getCarbonFootprint();
        else
            return StoreCarbonFootprint.ON_FOOT.getCarbonFootprint();
    }

}