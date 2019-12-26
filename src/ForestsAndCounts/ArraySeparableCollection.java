package ForestsAndCounts;

public class ArraySeparableCollection {

    int[] array;

    public ArraySeparableCollection(int size)
    {
        array = new int[size];

    }

    public void makeSet(int value)
    {
        array[value] = -1;
    }

    public void union(int val_1,int val_2)
    {
        if(find(val_1)!=-1)
        {
            array[find(val_1)] = val_2;
        }
        else
        {
            array[val_1] = val_2;
        }

    }

    public int find(int value)
    {
        if(array[value]!=-1)
        {
            find(array[value]);
        }
        return array[value];

    }


    public void showDetailsForNode(int value)
    {
        System.out.println("Details for Node with value = " + value );

        if(array[value]==-1)
        {
            System.out.println("Parent's value: " + value);
        }
        else
        {
            System.out.println("Parent's value : " + array[value]);
        }

        if(array[value]!=-1)

        {
            if(array[find(value)]!=-1)
            {
                System.out.println("Representant's value for node: " + array[find(value)]);
            }
            else
            {
                System.out.println("Representant's value for node: " + array[value]);
            }
        }
        else
        {
            System.out.println("Representant's value for node: " + value);
        }
        System.out.println();
    }
}

