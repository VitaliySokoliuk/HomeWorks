package Task_1;

public class HW_8_1 {
    
    public static void main(String[] args) {
        
        Robot robot = new Robot("Я Robot – я просто працюю");
        robot.work();
        
        CoffeRobot cofferobot = new CoffeRobot("Я CoffeRobot – я варю каву");
        cofferobot.work();
        
        RobotDancer robotDancer = new RobotDancer("Я RobotDancer – я просто танцюю");
        robotDancer.work();
        
        RobotCooker robotCooker = new RobotCooker("Я RobotDancer – я просто готую");
        robotCooker.work();
        
        Robot[] robot1 = new Robot[4];
        robot1[0] = new Robot("Я Robot – я просто працюю");
        robot1[1] = new Robot("Я CoffeRobot – я варю каву");
        robot1[2] = new Robot("Я RobotDancer – я просто танцюю");
        robot1[3] = new Robot("Я RobotDancer – я просто готую");
        for (int i = 0; i < 4; i++){
            robot1[i].work();
        }      
    }
}
