package myCampusTour.builderWorkshop;

import myCampusTour.campusTourPlan.AttendingLecture;
import myCampusTour.campusTourPlan.CafeteriaForLunch;
import myCampusTour.campusTourPlan.PickingGift;
import myCampusTour.campusTourPlan.VisitingBuildings;
import myCampusTour.campusTourPlan.WayOfVisiting;
import myCampusTour.storingEnums.AttendingLectureEnum;
import myCampusTour.storingEnums.BuildingsEnum;
import myCampusTour.storingEnums.CafeteriaForLunchEnum;
import myCampusTour.storingEnums.PickingGiftEnum;
import myCampusTour.storingEnums.MethodToVisitEnum;

public abstract class UniCampusTour implements AttendingLecture,CafeteriaForLunch,PickingGift,VisitingBuildings,WayOfVisiting{

    public abstract void setValues(AttendingLectureEnum lect, BuildingsEnum building1, BuildingsEnum building2,CafeteriaForLunchEnum cafes, PickingGiftEnum shop, MethodToVisitEnum method);
}

