/**
 * This program is created to have difeerent set pieces of mario game's land structure to create one's own new type of mario level
 * then taking user's input for mario and coin and spawing them in the level
 * 
 * Aryan Khanna
 * October 10, 2023
 */

 //importing Scanner
 import java.util.Scanner;
public class mario_game_2 {
    public static void main(String[]args){

        //creating scanner input
        Scanner input = new Scanner(System.in);

        //taking input for how mario and the coin will look
        System.out.print("Please enter the string that would represent mario: ");
        String mario = input.nextLine();
        System.out.print("Please enter the string that would represent coin: ");
        String coin = input.nextLine();

        //printing level 1 by calling different methods
        System.out.println("Level 1: ");
        ground();
        groundFLoatingBoxesQuestion();
        groundFloatingBoxes(coin);
        groundFloatingBoxes(coin);
        groundAscendingBoxes(mario);
        groundFLoatingBoxesQuestion();
        groundFLoatingBoxesQuestion();
        groundDescendingBoxes(coin);
        groundFloatingBoxes(coin);
        flag();

        //printing level 2 by calling different methods
        System.out.println("\n\nLevel 2: ");
        ground();
        ground();
        groundFloatingBoxes(coin);
        groundFLoatingBoxesQuestion();
        groundFLoatingBoxesQuestion();
        groundDescendingBoxes(coin);
        groundFLoatingBoxesQuestion();
        groundDescendingBoxes(coin);
        groundFloatingBoxes(coin);
        groundDescendingBoxes(coin);
        groundAscendingBoxes(mario);
        flag();

        //closing the input
        input.close();

    }
    /*
     * This method creates the ground block of the level which looks like:
     * 
     * |G|
     * |G|
     * |G|
     * |G|
     * |G|
     * 
     */
    public static void ground(){
        System.out.println("|G|\n|G|\n|G|\n|G|\n|G|\n");
    }
    /*
     * This method creates the ground with floating blocks level which looks like:
     * 
     * |G|
     * |G| |B|
     * |G| |B|
     * |G| |B|
     * |G|
     * 
     */
    public static void groundFloatingBoxes(String coin){
        System.out.println("|G|\n|G|      |B|" + coin + "\n|G|      |B|\n|G|      |B|" + coin + "\n|G|\n");
    }
    /*
     * This method creates the ground with question block level which looks like:
     * 
     * |G|
     * |G| |B|
     * |G| |?|
     * |G| |B|
     * |G|
     * 
     */
    public static void groundFLoatingBoxesQuestion(){
        System.out.println("|G|\n|G|      |B|\n|G|      |?|\n|G|      |B|\n|G|\n");
    }
    /*
     * This methods creates the ground with ascending blocks level which looks like:
     * 
     * |G| |A|
     * |G| |A||A|
     * |G| |A||A||A|
     * |G| |A||A||A||A|
     * 
     */
    public static void groundAscendingBoxes(String mario){
        System.out.println("|G|      |A|\n|G|      |A||A|\n|G|      |A||A||A|\n|G|      |A||A||A||A|" + mario + "\n");
    }
    /*
     * This methods creates the ground with ascending blocks level which looks like:
     * 
     * |G| |D||D||D|
     * |G| |D||D|
     * |G| |D|
     * 
     */
    public static void groundDescendingBoxes(String coin){
        System.out.println("|G|      |D||D||D|\n|G|      |D||D|" + coin + "\n|G|      |D|\n");
    }
    /*
     * This methods creates the ground with ascending blocks level which looks like:
     * 
     *             /\
     * |----------/--\
     */
    public static void flag(){
        System.out.println("            /"+"\\");
        System.out.println("|----------/--"+"\\"+"\n");
    }
 }

