package lab12;
import java.util.*;
public class Furnitures {
    abstract class Furniture {
        private String name;
        private String material;
        private double price;
        public Furniture(String name, String material, double price) {
            this.name = name;
            this.material = material;
            this.price = price;
        }
        public String getName() { return name; }
        public String getMaterial() { return material; }
        public double getPrice() { return price; }
        public abstract String toString();
    }
    class Chair extends Furniture {
        private int legs;

        public Chair(String name, String material, double price, int legs) {
            super(name, material, price);
            this.legs = legs;
        }
        @Override
        public String toString() {
            return getMaterial() + " стул с " + legs + " ножками, стоящий в рублях: " + getPrice();
        }
    }
    class Table extends Furniture {
        private String shape;
        public Table(String name, String material, double price, String shape) {
            super(name, material, price);
            this.shape = shape;
        }
        @Override
        public String toString() {
            return getMaterial() + " стол " + shape + " формы, стоящий в рублях: " + getPrice();
        }
    }
    class Sofa extends Furniture {
        private int seatingCapacity;
        public Sofa(String name, String material, double price, int seatingCapacity) {
            super(name, material, price);
            this.seatingCapacity = seatingCapacity;
        }
        @Override
        public String toString() {
            return getMaterial() + " диван для " + seatingCapacity + " человек, стоящий в рублях: " + getPrice();
        }
    }
    class FurnitureShop {
        private List<Furniture> inventory;
        public FurnitureShop() { inventory = new ArrayList<>(); }
        public void addItem(Furniture item) { inventory.add(item); }
        public void listItems() {
            System.out.println("Склад мебельного магазина:");
            for (Furniture item : inventory) {
                System.out.println(item.toString());
            }
        }
        public Furniture findItemByName(String name) {
            for (Furniture item : inventory) {
                if (item.getName().equals(name)) {
                    return item;
                }
            }
            return null;
        }
    }
    public static void main(String[] args) {
        Furnitures furnitures = new Furnitures();
        Chair chair = furnitures.new Chair("Деревянный стул", "Деревянный", 500, 4);
        Table table = furnitures.new Table("Круглый стол", "Стеклянный", 2000, "круглый");
        Sofa sofa = furnitures.new Sofa("Кожаный диван", "Кожаный", 20000, 3);
        FurnitureShop furnitureShop = furnitures.new FurnitureShop();
        furnitureShop.addItem(chair);
        furnitureShop.addItem(table);
        furnitureShop.addItem(sofa);
        furnitureShop.listItems();
        Furniture foundItem = furnitureShop.findItemByName("Круглый стол");
        if (foundItem != null) {
            System.out.println("Найденный товар: " + foundItem.toString());
        } else {
            System.out.println("Товар не найден.");
        }
    }
}