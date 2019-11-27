package homework_22;

public class Task_2 {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new Map<>(1, 2);
        map.addEl(3, 4);
        map.addEl(5, 6);
        map.addEl(7, 8);
        map.show();
        map.remove_by_key();
        map.show();
        map.remove_by_value();
        map.show();
        map.show_set_key();
        map.show_list_value();
    }

}
