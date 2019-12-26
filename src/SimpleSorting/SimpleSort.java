package SimpleSorting;

public class SimpleSort {

    private Person[] array;
    private CompoundComparator comparator_task_c;

    public SimpleSort(Person[] array)
    {
        this.array = array;
        comparator_task_c = new CompoundComparator();
        BaseComparator comparator_a = new LastnameComparator();
        BaseComparator comparator_b = new FirstnameComparator();
        BaseComparator comparator_c = new AgeComparator();
        comparator_task_c.addComparator(comparator_a, 0);
        comparator_task_c.addComparator(comparator_b, 1);
        comparator_task_c.addComparator(comparator_c, 2);


    }


    //                          INSERT SORTING

    public void insertSortingTaksA(int key)
    {
        System.out.println("\n\n\n~~~~INSERT SORT METHOD TASK A~~~~~~\n\n");
        BaseComparator comparator = null;

        switch(key)
        {
            case 0:
            {
                System.out.println("\nLastnames\n");
                comparator = new LastnameComparator();
            }break;

            case 1:
            {
                System.out.println("Firstnames\n");
                comparator = new FirstnameComparator();
            }break;
            case 2:
            {
                System.out.println("Ages\n");
                comparator = new AgeComparator();
            }break;
        }

        Person temp_person = new Person();

        for(int i=1;i<array.length;i++)
        {
            temp_person = array[i];
            for(int j=i;0<j;j--)
            {
                if(0<comparator.compare(array[j-1], array[j]))
                {
                    array[j] = array[j-1];
                    array[j-1] = temp_person;
                }
            }
        }

        showArray();


    }

    public void insertSortingTaskB()
    {
        System.out.println("\n\n\n~~~~INSERT SORT METHOD TASK B~~~~~~\n\n");

       LastnameComparator comparator_lastname = new LastnameComparator();
        FirstnameComparator comparator_firstname = new FirstnameComparator();
        AgeComparator comparator_age = new AgeComparator();

        Person  temp_person;

        for(int i=1;i<array.length;i++)
        {
            temp_person = array[i];
            for(int j=i;0<j;j--)
            {
                if(0==comparator_lastname.compare(array[j-1], array[j]))
                {
                    if(0==comparator_firstname.compare(array[j-1], array[j]))
                    {
                        if(0==comparator_age.compare(array[j-1], array[j]))
                        {

                        }
                        else if(0<comparator_age.compare(array[j-1], array[j]))
                        {
                            array[j] = array[j-1];
                            array[j-1] =  temp_person ;
                        }
                    }
                    else if(0<comparator_firstname.compare(array[j-1], array[j]))
                    {
                        array[j] = array[j-1];
                        array[j-1] =  temp_person ;
                    }
                }
                else if(0<comparator_lastname.compare(array[j-1], array[j]))
                {
                    array[j] = array[j-1];
                    array[j-1] =  temp_person ;
                }
            }
        }
        showArray();


    }

    public void insertSortingTaskC()
    {
        System.out.println("\n\n\n~~~~INSERT SORT METHOD TASK C~~~~~~\n\n");

        Person temp_person;

        for(int i=1;i<array.length;i++)
        {
            temp_person = array[i];
            for(int j=i;0<j;j--)
            {
                if(0<comparator_task_c.compare(array[j-1], array[j]))
                {
                    array[j] = array[j-1];
                    array[j-1] = temp_person;
                }
            }
        }
        showArray();
    }




    //                      SHOWING ARRAY

    public void showArray()
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i].ToString());
        }
    }
}
