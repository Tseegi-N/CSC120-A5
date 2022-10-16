/**
 * Prints boots using ASCII art 
 * @param left/right to indicate which boot to draw
 * @return ASCII art of boots(seperately)
 */
public class Boot {

    /* Left/right boot */
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * Prints ASCII art depicting a boots to the console
     */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.print("         |______|");
        } else if (this.direction.equals("right")) {
          System.out.print("|______|");
        } else {
          System.out.println("Which boot?");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
