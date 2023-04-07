package com.stir.cscu9t4practical4;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 * @author abdul
 */
public class FilesInOut {

    public static void main(String[] args) {
        // Replace this with statements to set the file name (input) and file name (output).
    	
    	String Input_File = "C:\\Users\\abdul\\OneDrive\\Desktop\\CSCUT4Practical2-main\\input.txt";
    	String Output_File = "Output File.txt";
    	System.out.println("The text has been converted to Title Case and Upper Case and the file has been saved");
    	
    	try {
    		// Initially it will be easier to hardcode suitable file names
    		
            // Set up a new Scanner to read the input file.
    		Scanner scanner = new Scanner (new File (Input_File));
    		
    		// Set up a new PrintWriter to write the output file.
    		PrintWriter writer = new PrintWriter (new FileWriter (Output_File));
    		
    		while (scanner.hasNextLine()) {
      		  String line = scanner.nextLine();
    			
      		  
      		  //Converting the lines to the Title Case
      		  String titleCase = To_Title_Case_Upper_Case(line);
      		  writer.println(titleCase);
      		  
      		  
      		//Converting the lines to the Upper Case
      		  String upperCase = line.toUpperCase();
      		  writer.println(upperCase);
      		
    		}
   
    		// closing the scanner and writer
            scanner.close();
            writer.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
        
    }
    	
    // Converting the string
    public static String To_Title_Case_Upper_Case (String str) {
    	
    	if(str == null || str.isEmpty()) return str;
    	return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
    	
    } // main
    
    

} // FilesInOut
