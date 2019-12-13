package Task_1;

public class People {
    
    int weight;
    int height;

    public People(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public People() {}
    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "People{" + "weight=" + weight + ", height=" + height + '}';
    }
    
}
