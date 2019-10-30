package homework_11;

public class HomeWork_11 {

    public static void main(String[] args) {
        
        Cy_27 CY = new Cy_27(30, 10, 7000, 650, "blue");
        
        CY.launchEngine();
        CY.takeOffPlane();
        CY.getAC().moveUp();
        CY.getAC().moveDown();
        CY.getAC().moveLeft();
        CY.getAC().moveRight();
        CY.stealth();
        CY.nuclearStrike();
        CY.turbo();
        CY.landPlane();
    }
    
}
