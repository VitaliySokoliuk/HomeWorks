package homework_15;

public class Avto {

    private int kks;
    private int year;
    private Kermo kermo;
    private Dvugyn dvugyn;

    Avto(int year) {
        this.year = year;
    }
    
    Avto() {
        this.kks = (int) (100 + Math.random() * 200);
        this.year = (int) (2000 + Math.random() * 20);
        this.kermo = new Kermo();
        this.dvugyn = new Dvugyn();
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    @Override
    public String toString(){
        return "Кінських сил: " + kks + ", рік: " + year + ", матеріал керма: " + kermo.getMaterial()
                + ", діаметр керма: " + kermo.getDiameter() + ", кількість циліндрів: " + dvugyn.getChulindres() + "\n";
    }

}
