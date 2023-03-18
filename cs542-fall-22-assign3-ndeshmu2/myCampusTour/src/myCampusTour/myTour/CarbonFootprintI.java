package myCampusTour.myTour;
import myCampusTour.storingEnums.AttendingLectureEnum;
import myCampusTour.storingEnums.BuildingsEnum;
import myCampusTour.storingEnums.CafeteriaForLunchEnum;
import myCampusTour.storingEnums.PickingGiftEnum;
import myCampusTour.storingEnums.MethodToVisitEnum;

public interface CarbonFootprintI {

    public double calCO2Lecture(AttendingLectureEnum lect);

    public double calCO2Building1(BuildingsEnum building1);

    public double calCO2Building2(BuildingsEnum building2);

    public double calCO2Lunch(CafeteriaForLunchEnum cafes);

    public double calCO2Gift(PickingGiftEnum shop);

    public double calCO2VisitingMethod(MethodToVisitEnum method);
}
