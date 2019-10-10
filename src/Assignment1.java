/********************************************************************
 * Programmer: Lauren
 * 
 * Class: CS30S
 *
 * Assignment: A1 Q1
 *
 * Description: brief description of program.
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class Assignment1 {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;				  // string data input from keyboard
        String strout;				  // processed info string to be output
        String bannerOut;			  // string to print banner to message dialogs

        String prompt;				  // prompt for use in input dialogs

        String delim = "[ :]+";		          // delimiter string for splitting input string
        String[] tokens;                          // string array for gathering input
        
        String nl = System.lineSeparator();
        
        int number = 0;                           // number in list
        int place = 0;                            // index of number
     
        // new line character for file writing
    	
    // ***** create objects *******

        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFilenum.txt")));
    	
    // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name: Lauren");
        System.out.println("Class: CS30S");
        System.out.println("Assignment:	A1 Q1");
        System.out.println("*******************************************");

        bannerOut = "*******************************************" + nl;
        bannerOut += "Name: Lauren" + nl;
        bannerOut += "Class: CS30S" + nl;
        bannerOut += "Assignment: A1 Q1" + nl;
        bannerOut += "*******************************************" + nl + nl;
    	
    // ************************ get input **********************

    // ************************ processing ***************************
        
        for(int i = place; i < 1000; i ++){
         number = (int)(Math.random() * 50 + 1); // generate random number
         fout.println(number); // print number
        } // end print random numbers to txt file
     
        
    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
        System.out.println("end of processing :)");
        fout.println("end of processing :)");
        
    // ***** close streams *****
        
        //fin.close();      // close input buffer stream
        fout.close();       // close output stream, note that nothing is printed 
        					// to the output file until the stream is closed		
        
    }  // end main
}  // end class
