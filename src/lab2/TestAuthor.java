package lab2;

public class TestAuthor {
        public static void main(String[] args) {
            Author book = new Author("Nikita", "nik.vilkov.2004@mail.ru", 'm');
            System.out.println(book);
            book.setEmail("ggggg");
            System.out.println(book);
            System.out.println(book.getEmail());
            System.out.println(book.getGender());
            System.out.println(book.getName());
        }
}
