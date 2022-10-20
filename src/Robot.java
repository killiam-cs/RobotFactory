public class Robot {

    // variable declarations
    public char size;
    public int red;
    public int green;
    public int blue;
    public String shape;

    // constructor method
    public Robot() {
        size = 's';
        red = 200;
        green = 10;
        blue = 180;
        shape = "square";
    }

    public void printInfo() {
        System.out.println("The robot is size " + size);
        System.out.println("The robot is a " + shape);
    }
}
