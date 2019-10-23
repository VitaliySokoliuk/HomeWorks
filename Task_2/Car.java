package Task_2;

public class Car {
    
    private String marka;
    private Kermo kermo;
    private Koleso koleso;
    private Kyzov kyzov;
    
    Car(String marka){
        this.marka = marka;
        kermo = new Kermo();
        koleso = new Koleso();
        kyzov = new Kyzov();
    }
    
    public String getMarka(){
        return marka;
    }
    public Kermo getKermo() {
        return kermo;
    }
    public Koleso getKoleso() {
        return koleso;
    }
    public Kyzov getKyzov() {
        return kyzov;
    }
    
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void setKermo(Kermo kermo) {
        this.kermo = kermo;
    }
    public void setKoleso(Koleso koleso) {
        this.koleso = koleso;
    }
    public void setKyzov(Kyzov kyzov) {
        this.kyzov = kyzov;
    }
    public String toString() {
        return "Car{" + "marka=" + marka + ", kermo=" + kermo + ", koleso=" + koleso + ", kyzov=" + kyzov + '}';
    }

    void setKermo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}
