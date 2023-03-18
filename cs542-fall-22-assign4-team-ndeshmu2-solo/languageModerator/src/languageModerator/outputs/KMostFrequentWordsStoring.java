package languageModerator.outputs;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class KMostFrequentWordsStoring implements Outputs{

    private String name;
    private List<List<String>> str;
    FileWriter f1;


    private KMostFrequentWordsStoring()
    {

    }

    public KMostFrequentWordsStoring(String s){

        name = s;
        str = new ArrayList<>();

    }

    public void storeStr(List<String> a1){
        str.add(a1);
    }

    @Override
    public void storeToFiles(){
        try{
            f1 = new FileWriter(name, false);
            //BufferedWriter w1 = new BufferedWriter(f1);
            for(List<String> s1 : str)
            {   
                //System.out.println(s1);
                for(String s2 : s1){
                    f1.write(s2);
                    f1.write("\n");
                }
                //f1.write(Arrays.toString(s1.toArray()));
                //f1.write(System.lineSeparator());
            }
            f1.close();
        }catch(IOException e){
            System.err.println("Exception: ");
            e.printStackTrace();
        }finally{
            
        }
        //f1.close();

    }
}