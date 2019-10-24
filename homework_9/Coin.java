package homework_9;

import javax.swing.*;

public class Coin {

    public static void main(String[] args) {
        String text, str;
        JOptionPane.showMessageDialog(null, "Кидаємо монету");
        int num = (int) (Math.random() * 2);
        if (num == 1) {
            str = "Орел";
        } else {
            str = "Решка";
        }
        JOptionPane.showMessageDialog(null, str);
    }
}
