/**
 * Prints banner with message provided using ASCII art 
 * @param string to recieve message
 * @return ASCII art that depicts heart with a rectangular speech box
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * Print a decorative banner, resized to fit the message
     */
    public void display() {
        System.out.println("_____________________________________________");
        System.out.println("|                                            |");
        System.out.println("|      ***********            **********     |");
        System.out.println("|   *****************      ****************  |");
        System.out.println("|  ********************  ******************* |");
        System.out.println("|     ****** ~~~~~~~~~~~~~~~~~~~~~~~~ ****** |");

        //Message is fit depending on the character length
        System.out.print("       ");
        for (int i=30; message.length()<i; i=i-2){
            System.out.print("*");
        }
        System.out.print(" ~ ");
        System.out.print(message);
        System.out.print(" ~ ");
        for (int i=30; message.length()<i; i=i-2){
            System.out.print("*");
        }
        
        System.out.println("\n|         ** ~~~~~~~~~~~~~~~~~~~~~~~~ **     |");
        System.out.println("|           **************************       |");
        System.out.println("|                ****************            |");
        System.out.println("|                   **********               |");
        System.out.println("|                       **                   |");
        System.out.println("|______________________   ___________________|");
        System.out.println("                       | /");
        System.out.println("                       |/");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Happy halloween 2022");
        myBanner.display();
    }
}
