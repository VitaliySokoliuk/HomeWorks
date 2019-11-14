package homework_16;

public class MyList {

    private int[] elem;
    private int size;
    private int index = 0;

    public MyList(int size) {
        this.size = size;
        elem = new int[size];
    }

    public void add(int num) {
        if (index == elem.length) {
            size++;
            int[] mass = new int[size];
            for (int i = 0; i < elem.length; i++) {
                mass[i] = elem[i];
            }
            mass[index] = num;

            elem = new int[size];
            elem = mass;
            index++;
        } else {
            elem[index] = num;
            index++;
        }
    }

    public void removelast() {
        if (index == elem.length) {
            size--;
            int[] mass = new int[size];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = elem[i];
            }
            elem = new int[size];
            elem = mass;
            index--;

        } else {
            index--;
            elem[index] = 0;
        }
    }

    public void removebyindex(int ind) {
        if (ind >= size || ind < 0) {
            System.out.println("Елемент за даним індексом недоступний");
        } else {
            size--;
            int[] mass = new int[size];
            for (int i = 0; i < mass.length; i++) {
                if (i != ind) {
                    mass[i] = elem[i];
                } else {
                    mass[i] = elem[i + 1];
                    ind++;
                }
            }
            elem = new int[size];
            elem = mass;
            index--;
        }
    }

    public void print() {
        for (int i = 0; i < elem.length; i++) {
            System.out.print(elem[i] + " ");
        }
        System.out.println("");
    }

}
