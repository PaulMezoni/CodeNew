package Builder;

class Main {
    public static void main(String[] args) {
        Person paul = new PersonBuilderImpl().setFirstName("Paul").setAge(30).builder();
        Person max = new PersonBuilderImpl().setId(1).setFirstName("Max").setLastName("Zaxezin").setAge(36).setPhone("+8910").builder();

        System.out.println(paul);
        System.out.println(max);
    }
}
