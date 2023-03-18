package studentRecordsBackupTree.driver;

import studentRecordsBackupTree.bst.BST;
import studentRecordsBackupTree.bst.Node;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/**
 * @author placeholder
 *
 */
public class Driver {

	static int DEBUG_LEVEL = 0;
    static int UPDATE_VALUE = 0;
	public static void main(String[] args) throws IOException {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

	    if (args.length != 5 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")
				|| args[3].equals("${arg3}") || args[4].equals("${arg4}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 5 argumnets.");
			System.exit(0);
		}
		
		System.out.println("Hello World! Lets get started with the assignment");

        if(args.length < 1) return;
        String inFileName, outFileName, errorFileName;
        inFileName = args[0];

        if(args.length > 1) outFileName = args[1];
        if(args.length > 2) errorFileName = args[2];
        if(args.length > 3) DEBUG_LEVEL = Integer.valueOf(args[3]);
        if(args.length > 4) UPDATE_VALUE = Integer.valueOf(args[4]);

        BST mainTree = new BST();
        BST backup1 = new BST();
        BST backup2 = new BST();

        try{
            File file = new File(inFileName);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String val = scanner.nextLine();
                int id = Integer.valueOf(val);
                Node node = new Node(id);
                Node backnode1 = new Node(id);
                Node backnode2 = new Node(id);

                node.attach(backnode1);
                node.attach(backnode2);

                mainTree.insert(node);
                backup1.insert(backnode1);
                backup2.insert(backnode2);
            }
            scanner.close();
        }catch (FileNotFoundException e){
            System.out.println("The input file does not exist.");
        }

        System.out.print("\nBST: ");
        mainTree.printInorder();

        System.out.print("\nBackup-1: ");
        backup1.printInorder();

        System.out.print("\nBackup-2: ");
        backup2.printInorder();

        System.out.println("\n\nSum of main tree: " + mainTree.calcSum());
        System.out.println("Sum of Backup-1 tree: " + backup1.calcSum());
        System.out.println("Sum of Backup-2 tree: " + backup2.calcSum());

        mainTree.increment(UPDATE_VALUE);

        System.out.println("\nSum of main tree after updating: " + mainTree.calcSum());
        System.out.println("Sum of Backup-1 tree after updating: " + mainTree.calcSum());
        System.out.println("Sum of Backup-2 tree after updating: " + mainTree.calcSum());
    }
		

}
