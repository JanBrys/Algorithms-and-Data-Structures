package SimpleSorting;

public class AgeComparator implements BaseComparator{

    public int compare(Person p1,Person p2)
    {
        if(p1.getAge()==p2.getAge())
        {
            return 0;
        }
        else if(p1.getAge()<p2.getAge())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
