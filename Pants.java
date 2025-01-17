/*
 * Prints pants using ASCII art 
 * @param none
 * @return ASCII art of pants with pockets
 */
public class Pants {

    /*
     * Prints ASCII art depicting a pants to the console
     */
    public void display() {
        System.out.println("          |   | \\/  |  |");
        System.out.println("          |__/  ||  \\__|");
        System.out.println("          |     ||     |");
        System.out.println("          |     ||     |");
        System.out.println("          |     ||     |");
        System.out.println("          |     ||     |");
        System.out.println("          |     ||     |");
        System.out.println("          |_____||_____|");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
