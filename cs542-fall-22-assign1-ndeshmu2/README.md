# CSX42: Assignment 1
## Name: Ninad Deshmukh

-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in studentCoursesBackup/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile studentCoursesBackup/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile studentCoursesBackup/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile studentCoursesBackup/src/build.xml run -Darg0=coursePrefs.txt -Darg1=courseInfo.txt -Darg2=regResults.txt -Darg3=regConflicts.txt -Darg3=errorLog.txt>

Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:

I made two classes Student and Course for this project.
Student should have information for preference courses and selected courses.
So I selected ArrayList structure for them.
ArrayList has low time complexity o(n) and allows student class to add course and get course quickly.
I process several students by using ArrayList of Student.
So I can easily access to any student quickly.

For the course,it is different from student.
It should be possible to get the capacity, number of assigned students and class time for any course by name quickly.
So I selected the HashMap structure to get them by name quickly.
It has O(log(n)) complexity so it is very quick to get and put elements.

Fo writing the output into .txt files, I have used FileOutputStream.

PS-: I am using all three strike days in this assignment as it took me time to execute all things being a beginner in Java programming.

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.""

Date: 10/01/2022 


