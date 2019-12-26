package SimpleSorting;

public class LastnameComparator implements BaseComparator {
    public int compare(Person p1,Person p2)
    {
        return p1.getLast_name().compareTo(p2.getLast_name());
    }
}
