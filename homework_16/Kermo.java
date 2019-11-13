package homework_16;

public class Kermo {

    private int diameter;
    private String material;

    Kermo() {
        String[] mat = {"алькантара", "велюр", "вініл", "екошкіра", "карпет"};
        this.material = mat[(int)(-1 + Math.random() * 5)];
        this.diameter = (int)(10 + Math.random() * 20);
    }
    
    public int getDiameter(){
        return diameter;
    }
    
    public String getMaterial(){
        return material;
    }

}
