package homework_21;

public class HomeWork_21 {

    public static void main(String[] args) {

        Integer[] mass = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Collection coll = new Collection(mass);
        Iterator it = coll.createIterator1();
        while (it.hasNext()) {
            Integer next = (Integer) it.next();
            if (next % 2 != 0) {
                next = 0;
            }
            System.out.print(next + " ");
        }
        System.out.println("");

        Iterator it2 = coll.createIterator2();
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
        System.out.println("");

        Iterator it3 = coll.createIterator_Anon();
        while (it3.hasNext()) {
            Integer next = (Integer) it3.next();
            if (next % 2 != 0) {
                System.out.print(next + " ");
            }
        }
        System.out.println("");

        Iterator it4 = coll.createIterator_Local();
        while (it4.hasNext()) {
            System.out.print(it4.next() + " ");
        }
        System.out.println("");
        
        Iterator it5 = coll.createIterator_Static();
        while (it5.hasNext()) {
            System.out.print(it5.next() + " ");
        }
        System.out.println("");
        
    }
}
