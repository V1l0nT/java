package lab8;

import javax.swing.*;

public class GIF {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gif");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        String gif_path = "C:\\Users\\1\\OneDrive\\Рабочий стол\\Для ВУЗа\\2 курс\\Программирование на Java\\GifForJava.gif";
        ImageIcon gif = new ImageIcon(gif_path);
        JLabel lab = new JLabel(gif);
        frame.add(lab);
        frame.setVisible(true);
    }
}
