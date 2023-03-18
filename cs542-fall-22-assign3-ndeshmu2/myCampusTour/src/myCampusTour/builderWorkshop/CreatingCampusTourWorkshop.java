package myCampusTour.builderWorkshop;

import java.time.Duration;

import myCampusTour.myTour.CarbonFootprintI;
import myCampusTour.myTour.CostI;
import myCampusTour.myTour.DurationI;
import myCampusTour.myTour.EffortI;
import myCampusTour.myTour.Values;
import myCampusTour.storingEnums.AttendingLectureEnum;
import myCampusTour.storingEnums.BuildingsEnum;
import myCampusTour.storingEnums.CafeteriaForLunchEnum;
import myCampusTour.storingEnums.PickingGiftEnum;
import myCampusTour.storingEnums.MethodToVisitEnum;

public class CreatingCampusTourWorkshop extends UniCampusTour{

    private int final_time;
    private int final_effort;
    private double final_carbon_fotprint;
    private double final_cost;

    private AttendingLectureEnum attendinglectureenum;
    private BuildingsEnum buildingsenum1;
    private BuildingsEnum buildingsenum2;
    private CafeteriaForLunchEnum cafeteriaforlunchenum;
    private PickingGiftEnum pickinggiftenum;
    private MethodToVisitEnum methodtovisitenum;

    private CarbonFootprintI CO2_val = new Values();
    private CostI cost_val = new Values();
    private DurationI time_val = new Values();
    private EffortI effort_val = new Values();

    public CreatingCampusTourWorkshop(AttendingLectureEnum attend_lecture, BuildingsEnum see_building1, BuildingsEnum see_building2, CafeteriaForLunchEnum lunch, PickingGiftEnum pick_gift, MethodToVisitEnum method_to_visit){

            setValues(attend_lecture, see_building1, see_building2, lunch, pick_gift, method_to_visit);
    }

    public void visitBuilding1(){

        final_time = final_time + time_val.calTimeBuilding1(buildingsenum1);
        final_effort = final_effort + effort_val.calEffortBuilding1(buildingsenum1);
        final_carbon_fotprint = final_carbon_fotprint + CO2_val.calCO2Building1(buildingsenum1);
        final_cost = final_cost + cost_val.calCostBuilding1(buildingsenum1);
    }
    public void visitBuilding2(){

        final_time = final_time + time_val.calTimeBuilding2(buildingsenum2);
        final_effort = final_effort + effort_val.calEffortBuilding2(buildingsenum2);
        final_carbon_fotprint = final_carbon_fotprint + CO2_val.calCO2Building2(buildingsenum2);
        final_cost = final_cost + cost_val.calCostBuilding2(buildingsenum2);
    }

    public void pickGift(){

        final_time = final_time + time_val.calTimeGift(pickinggiftenum);
        final_effort = final_effort + effort_val.calEffortGift(pickinggiftenum);
        final_carbon_fotprint = final_carbon_fotprint + CO2_val.calCO2Gift(pickinggiftenum);
        final_cost = final_cost + cost_val.calCostGift(pickinggiftenum);
    }

    public void selectCafeForLunch(){

        final_time = final_time + time_val.calTimeLunch(cafeteriaforlunchenum);
        final_effort = final_effort + effort_val.calEffortLunch(cafeteriaforlunchenum);
        final_carbon_fotprint = final_carbon_fotprint + CO2_val.calCO2Lunch(cafeteriaforlunchenum);
        final_cost = final_cost + cost_val.calCostLunch(cafeteriaforlunchenum);
    }

    public void attendALecture(){

        final_time = final_time + time_val.calTimeLecture(attendinglectureenum);
        final_effort = final_effort + effort_val.calEffortLecture(attendinglectureenum);
        final_carbon_fotprint = final_carbon_fotprint + CO2_val.calCO2Lecture(attendinglectureenum);
        final_cost = final_cost + cost_val.calCostLecture(attendinglectureenum);

    }

    public void wayToVisit(){

        final_time = final_time + time_val.calTimeVisitingMethod(methodtovisitenum);
        final_effort = final_effort + effort_val.calEffortVisitingMethod(methodtovisitenum);
        final_carbon_fotprint = final_carbon_fotprint + CO2_val.calCO2VisitingMethod(methodtovisitenum);
        final_cost = final_cost + cost_val.calCostVisitingMethod(methodtovisitenum);
    }

    public String toString() {

        String toString = "The Choices you selected are:";
        if(methodtovisitenum == MethodToVisitEnum.BUS_RIDE){
            toString = toString + "\nTo visit Buildings you selected: bus-ride";
        }
        else{
            toString = toString + "\nTo visit Buildings you selected: on-foot";
        }

        toString = toString + "\nVisiting First Building: " + buildingsenum1 + "  " + " Visiting Second Building: " + buildingsenum2;

        if(cafeteriaforlunchenum == CafeteriaForLunchEnum.CIW){
            toString = toString + "\nSelected Cafe for Lunch: College in the Woods";
        }
        else{
            toString = toString + "\nSelected Cafe for Lunch: Mountainview";
        }

        if(pickinggiftenum == PickingGiftEnum.EVENT_CENTER){
            toString = toString + "\nSelected place for picking gift is: Event Center";
        }
        else{
            toString = toString + "\nSelected place for picking gift is: University Union";
        }

        if(attendinglectureenum == AttendingLectureEnum.CS540){
            toString = toString + "\nSelected way of attending lecture is: Video Streaming of CS540";
        }
        else{
            toString = toString + "\nSelected way of attending lecture is: Offline lecture of CS542";
        }

        toString = toString + "\nThe total Duration of tour is -: " + final_time;
        toString = toString + "\nThe carbon footprint of the tour is -: " + final_carbon_fotprint + " tonnes";
        toString = toString + "\nThe effort take for the tour is -: " + final_effort + " calories";
        toString = toString + "\nThe total cost of the tour is -: " + "$" + final_cost;

        return toString;
        
    }

    public void setValues(AttendingLectureEnum lect, BuildingsEnum building1, BuildingsEnum building2, CafeteriaForLunchEnum cafes, PickingGiftEnum shop, MethodToVisitEnum method){

        attendinglectureenum = lect;
        buildingsenum1 = building1;
        buildingsenum2 = building2;
        cafeteriaforlunchenum = cafes;
        pickinggiftenum = shop;
        methodtovisitenum = method;
    }

}