package lab12;
public class Dogs {
    public abstract class Dog {
        protected String name;
        protected int age;
        public Dog (String name, int age) {
            this.name = name;
            this.age = age;
        }
        public int getAge () {
            return this.age;
        }
        public String getName () { return this.name; }
        abstract public String toString();
    }
    public class Shepherd extends Dog {
        String breed = "Овчарка";
        Shepherd(String name, int age) { super(name, age); }
        @Override
        public String toString() { return " Порода: " + breed + "; Кличка: " + getName() + "; Возраст: " + getAge(); }
    }
    public class Poodle extends Dog {
        String breed = "Пудель";
        Poodle(String name, int age) { super(name, age); }
        @Override
        public String toString() { return " Порода: " + breed + "; Кличка: " + getName() + "; Возраст: " + getAge(); }
    }
    public class Husky extends Dog {
        String breed = "Хаски";
        Husky(String name, int age) { super(name, age); }
        @Override
        public String toString() { return " Порода: " + breed + "; Кличка: " + getName() + "; Возраст: " + getAge(); }
    }
    public static void main(String[] args) {
        Dogs dogs = new Dogs();
        Dog husky = dogs.new Husky("Джаггер", 5);
        Dog poodle = dogs.new Poodle("Буся", 8);
        Dog shepherd = dogs.new Shepherd("Мишка", 15);
        System.out.println(husky);
        System.out.println(poodle);
        System.out.println(shepherd);
    }
}
