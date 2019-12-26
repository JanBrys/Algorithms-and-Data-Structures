package SimpleSorting;

public class Person {
    private int age;
    private String first_name,last_name;

    public Person(String last_name,String first_name, int age)
    {
        this.last_name = last_name;
        this.first_name = first_name;
        this.age = age;
    }
    public Person()
    {

    }

    public String getLast_name()
    {
        return last_name;
    }
    public String getFirst_name()
    {
        return first_name;
    }
    public int getAge()
    {
        return age;
    }

    public String ToString()
    {
        return last_name + " " + first_name + " " + age;
    }
}
