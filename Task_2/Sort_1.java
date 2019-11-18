
package Task_2;

import java.util.Comparator;

public class Sort_1 implements Comparator<Commodity> {
    @Override
    public int compare(Commodity a, Commodity b) {
        return a.getName().compareTo(b.getName());
    }
}

class Sort_2 implements Comparator<Commodity> {
    @Override
    public int compare(Commodity a, Commodity b) {
        return a.getWeight() - b.getWeight();
    }
}

class Sort_3 implements Comparator<Commodity> {
    @Override
    public int compare(Commodity a, Commodity b) {
        return a.getLenght() - b.getLenght();
    }
}

class Sort_4 implements Comparator<Commodity> {
    @Override
    public int compare(Commodity a, Commodity b) {
        return a.getWidth() - b.getWidth();
    }
}