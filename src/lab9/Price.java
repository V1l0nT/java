package lab9;

public class Price {
    public interface Priceable {
        int getPrice();
    }
    public static class Car implements Priceable {
        private int price;

        public Car(int price) {
            this.price = price;
        }

        @Override
        public int getPrice() {
            return price;
        }
    }
    public static class Food implements Priceable {
        private int price;

        public Food(int price) {
            this.price = price;
        }

        @Override
        public int getPrice() {
            return price;
        }
    }
    public static class Computer implements Priceable {
        private int price;

        public Computer(int price) {
            this.price = price;
        }

        @Override
        public int getPrice() {
            return price;
        }
    }
    public static void main(String[] args) {
        Car toyota = new Car(1000000);
        Food burger = new Food(150);
        Computer comp = new Computer(100000);

        System.out.println("Цена машины: " + toyota.getPrice());
        System.out.println("Цена еды: " + burger.getPrice());
        System.out.println("Цена компьютера: " + comp.getPrice());
    }
}
