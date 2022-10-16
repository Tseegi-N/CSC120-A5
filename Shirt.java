/*
 * Prints shirt using ASCII art 
 * @param none
 * @return ASCII art of shirt with buttons and sleeves
 */
public class Shirt {

    /*
     * Prints ASCII art depicting a shirt to the console
     */

    public void display() {
        System.out.println("         __,--./|.--,__");
        System.out.println("        .`   \\ \\ / /    `.");
        System.out.println("      .`      \\ | /       `.");
        System.out.println("     /   /     ^|^      \\   \\");
        System.out.println("    /   / |     |o     | \\   \\");
        System.out.println("   /===/  |     |      |  \\===\\");
        System.out.println("  /___/   |     |o     |   \\___\\");
        System.out.println("          |     |      |");
        System.out.println("          |     |o     |");
        System.out.println("          |_____/\\_____|");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
