package myCampusTour.myTour;
import myCampusTour.storingEnums.AttendingLectureEnum;
import myCampusTour.storingEnums.BuildingsEnum;
import myCampusTour.storingEnums.CafeteriaForLunchEnum;
import myCampusTour.storingEnums.PickingGiftEnum;
import myCampusTour.storingEnums.MethodToVisitEnum;

public interface EffortI {

    public int calEffortLecture(AttendingLectureEnum lect);

    public int calEffortBuilding1(BuildingsEnum building1);

    public int calEffortBuilding2(BuildingsEnum building2);

    public int calEffortLunch(CafeteriaForLunchEnum cafes);

    public int calEffortGift(PickingGiftEnum shop);
    
    public int calEffortVisitingMethod(MethodToVisitEnum method);
}
