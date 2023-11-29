package lab8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,600);
        frame.setLocationRelativeTo(null);
        frame.add(new GUI());
        frame.setVisible(true);
    }
}

class GUI extends JPanel {
    private Shape[] shapes;
    public GUI() {
        shapes = new Shape[20];
        Random rand = new Random();
        //1 - круг, 2 - овал, 3 - квадрат, 4 - прямоугольник
        for (int i=0;i<20;i++) {
            int r = rand.nextInt(4)+1;
            switch (r) {
                case 1:
                    shapes[i] = new Circle();
                    break;
                case 2:
                    shapes[i] = new Oval();
                    break;
                case 3:
                    shapes[i] = new Square();
                    break;
                case 4:
                    shapes[i] = new Rectangle();
                    break;
            }
        }

    }
    public void paintComponent(Graphics g) {
        this.setBackground(Color.white);
        for (Shape shape : shapes)
            shape.draw(g);
    }

}

class Rectangle extends Shape {
    private int width, heigth;
    public Rectangle() {
        super();
        Random rand = new Random();
        width = rand.nextInt(80)+20;
        heigth = rand.nextInt(60)+20;
    }
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,width,heigth);
    }
}
class Square extends Shape {
    private int size;
    public Square() {
        super();
        Random rand = new Random();
        size = rand.nextInt(80)+20;
    }
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,size,size);
    }
}
class Circle extends Shape {
    private int radius;
    public Circle() {
        super();
        Random rand = new Random();
        radius = rand.nextInt(40)+10;
    }
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x,y,radius*2,radius*2);
    }
}
class Oval extends Shape {
    private int rad_x, rad_y;
    public Oval() {
        super();
        Random rand = new Random();
        rad_x = rand.nextInt(80)+20;
        rad_y = rand.nextInt(60)+20;
    }
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x,y,rad_x,rad_y);
    }
}
abstract class Shape {
    protected Color color;
    protected int x, y;
    public Shape() {
        Random rand = new Random();
        color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
        x = rand.nextInt(1200);
        y = rand.nextInt(600);
    };
    abstract protected void draw(Graphics g);
}

