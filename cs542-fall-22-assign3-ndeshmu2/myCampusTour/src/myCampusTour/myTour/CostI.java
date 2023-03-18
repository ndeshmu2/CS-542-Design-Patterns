package myCampusTour.myTour;
import myCampusTour.storingEnums.AttendingLectureEnum;
import myCampusTour.storingEnums.BuildingsEnum;
import myCampusTour.storingEnums.CafeteriaForLunchEnum;
import myCampusTour.storingEnums.PickingGiftEnum;
import myCampusTour.storingEnums.MethodToVisitEnum;

public interface CostI {
    public double calCostLecture(AttendingLectureEnum lect);

    public double calCostBuilding1(BuildingsEnum building1);

    public double calCostBuilding2(BuildingsEnum building2);

    public double calCostLunch(CafeteriaForLunchEnum cafes);

    public double calCostGift(PickingGiftEnum shop);

    public double calCostVisitingMethod(MethodToVisitEnum method);
}
