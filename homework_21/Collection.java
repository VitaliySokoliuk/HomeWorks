package homework_21;

public class Collection {

    static Number[] array;

    Collection(Integer[] array) {
        this.array = array;
    }

    class Class_1 implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Object next() {
            return array[index++];
        }
    }

    class Class_2 implements Iterator {

        int index = array.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Object next() {
            int q = index;
            index -= 2;
            return array[q];
        }
    }

    public Iterator createIterator1() {
        return new Class_1();
    }

    public Iterator createIterator2() {
        return new Class_2();
    }

    public Iterator createIterator_Anon() {
        return new Iterator() {
            int index = array.length - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Object next() {
                int q = index;
                index -= 3;
                return array[q];
            }
        };
    }

    public Iterator createIterator_Local() {
        class Class_4 implements Iterator {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public Integer next() {
                int q = index;
                index = index + 5;
                int num = (int) array[q];
                if (num % 2 == 0) {
                    return num -= 100;
                } else {
                    return num;
                }
            }
        }
        return new Class_4();
    }

    static class Class_5 implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Integer next() {
            int q = index;
            index += 2;
            int num = (int) array[q];
            if (num % 2 == 0) {
                return num -= 1;
            } else {
                return num;
            }
        }
    }

    public Class_5 createIterator_Static() {
        return new Class_5();
    }

}
