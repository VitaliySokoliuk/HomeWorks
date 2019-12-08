package homework_25;

public class Cars {

    @Cars_Annotation("Рік випуску автомобіля")
    private int year;
    @Cars_Annotation("Марка автомобіля")
    private String marka;

    private int price;

    public Cars(int year, String marka, int price) {
        this.year = year;
        this.marka = marka;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
        return "Cars{ " + "year = " + year + ", marka = " + marka + ", price = " + price + "}";
    }

}
