/**
 * This program is created to have difeerent set pieces of mario game's land structure to create one's own new type of mario level
 * 
 * Aryan Khanna
 * October 10, 2023
 */

 public class mario_game{
    public static void main(String[]args){
        //printing level 1 by calling different methods
        System.out.println("Level 1: ");
        ground();
        groundFLoatingBoxesQuestion();
        groundFloatingBoxes();
        groundFloatingBoxes();
        groundAscendingBoxes();
        groundAscendingBoxes();
        groundFLoatingBoxesQuestion();
        groundFLoatingBoxesQuestion();
        groundDescendingBoxes();
        groundFloatingBoxes();
        groundAscendingBoxes();
        flag();

        //printing level 2 by calling different methods
        System.out.println("\n\nLevel 2: ");
        ground();
        ground();
        groundFloatingBoxes();
        groundFLoatingBoxesQuestion();
        groundAscendingBoxes();
        groundFLoatingBoxesQuestion();
        groundAscendingBoxes();
        groundDescendingBoxes();
        groundAscendingBoxes();
        groundDescendingBoxes();
        groundAscendingBoxes();
        groundDescendingBoxes();
        groundAscendingBoxes();
        flag();

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
    public static void groundFloatingBoxes(){
        System.out.println("|G|\n|G|      |B|\n|G|      |B|\n|G|      |B|\n|G|\n");
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
    public static void groundAscendingBoxes(){
        System.out.println("|G|      |A|\n|G|      |A||A|\n|G|      |A||A||A|\n|G|      |A||A||A||A|\n");
    }
    /*
     * This methods creates the ground with ascending blocks level which looks like:
     * 
     * |G| |D||D||D|
     * |G| |D||D|
     * |G| |D|
     * 
     */
    public static void groundDescendingBoxes(){
        System.out.println("|G|      |D||D||D|\n|G|      |D||D|\n|G|      |D|\n");
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