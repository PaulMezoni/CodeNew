public class Person {
    Integer id;
    String firstName;
    String surName;
    String country;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class Builder {
        protected Person person;

        public Builder() {
            person = new Person();
        }

        public Builder firstName(String firstName) {
            person.firstName = firstName;
            return this;
        }

        public Builder surName(String surName) {
            person.surName = surName;
            return this;
        }

        public Person build() {
            return person;
        }

    }

}

