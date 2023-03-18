package languageModerator.getMembers;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.util.ElementScanner6;

import java.io.IOException;

import languageModerator.toIterate.Iterator;
import languageModerator.toIterate.Storing;
import languageModerator.visitor.Visitor;
import languageModerator.file.ProcessFile;


public class MyArrayList implements Members<Visitor>, Storing {

    private List<Members> list1;
    private ProcessFile f1;

    public MyArrayList(Create create){
        this.f1 = create.f1;
        this.list1 = create.list1;
    
    }

    public void receive(Visitor v){
        Iterator t = begin();
        while(t.checkN()){
            Members m = (Members) t.next();
            m.receive(v);
        }
    }

    public Iterator begin(){
        return new LetterCheck();
    }

    private class LetterCheck implements Iterator{
            
        int i;
        String val1;

        public boolean checkN(){
            if(i < list1.size())
                return true;               
            else
                return false;
        }

        public Object next(){
            if(this.checkN())
                return list1.get(i++);
            else
                return null;
        }

        public void delete() {
            throw new UnsupportedOperationException();
        }
    }

    public static class Create{

        private List<Members> list1;
        private ProcessFile f1; 

        public Create (){
            list1 = new ArrayList<>();

        }

        public Create makeFp(ProcessFile f1){
            this.f1 = f1;
            return this;
        }

        public Create holdFp(ProcessFile fileP){
            makeFp(fileP);
            return this;
        }

        public MyArrayList create(){

            try{
                String s = f1.read();
                //String[] lines = s.trim().split("\\.\\s*");
                //for(String l : lines){
                Members m = new MyMembers(s);
                list1.add(m);
                f1.close();
            }catch (IOException e){
                System.err.println("Exception");
                e.printStackTrace();
            }

                //f1.close();
            return new MyArrayList(this);
            
        }
    
    }      

}   