import java.util.Scanner;

/**
 * Scarecrow class (main)
 * Assignment 5: Bringing it All Together
 * @author Tseegi Nyamdorj 
 * Collaborated with Tina Chang
 * Assemble individual parts of the scarecrow and provide command line arguments for banner
 * @param banner, pumpkin, shirt, pants, boots(seperately)
 * @return ASCII art of a scarecrow with banner message
 */

class Scarecrow {
    /* Parts of the Scarecrow
     * Assembles each part of scarecrow
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    //private Hat hat;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    private String message;

    /* Constructor
     * Initialize remaining parts;
     * s = signage of the banner,
     * h = head made by pumpkin,
     * b = body of the scarecrow,
     * l = legs, pants
     * lb, rb = left/right boots
     */
    public Scarecrow(Banner s, Pumpkin h, Shirt b, Pants l, Boot lB, 
    Boot rB) {
        head = h;
        body = b;
        legs = l;
        leftFoot = lB;
        rightFoot = rB;
        sign = s;
    }

    /* Displays the Scarecrow 
     * Call the .display() method of each part in the correct order of display
    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        //Assign the constructor to assemble and draw scarecrow

        Scarecrow myScarecrow = new Scarecrow(new Banner(""), new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), 
        new Boot("right"));

        // If a message was passed in on the command line, extract and store it
        // Pass this value along to your Banner constructor by assigning new banner value
        if (args.length > 0) {
            myScarecrow.sign = new Banner(args[0]);
        }
        //Default message when command line doesn't supply strings
        else{
            myScarecrow.sign = new Banner("Waiting input");
        }

        myScarecrow.display();
    }

}
