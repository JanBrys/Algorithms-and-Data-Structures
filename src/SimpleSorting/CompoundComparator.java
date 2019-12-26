package SimpleSorting;

public class CompoundComparator implements BaseComparator {

    private BaseComparator[] comparators;

    public CompoundComparator() {
        comparators = new BaseComparator[3];
    }

    public void addComparator(BaseComparator comparator, int index)
    {
        comparators[index] = comparator;
    }

    public int compare(Person p1,Person p2)
    {
        int result=Integer.MIN_VALUE,index=0;

        while(comparators.length<index && result!=0)
        {
            result = comparators[index++].compare(p1,p2);

        }
        return result;
    }


}
