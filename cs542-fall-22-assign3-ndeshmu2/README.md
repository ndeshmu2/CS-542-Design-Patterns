# cs542-fall-22-assign3

## Name: Ninad Deshmukh

-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in myCampusTour/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile myCampusTour/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile myCampusTour/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile myCampusTour/src/build.xml run -Darg0=<bstError.txt> -Darg1=<UPDATE_VALUE> 

## you can run it in the following manner:

ant -buildfile myCampusTour/src/build.xml run -Darg0=error.txt -Darg1=1

Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:

This code can be used to build a Campus tour at Binghamton University. The tour consists of visiting two buildings, picking a gift, having lunch and attending lecture. The options can be selected for these in the driver code. This code also calculates effort in calories, carbon footprint in tonnes, cost in dollars and time taken in minutes for the selected tour. I have used enums to store values, created separate interface for each activity and also to calculate effort, carbon footprint, cost and time, and implemented using builder pattern.

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

Date: 11/18/2022

I am using 1 slack day.



