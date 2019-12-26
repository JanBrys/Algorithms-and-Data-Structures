package SimpleSorting;

public class Main {
    public static void main(String args[])
    {
        Person A = new Person("Brys","Jan",10);
        Person B = new Person("Abratkiewicz","Adrian",55);
        Person C = new Person("Giza","Kamil",24);
        Person D = new Person("Wodecki","Zbigniew",35);
        Person E = new Person("Lis","Tomasz",19);
        Person F = new Person("Brys","Jan",20);
        Person G = new Person("Brys","Jan",10);
        Person H = new Person("Brys","Agnieszka",35);

        Person[] array = new Person[8];
        Person[] temp_array;


        array[0]=B;
        array[1]=A;
        array[2]=C;
        array[3]=D;
        array[4]=E;
        array[5]=F;
        array[6]=G;
        array[7]=H;

        temp_array = array;


        SimpleSort sort = new SimpleSort(array);
        System.out.println("\nAN ARRAY: \n");
        sort.showArray();

        sort.insertSortingTaksA(0);
        array = temp_array;
        sort = new SimpleSort(array);
        sort.insertSortingTaksA(1);
        array = temp_array;
        sort = new SimpleSort(array);
        sort.insertSortingTaksA(2);

        array = temp_array;
        sort = new SimpleSort(array);
        sort.insertSortingTaskB();

        array = temp_array;
        sort = new SimpleSort(array);
        sort.insertSortingTaskC();



    }
}

/*
       Does not work: SSTA0,SSTA1, SSTC

 */