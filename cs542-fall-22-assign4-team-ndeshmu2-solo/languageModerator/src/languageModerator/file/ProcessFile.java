package languageModerator.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.util.Scanner;

public final class ProcessFile{

    private String s;
    private BufferedReader r1;

    public ProcessFile(String path) throws InvalidPathException, SecurityException, IOException {

        if(!Files.exists(Paths.get(path))){
            throw new FileNotFoundException("invalid input file or incorrect path of file");
        }
        r1 = new BufferedReader(new FileReader(new File(path)));
        s = r1.readLine();

        //File file = new File(path);
        //Scanner input = new Scanner(file); 
        //while(input.hasNextLine()){
            //s = input.nextLine();
        //}
        //input.close();
    }

    public String read() throws IOException {

        if( null == s) 
            return null;
        
        String read1 = s.trim();
        s = r1.readLine();
        return read1;

    }

    public void close() throws IOException{
        try{

            r1.close();
            s = null;
        } catch (IOException e){
            throw new IOException("Not able to close file", e);
        }
    }

}