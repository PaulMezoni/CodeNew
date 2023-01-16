package abstracts;

public class Programmer extends Writing{
    public static void write() {
        System.out.println("write programmer");
    }

    public static void main(String[] args) {
        Writing w = new Programmer();
        Writing.write();
        Programmer.write();
        Writing.write();
        Author.write();
    }
}
