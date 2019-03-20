public class Person {

    String firstName;
    String lastName;
    int age;


    public Person(String firstName, String lastName, int age) throws InvalidAgeException {
        if (age > 120) {
            throw new InvalidAgeException("Old");
        }if (age < 1){
            throw new InvalidAgeException("Ung");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        this.age = age;
    }

}
