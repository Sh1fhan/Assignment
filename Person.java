public abstract class Person {
    protected String name;
    protected String surname;
    protected int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return name + " " + surname + ", age=" + age;
    }
}
