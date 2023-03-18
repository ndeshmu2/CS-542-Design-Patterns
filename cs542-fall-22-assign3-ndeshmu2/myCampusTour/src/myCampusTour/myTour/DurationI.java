package myCampusTour.myTour;
import myCampusTour.storingEnums.AttendingLectureEnum;
import myCampusTour.storingEnums.BuildingsEnum;
import myCampusTour.storingEnums.CafeteriaForLunchEnum;
import myCampusTour.storingEnums.PickingGiftEnum;
import myCampusTour.storingEnums.MethodToVisitEnum;

public interface DurationI {

    public int calTimeLecture(AttendingLectureEnum lect);

    public int calTimeBuilding1(BuildingsEnum building1);

    public int calTimeBuilding2(BuildingsEnum building2);

    public int calTimeLunch(CafeteriaForLunchEnum cafes);

    public int calTimeGift(PickingGiftEnum shop);

    public int calTimeVisitingMethod(MethodToVisitEnum method);
}