/********************************************************************
 * Programmer: Lauren
 * 
 * Class: CS30S
 *
 * Assignment: A1 Q2
 *
 * Description: brief description of program.
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class Assignment1Q2 {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;				// string data input from keyboard
        String strout;				// processed info string to be output
        String bannerOut;			// string to print banner to message dialogs

        String prompt;				// prompt for use in input dialogs

        String delim = " to ";		        // delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();     // new line character for file writing
        
        int[] numbers = new int [1000];         // array of random numbers 
        int[] frequency = new int [50];         // how many times a number is in the array
        int answer = 0;                         // answer to prompt
        int lowerbound = 0;                     // lower bound in range
        int upperbound = 0;                     // upper bound in range
        int frequencyrange = 0;                 // frequency of numbers in range
    	
    // ***** create objects *******

        BufferedReader fin = new BufferedReader(new FileReader("outFilenum.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name: Lauren");
        System.out.println("Class: CS30S");
        System.out.println("Assignment:	A1 Q2");
        System.out.println("*******************************************");

        bannerOut = "*******************************************" + nl;
        bannerOut += "Name: Lauren" + nl;
        bannerOut += "Class: CS30S" + nl;
        bannerOut += "Assignment: A1 Q2" + nl;
        bannerOut += "*******************************************" + nl + nl;
        
        fout.print(bannerOut);		// prints the banner to the output text file
    	
    // ************************ get input **********************

    // ************************ processing ***************************

        strin = fin.readLine(); // read in first number
        
        for(int i = 0; i < 1000; i++){
            
            numbers[i] = Integer.parseInt(strin); // load number into array
            
            strin = fin.readLine(); // read next number
        } // end load array
    
        for(int j = 0; j < 1000; j++){
            frequency[numbers[j]-1] ++; // count number for frequency
        } // end frequency
        
        prompt = "Which number would you like to see the frequency of? Enter 0 to end.";
        strin = JOptionPane.showInputDialog(bannerOut + prompt);
        
        tokens = strin.split(delim); // declare tokens
        
        try{
        answer = Integer.parseInt(tokens[0]); // parse answer
        } // end try
        catch(NumberFormatException e){
            System.out.println("Please enter a number.");
        } // end catch
                
        while(answer != 0){
        
        try{
           System.out.println("frequency of " + answer + ": " + frequency[answer-1]);
        } // end try
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("You must enter an available digit.");
        } // end catch
        catch(NumberFormatException e){
            System.out.println("Please enter one number.");
        } // end catch
        
           prompt = "Which number would you like to see the frequency of? Enter 0 to end.";
           strin = JOptionPane.showInputDialog(bannerOut + prompt);
        
           tokens = strin.split(delim);
           answer = Integer.parseInt(tokens[0]); // parse answer
           
        } // end show frequency
        
        prompt = "What range of numbers would you like to see the frequency of? Enter 0 to 0 to end.";
        strin = JOptionPane.showInputDialog(bannerOut + prompt);
        
        tokens = strin.split(delim);
        
        try{
        lowerbound = Integer.parseInt(tokens[0]); // parse lowerbound
        upperbound = Integer.parseInt(tokens[1]); // parse upper
        } // end try
        catch(NumberFormatException e){
            System.out.println("Please format range x to y.");
        } // end catch
    while(lowerbound != 0){
        
        for(int m = lowerbound; m <= upperbound; m++){
            System.out.println("frequency of " + m + " : " + frequency[m-1]);
        } // end frequency range
        
        
        prompt = "What range of numbers would you like to see the frequency of? Enter 0 to 0 to end.";
        strin = JOptionPane.showInputDialog(bannerOut + prompt);
        
        tokens = strin.split(delim);
        lowerbound = Integer.parseInt(tokens[0]); // parse lowerbound
        upperbound = Integer.parseInt(tokens[1]); // parse upper
    } // end frequency range
        
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
