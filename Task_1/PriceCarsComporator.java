package Task_1;

import java.util.Comparator;

public class PriceCarsComporator implements Comparator<Cars> {
    
    @Override
    public int compare(Cars o1, Cars o2) {
        if ((o1.getPrice() - o2.getPrice()) != 0 )
            return o1.getPrice() - o2.getPrice();
        else
            return o1.getMarka().compareTo(o2.getMarka());
    }
    
}
