package lab8;

import javax.swing.*;

public class Picture {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Picture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,750);
        frame.setLocationRelativeTo(null);
        String picture_path = "C:\\Users\\1\\OneDrive\\Рабочий стол\\Для ВУЗа\\2 курс\\Программирование на Java\\PicForJava.jpg";
        ImageIcon image = new ImageIcon(picture_path);
        JLabel lab = new JLabel(image);
        frame.add(lab);
        frame.setVisible(true);
    }
}
