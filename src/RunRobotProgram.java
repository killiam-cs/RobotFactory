public class RunRobotProgram {

    public static void main(String[] args) {
        RunRobotProgram myRobot = new RunRobotProgram();
    }

    public RunRobotProgram() {
        Robot ludwig;
        ludwig = new Robot('s', 200, 10, 180, "square");
        ludwig.printInfo();

        Robot robot2;
        robot2 = new Robot('l', 30, 255, 100, "triangle");
        robot2.printInfo();
    }

}
