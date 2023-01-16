package Builder;

public class PersonBuilderImpl implements PersonBuilder {
    Person person = new Person();

    @Override
    public PersonBuilder setId(Integer id) {
        person.id = id;
        return this;
    }

    @Override
    public PersonBuilder setAge(Integer age) {
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder setFirstName(String firstName) {
        person.firstName = firstName;
        return this;
    }

    @Override
    public PersonBuilder setLastName(String lastName) {
        person.lastName = lastName;
        return this;
    }

    @Override
    public PersonBuilder setPhone(String phone) {
        person.phone = phone;
        return this;
    }

    @Override
    public Person builder() {
        return person;
    }
}
