package lab12;
public class Dishes {
    public abstract class Dish {
        String type;
        protected int price;
        protected String color;
        public Dish (int price, String color) {
            this.price = price;
            this.color = color;
        }
        public int getPrice () {
            return this.price;
        }
        public String getColor () {
            return this.color;
        }
        abstract public String toString();
    }
    public class Pan extends Dish {
        String type = "Сковорода";
        String material;
        public Pan (int price, String color, String material) {
            super(price, color);
            this.material = material;
        }
        public String getMaterial () {
            return this.material;
        }
        @Override
        public String toString() {
            return "Вид посуды: " + type + "; Цена: " + getPrice() + "; Цвет: " + getColor() + "; Материал: "
                    + getMaterial();
        }
    }
    public class Mug extends Dish {
        String type = "Кружка";
        int size;
        String material;
        public Mug (int price, String color, String material, int size) {
            super(price, color);
            this.material = material;
            this.size = size;
        }
        public String getMaterial () { return this.material; }
        public int getSize () {
            return this.size;
        }
        @Override
        public String toString() {
            return "Вид посуды: " + type + "; Цена: " + getPrice() + "; Цвет: " + getColor() + "; Материал: "
                    + getMaterial() + "; Объём(в мл): " + getSize();
        }
    }
    public class Plate extends Dish {
        String type = "Тарелка";
        String material;
        String pattern;
        public Plate(int price, String color, String material, String pattern) {
            super(price, color);
            this.material = material;
            this.pattern = pattern;
        }
        public String getMaterial() {
            return this.material;
        }
        public String getPattern() {
            return this.pattern;
        }
        @Override
        public String toString() {
            return "Вид посуды: " + type + "; Цена: " + getPrice() + "; Цвет: " + getColor()
                    + "; Материал: " + getMaterial() + "; Узор: " + getPattern();
        }
    }
    public static void main(String[] args) {
        Dishes dishes = new Dishes();
        Dish mug = dishes.new Mug(100, "синий", "стeкло", 500);
        Dish pan = dishes.new Pan(2000, "серый", "сталь");
        Dish plate = dishes.new Plate(300, "белый", "керамика", "хохлома");
        System.out.println(mug);
        System.out.println(pan);
        System.out.println(plate);
    }
}