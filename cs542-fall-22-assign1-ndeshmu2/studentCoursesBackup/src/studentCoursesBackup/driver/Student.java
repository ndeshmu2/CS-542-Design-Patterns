package studentCoursesBackup.driver;

import java.util.ArrayList;

public class Student {

    private ArrayList<String> prefCourseList = new ArrayList<>();
    private ArrayList<String> selectedCourseList = new ArrayList<>();
    private Integer studentId;

    public Student(Integer studentID, ArrayList<String> courseList){
        this.studentId = studentID;
        this.prefCourseList = courseList;
    }

    public  void addCourse(String course){
        prefCourseList.add(course);
    }

    public  void applyCourse(String course){
        selectedCourseList.add(course);
    }

    public  ArrayList<String> getPrefCourse(){
        return prefCourseList;
    }
    public ArrayList<String> getCourse(){
        return selectedCourseList;
    }
    public  Integer getId(){
        return this.studentId;
    }

    public double getSatiRating(){
        int idx = 0;
        int totalSati = 0;
        while (this.selectedCourseList.size()>idx){
            totalSati = totalSati + 9 - this.prefCourseList.indexOf(this.selectedCourseList.get(idx)) ;
            idx++;
        }
        return ((totalSati*10)/3)/10.0;
    }
}
