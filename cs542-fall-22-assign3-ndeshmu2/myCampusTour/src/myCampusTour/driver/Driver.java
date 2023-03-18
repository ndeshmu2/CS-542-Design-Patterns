package myCampusTour.driver;

import myCampusTour.storingEnums.AttendingLectureEnum;
import myCampusTour.storingEnums.BuildingsEnum;
import myCampusTour.storingEnums.CafeteriaForLunchEnum;
import myCampusTour.storingEnums.PickingGiftEnum;
import myCampusTour.storingEnums.MethodToVisitEnum;
import myCampusTour.builderWorkshop.BuilderWorkshopI;
import myCampusTour.builderWorkshop.CampusTourWorkshop;
import myCampusTour.builderWorkshop.CreatingCampusTourWorkshop;
import myCampusTour.builderWorkshop.UniCampusTour;

/**
 * @author placeholder
 *
 */
public class Driver {
	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

	    if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
			System.exit(0);
		}
		
		System.out.println("Hello World! Lets get started with the assignment");

		UniCampusTour tour = new CreatingCampusTourWorkshop(AttendingLectureEnum.CS542, BuildingsEnum.DECKER_COLLEGE_OF_NURSING, BuildingsEnum.WATSON_COLLEGE_OF_ENGINEERING, CafeteriaForLunchEnum.CIW, PickingGiftEnum.UNIVERSITY_UNION, MethodToVisitEnum.ON_FOOT);
		BuilderWorkshopI build = new CampusTourWorkshop();
		build.construct(tour);
		System.out.println(tour);
	}
}
