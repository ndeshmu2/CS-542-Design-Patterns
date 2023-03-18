# cs542-fall-22-assign4-team-ndeshmu2-solo

## Name: Ninad Deshmukh

-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in languageModerator/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile languageModerator/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile languageModerator/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile languageModerator/src/build.xml run -Darg0=<inputfile> -Darg1=<BritishToAmerican> -Darg2=<KValue> -Darg3<OutputFileForKFreqWords> -Darg4<OutputFIle> -Darg5<DEBUGVALUE>

## you can run it in the following manner:

ant -buildfile languageModerator/src/build.xml -Darg0="input.txt" -Darg1="BtoA.txt" -Darg2=4 -Darg3="outputKMostFreqWords.txt" -Darg4="output.txt" -Darg5=1 run

Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:

The program accepts 5 inputs, which are input.txt containing sentences, british to english spellings, K value for K most frequent words, output for k most freq words, output file and debug value. The iterator is used to navigate on the arrays of sentences which are present in MyElement. Visitor class is used to visit, the K most freq words of whole file, and converting english spelling to british spelling.

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

Date: 12/10/2022

Using all Slack days



