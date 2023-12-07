/*
 * This program reads data from courseData.txt and then outputs the result to resultData.txt while also calculating
 * weighted average, if they passed or failed and the class average
 * 
 * Author: Aryan Khanna
 * Nov 9, 2023 
 */

 //importing necessary modules
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class GradeData{

    /*
     * This method is created to ensure that the output where required is upto 2 decimals and not rounded off
     */
    private static final DecimalFormat df = new DecimalFormat("0.00"); 
    public static void main(String[]args){
        //intiliazing input and output streams
        Scanner inputStream = null;
        PrintWriter outputStream = null;

        //creating inputStream if file found else exiting
        try{
            inputStream = new Scanner(new FileInputStream("courseData.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println("The file does not exist!");
            System.exit(0);
        }

        //creating outputStream if no IOExcepetion else exiting
        try{
            outputStream = new PrintWriter(new FileOutputStream("resultData.txt"));
        }
        catch(IOException e){
            System.out.println("Sorry, we cannot locate the file!");
            System.exit(0);
        }
        
        //This creates array gradeWeight which contains the grading scale for the weightedAvg from the text file
        String [] gradeWeight = (inputStream.nextLine()).split(" ");
        //This creates a 2d array containing all the marks for thier respective classes
        String [][] gradeData = new String[3][6];
        //variables to traverse through data and then store it
        int count =0;
        int i=0;
        while(inputStream.hasNextLine()){
            i = 1;
            gradeData [count][0] = inputStream.nextLine();
            String nextLine = inputStream.nextLine();
            while(nextLine.equals("0") == false){
                gradeData [count][i] = nextLine;
                nextLine = inputStream.nextLine();
                i++;
            }
            count++;
        }
        int x=0;
        for(int z=0; z<3; z++){
            //variables x and y are used for travesing through the array
            int y=1;
            //tempSum holds the sum of all weighted averages for that class and tempCount stores the number of students in that class
            int tempSum = 0;
            int tempCount = 0;
            //printing to text file in provided format
            outputStream.println();
            outputStream.println("Grade Data For Class " + gradeData[x][0]);
            outputStream.println();
            outputStream.println(" ID     Programs   Midterm   Final   Weighted Average   Overall Grade");
            while(true){
                while(gradeData[x][y] != null){
                    //spliting the data line containg student id and marks
                    String [] temp = (gradeData[x][y]).split(" ");
                    //caluclating weightedAvg
                    Double weightedAvg = ((Double.valueOf(temp[1])*Double.valueOf(gradeWeight[0])) + (Double.valueOf(temp[2])*Double.valueOf(gradeWeight[1])) + (Double.valueOf(temp[3])*Double.valueOf(gradeWeight[2])));
                    tempSum += weightedAvg;
                    tempCount += 1;
                    //declaring string variable to check and put value of pass or fail
                    String overallGrade = "";
                    if(weightedAvg>50.00){
                        overallGrade = "Pass";
                    }
                    else{
                        overallGrade = "Fail";
                    }
                    //outputing to text ifle in provided format
                    outputStream.println(" " + temp[0] + "   " + temp[1] + "         " + temp[2] + "        " + temp[3] + "      " + df.format(weightedAvg) + "               " + overallGrade);
                    break;
                }
                y++;
                //when program finishes travesing through maximum possible array length it prints class avg and then exists
                if(y>=6){
                    outputStream.println();
                    outputStream.println("Class average: " + df.format(tempSum/tempCount));
                    break;
                }
                else{
                    //if not reached 6 it re starts the while loop
                    continue;
                }
            }
            x++;
    }
    //closing outputStream
    outputStream.close();
    }
}