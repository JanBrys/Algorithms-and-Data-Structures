package SimpleSorting;

public class FirstnameComparator implements BaseComparator {
    public int compare(Person p1,Person p2)
    {
        return p1.getFirst_name().compareTo(p2.getFirst_name());
    }
}
