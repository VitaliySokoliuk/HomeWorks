package Task_1;

public class Cars implements Comparable<Cars>{
    
    String marka;
    Integer price;

    public Cars(String marka, Integer price) {
        this.marka = marka;
        this.price = price;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    

    

    @Override
    public String toString() {
        return "Cars{" + " marka = " + marka + ", price = " + price + " }";
    }

    @Override
    public int compareTo(Cars o) {
        int priceDi = o.getPrice().compareTo(price);

        if (priceDi != 0){
            return priceDi;
        } else {
            return marka.compareTo(o.getMarka());
        }
    }
    
}
