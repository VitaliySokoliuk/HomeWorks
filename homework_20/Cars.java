package homework_20;

import java.util.Objects;

public class Cars {
    
    public String marka;
    private int price;

    public Cars(String marka, int price) {
        this.marka = marka;
        this.price = price;
    }

    public Cars(String marka) {
        this.marka = marka;
    }

    public Cars(int price) {
        this.price = price;
    }
    
    public void myMethod_add_to_price(int num){
        price += num;
    }
    
    public void myMethod2_chance_car(String mar, int pr){
        marka = mar;
        price = pr;
    }
    
    
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cars{" + " marka = " + marka + ", price = " + price + " }";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.marka);
        hash = 31 * hash + Objects.hashCode(this.price);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cars other = (Cars) obj;
        if (!Objects.equals(this.marka, other.marka)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }
}
