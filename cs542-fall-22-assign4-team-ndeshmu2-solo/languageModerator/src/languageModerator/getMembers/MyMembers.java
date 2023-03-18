package languageModerator.getMembers;

import languageModerator.visitor.Visitor;

public class MyMembers implements Members<Visitor>{

    private String aLine;

    private MyMembers(){
    }

    public MyMembers(String c){
        aLine = c;
    }
    @Override
    public void receive(Visitor visitor){
        visitor.check(this);
    }

    public String getaLine(){
        return aLine;
    }
    
    public String giveS(){
        return getaLine();
    }
    
}