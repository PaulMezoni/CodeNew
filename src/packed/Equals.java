package packed;

import java.util.HashSet;
import java.util.Set;

public class Equals {
    public static void main(String[] args) {
        Person person = new Person(1, "Max");
        Person person1 = new Person(1, "Max");
        Person person2 = new Person(1, "Max");
        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person);
        System.out.println(personSet);
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person2.getClass());


        boolean max = personSet.contains(new Person(1, "Max"));
        System.out.println(max);

    }

    static class Person {
        Integer id;
        String name;

        public Person(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Person)) return false;
//            Person person = (Person) o;
//            if (getId() != null ? !getId().equals(person.getId()) : person.getId() != null) return false;
//            return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
//        }

        @Override
        public int hashCode() {
            int result = getId() != null ? getId().hashCode() : 0;
            result = 31 * result + (getName() != null ? getName().hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
