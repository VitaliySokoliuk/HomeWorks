package Task_2;

public class HW_8_2 {
    public static void main(String[] args) {
        Car car = new Car("Mazda");
        System.out.println(car.toString());
        car.setMarka("BMW");
        car.setKermo(new Kermo(25));
        Koleso koleso = new Koleso(10);
        koleso.setRadius(17);
        car.setKoleso(koleso);
        car.setKyzov(new Kyzov(350, 170));
        System.out.println(car.toString());
    }
    
}
