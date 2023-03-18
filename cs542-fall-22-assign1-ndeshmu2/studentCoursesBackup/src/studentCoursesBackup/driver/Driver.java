package studentCoursesBackup.driver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileOutputStream; 

/**
 * @author placeholder
 *
 */
public class Driver {
	public static void main(String[] args) throws FileNotFoundException {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

	    if (args.length != 5 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")
				|| args[3].equals("${arg3}") || args[4].equals("${arg4}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 5 argumnets.");
			System.exit(0);
		}
		
		System.out.println("Hello World! Lets get started with the assignment");

		ArrayList<Student> students = new ArrayList<Student>();
        Course course = new Course();
        //file input for coursePref add_student,.
        File file1 = new File(args[1]);
        File file2 = new File(args[0]);
        //file input for courseInfo and set add couse.
        Scanner sc = new Scanner(file1);

        int idx = 0,idx1 = 0;
        while (sc.hasNextLine()){
            String cmd = sc.nextLine();
            String[] cmdArray = cmd.split(":");
            course.addCourse(cmdArray[0],Integer.valueOf(cmdArray[1]), Integer.valueOf(cmdArray[2]));
        }

        Scanner sc1 = new Scanner(file2);
        while (sc1.hasNextLine()){
            String cmd = sc1.nextLine();
            String[] cmdArray = cmd.split(" ");
            ArrayList<String> courseList = new ArrayList<>(Arrays.asList(cmdArray));
            courseList.remove(0);
            Student student = new Student(Integer.valueOf(cmdArray[0]),courseList);
            students.add(student);

            String crs,crs1;
            boolean isComplete = false;
            idx = 0;
            while (courseList.size()>idx){
                if(course.isComplete()) {
                    //course finished
                    String errLog = "Course is already Full.";
                    try{
                        FileOutputStream error = new FileOutputStream(args[4]);
                        byte b3[]=errLog.getBytes();
                        error.write(b3);
                        error.close();
                }catch(Exception e){System.out.println(e);}
                    isComplete = true;
                    break;
                }
                crs = courseList.get(idx);
                boolean isConflict = false;
                if(course.getCapicity(crs)>course.getCounter(crs)){
                    idx1 = 0;
                    while (student.getCourse().size()>idx1){
                        crs1 = student.getCourse().get(idx1);
                        if(course.getTiming(crs1).intValue() == course.getTiming(crs).intValue()){
                            String conflictText = "Course "+ crs + " is conflict with course " + crs1 + " at " +student.getId();
                            try{
                                FileOutputStream conflict = new FileOutputStream(args[3]);
                                byte b2[]=conflictText.getBytes();
                                conflict.write(b2);
                                conflict.close();
                        }catch(Exception e){System.out.println(e);}
                            isConflict = true;
                            break;
                        }
                        idx1++;
                    }
                    if(!isConflict)
                    {
                        student.applyCourse(crs);
                        course.addStudent(crs,student);
                        if(student.getCourse().size()>=3){
                            break;
                        }
                    }
                }
                idx++;
            }
            if(isComplete) break;

        }
        idx = 0;
        String res="";
        Student st;
        double totoal_satis = 0;
        double average_satis = 0;
        while (students.size()>idx){
            st = students.get(idx);
            idx1 = 0;
            res += String.valueOf(st.getId())+":";
            while (st.getCourse().size()>idx1){
                res = res + st.getCourse().get(idx1);
                if(++idx1<st.getCourse().size()){
                    res = res + ",";
                }
            }
            res = res + "::SatisfactionRating=" + String.valueOf(st.getSatiRating()) + "\n";
            totoal_satis += st.getSatiRating();
            idx++;
        }
        average_satis = Math.round(totoal_satis*10 / students.size())/10.0;
        res += "AverageSatisfactionRating=" + String.valueOf(average_satis);
        try{
            FileOutputStream result = new FileOutputStream(args[2]);
            byte b1[]=res.getBytes();
            result.write(b1);
            result.close();
    }catch(Exception e){System.out.println(e);}
    sc.close();
    sc1.close();
	System.out.println("The output of assignment1 is"+ "\n" + res);

    }

	}

