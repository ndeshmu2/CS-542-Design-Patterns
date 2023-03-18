package languageModerator.visitor;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Map;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import languageModerator.getMembers.Members;
import languageModerator.getMembers.MyMembers;
import languageModerator.outputs.ChangeSpelling;
import languageModerator.outputs.Outputs;
import languageModerator.file.ProcessFile;




public class CheckSpelling implements Visitor{

    private String name;
    Outputs checkWords;
    private ProcessFile file1;
    private List<String> words;
    Map<String, List<String>> res;
    Map<String, String> map;

    public CheckSpelling(String s1, Outputs checkWordIn) {
        name = s1;
        checkWords = checkWordIn;
        words = new ArrayList<>();
        res = new HashMap<>();
        checkFile(name);
    }

    public void checkFile(String name){
    }

    private String[] fetchWords(Members members){
        String[] s3 = ((MyMembers)members).getaLine().split("\\s+");
        return s3;
    }

    @Override
    public void check(Members members){
        doWordCheck(members);
        addWord(res);
    }

    private boolean checkSame(String word1, String word2){

        return false;
    
    }


    private void writeInMap(String s4, String rightWords){
       
    }

    private void doWordCheck(Members members){


    }

    private void addWord(Map<String,List<String>> res){
        ((ChangeSpelling)checkWords).getResult().putAll(res);
    }


}
