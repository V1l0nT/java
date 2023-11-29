package lab9;

public class Name {
    public interface Nameable {
        String getName();
    }
    public static class Planet implements Nameable {
        private String name;

        public Planet(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }
    public static class Animal implements Nameable {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }
    public static class Car implements Nameable {
        private String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        Planet earth = new Planet("Земля");
        Animal lion = new Animal("Лев");
        Car toyota = new Car("Сузуки");

        System.out.println("Название планеты: " + earth.getName());
        System.out.println("Название животного: " + lion.getName());
        System.out.println("Название машины: " + toyota.getName());
    }
}
