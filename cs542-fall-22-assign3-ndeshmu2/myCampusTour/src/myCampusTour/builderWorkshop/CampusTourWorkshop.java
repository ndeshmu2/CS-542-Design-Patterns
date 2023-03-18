package myCampusTour.builderWorkshop;

import myCampusTour.util.MyLogger;
import myCampusTour.util.MyLogger.DebugLevel;

public class CampusTourWorkshop implements BuilderWorkshopI{

        public void construct(UniCampusTour tour){

            try{

                tour.attendALecture();
                tour.selectCafeForLunch();
                tour.pickGift();
                tour.visitBuilding1();
                tour.visitBuilding2();
                tour.wayToVisit();
            }
            catch(IllegalArgumentException e){
                System.err.println("Incorrect arguments");
                System.exit(0);
            }
            catch(Exception e){
                    System.out.println("program not running");
                    System.exit(0);
        }
        finally{
            
        }
    }

}