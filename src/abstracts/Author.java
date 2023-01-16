package abstracts;

public class Author extends Writing{
    public static void write() {
        System.out.println("abstracts.Writing author");
    }

    public static void main(String[] args) {
        Writing w = new Author();
        w.write();
    }
}
