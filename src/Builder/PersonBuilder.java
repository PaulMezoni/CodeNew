package Builder;

public interface PersonBuilder {
    PersonBuilder setId(Integer id);

    PersonBuilder setAge(Integer age);

    PersonBuilder setFirstName(String firstName);

    PersonBuilder setLastName(String lastName);

    PersonBuilder setPhone(String phone);

    Person builder();


}
