package languageModerator.outputs;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Map;

public class ChangeSpelling implements Outputs{

    Map<String, List<String>> res;
    private String name;
    FileWriter fw;

    public ChangeSpelling(String n){
        name = n;
        res = new HashMap<>();
    }

    public Map<String, List<String>> getResult(){
        return res;
    }
    @Override
    public void storeToFiles(){
 

    }
}