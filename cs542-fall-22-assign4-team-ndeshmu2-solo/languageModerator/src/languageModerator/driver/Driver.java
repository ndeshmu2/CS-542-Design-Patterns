package languageModerator.driver;

import java.io.FileNotFoundException;
import java.io.IOException;

import languageModerator.visitor.CheckSpelling;
import languageModerator.visitor.KMostFrequentWords;
import languageModerator.visitor.Visitor;
import languageModerator.file.ProcessFile;
import languageModerator.getMembers.Members;
import languageModerator.getMembers.MyArrayList;
import languageModerator.getMembers.MyMembers;
import languageModerator.outputs.ChangeSpelling;
import languageModerator.outputs.KMostFrequentWordsStoring;
import languageModerator.outputs.Outputs;
import languageModerator.util.MyLogger.DebugLevel;

public class Driver{
    private static final DebugLevel debuglevel = DebugLevel.NONE;

    private static void doCheck(ProcessFile f1, Visitor... visitors){
        Members arrayList = new MyArrayList.Create().holdFp(f1).create();


        for(Visitor v1 : visitors){
            arrayList.receive(v1);
        }
    }

    private static void getRes(Outputs... fR){
        for(Outputs r1 : fR){
            r1.storeToFiles();
        }
    }
    public static void main(String[] args) throws Exception{
        

        /*
        * As the build.xml specifies the arguments as argX, in case the
        * argument value is not given java takes the default value specified in
        * build.xml. To avoid that, below condition is used
        */
        try{
            if (args.length != 6 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}") || args[3].equals("${arg3}") || args[4].equals("${arg4}") || args[5].equals("${arg5}")) {

                System.err.println("Error: Incorrect number of arguments. Program accepts 6 argumnets.");
                //System.err.println("Incorrect input for k");
                System.exit(0);
                }
        }catch (NumberFormatException e){
            System.err.println("Incorrect value of K");
        } catch (Exception e){
            System.err.println("Found an exception in Driver class");
        } finally{

        }
        System.out.println("Hello World! Lets get started with the assignment");

        ProcessFile file = new ProcessFile(args[0]);
        Outputs KFreqWords = new KMostFrequentWordsStoring(args[3]);
        Visitor getKFreqWords = new KMostFrequentWords(args[2], KFreqWords);
        Outputs chgSpell = new ChangeSpelling(args[4]);
        Visitor britishToAmerican = new CheckSpelling(args[1], chgSpell);

        doCheck(file, getKFreqWords, britishToAmerican);
        getRes(KFreqWords, chgSpell);

        System.out.println("Completed!");

    }
}