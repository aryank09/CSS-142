/*
 * This program carrys out several different programs adressed in the HW 3 loops such as the root beer on the wall problem,
 * Fibonacci numbers, triangle pattern, pascal triangle and making UW logo using user input
 * 
 * Aryan Khanna
 * Oct 27, 2023
 */

//importing java.util.Scanner for taking user input
import java.util.Scanner;

public class Loops{
    public static void main(String[]args){
        //created scanner input to take user input
        Scanner input = new Scanner(System.in);

        //this is taking input for how many bottles between 0 to 20 inclusive; if wrong input entered it restarts
        while(true){
            System.out.print("How many bottles should we start with?: ");
            int bottles = input.nextInt();
            if((bottles<=20) && (bottles>0)){
                bottlesOfBeer(bottles);
                break;
            }
            else{
                //if incorrect input entered
                System.out.println("Incorrect value entered. Running program again!");
                continue;
            }
            
        }
        //this is taking input for fibonacci numbers between 1-9; if wrong input entered it restarts
        while(true){
            System.out.print("How many terms would like printed out for the Fibonacci Sequence?: ");
            int num = input.nextInt();
            if((num>1) && (num<9)){
                fibonacciNumbers(num);
                break;
            }
            else{
                //if incorrect input entered
                System.out.println("Incorrect value entered. Running program again!");
                continue;
            }
            
        }
        //this is taking input for triangle pattern between 1-9; if wrong input entered it restarts
        while(true){
            System.out.print("Please input the number of rows: ");
            int num = input.nextInt();
            if((num>1) && (num<9)){
                numberTriangle(num);
                break;
            }
            else{
                //if incorrect input entered
                System.out.println("Incorrect value entered. Running program again!");
                continue;
            }
            
        }
        //this is taking input for pascal triangle between 1-9; if wrong input entered it restarts
        while(true){
            System.out.print("How many rows (1-9) of the Pascal triangle would you like printed?: ");
            int rows = input.nextInt();
            if((rows>1) && (rows<9)){
                pascalTriangle(rows);
                break;
            }
            else{
                //if incorrect input entered
                System.out.println("Incorrect value entered. Running program again!");
                continue;
            }
            
        }

        //taking input for printing UW logo
        System.out.print("Please enter the charecter you would like to use to create W logo with: ");
        String userChar = input.next();
        uwLogoPrinter(userChar);

        //closing input
        input.close();

    }
    /*
     * This method takes user input and the prints the number of root beer on the wall song accordingly
     */
    public static void bottlesOfBeer(int num){
        int i = 0;
        for( ; i<num; i++){
            if((num-i-1) != 0){
                System.out.println((num-i) + " bottles of root beer on the wall");
                System.out.println((num-i) + " bottles of root beer");
                System.out.println("Take one down and pass it around");
                System.out.println((num-i-1) + " bottles of root beer on the wall\n");
            }
            
        }
        //When num reaches 0; sentence changes and hence the differnt sentences are printed outside the loop
        System.out.println("1 bottle of root beer on the wall");
        System.out.println("1 bottle of root beer");
        System.out.println("Take one down and pass it around\nNo more bottles of root beer on the wall\n");
    }
    /*
     * This method prints fibonacci numbers till amount the user inputs
     * 
     * it goes like 0 1 1 2 3 5.....
     */
    public static void fibonacciNumbers(int num){
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < num){
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        System.out.println("\n");
    }
    /*
     * THis method prints different triangle patter after taking user input
     * the pattern are as follows(changes according to user input)
     * 
     * 1
     * 1
     * 123
     * 1234
     * 12345
     * 123456
     * 1234567
     * 12345678
     * 
     * Second triangle:
     * 
     * 1
     * 22
     * 333
     * 4444
     * 55555
     * 666666
     * 7777777
     * 88888888
     * 
     */
    public static void numberTriangle(int num){
        System.out.println("Here is the first triangle:");
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Here is the second triangle:");

        for(int i=1; i<=num; i++){
            String numStr = String.valueOf(i);
            System.out.println(numStr.repeat(i));
        }
    }
    /*
     * This method prints out the pascal triangle;
     * amount of rows depends on user input
     */
    public static void pascalTriangle(int rows){
        for (int line = 1; line <= rows; line++) {
            for (int j = 0; j <= rows - line; j++) {
                System.out.print(" ");
            }
    
            int k = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(k + " ");
                k = k*(line-i)/i;
            }
    
            System.out.println();
        }
    }
    /*
     * This method prints the UW logo using the String entered by the user
     */
    public static void uwLogoPrinter(String userChar){
        for(int i=0; i<=5; i++){
            System.out.println(" ".repeat(i) + userChar + " ".repeat(5-i) + " ".repeat(5-i) + userChar + " ".repeat(2*i) + userChar + " ".repeat(5-i) + " ".repeat(5-i) + userChar );
        }
    }
}