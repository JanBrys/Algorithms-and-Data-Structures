package ForestsAndCounts;



public class ArrayListCount
{
    Element[] array;
    int nodes=1;

    public ArrayListCount()
    {
        array = new Element[nodes];
    }

    public void addNode()
    {
        array = resize();
    }


    public Element[] resize()
    {
        nodes++;

        Element[] temp = new Element[nodes];

        for(int i = 0 ; i < array.length; i++)
        {
            temp[i] = array[i];
        }
        return array = temp;

    }

    public void addLink(int node_1,int node_2)
    {
        Element temp_1 = new Element(node_1,null);
        Element temp_2 = new Element(node_2,null);

        if(array[node_1-1]==null &&array[node_2-1]==null )
        {
            array[node_1-1] = temp_2;
            array[node_2-1] = temp_1;
        }
        else if(array[node_1-1]==null &&array[node_2-1]!=null)
        {
            array[node_1-1] = temp_2;
            getLast(node_2-1).next = temp_1;
        }
        else if(array[node_2-1]==null &&array[node_1-1]!=null)
        {
            array[node_2-1] = temp_1;
            getLast(node_1-1).next = temp_2;
        }
        else if (array[node_2-1]!=null &&array[node_1-1]!=null)
        {
            getLast(node_2-1).next = temp_1;
            getLast(node_1-1).next = temp_2;
        }


    }

    public Element getLast(int index)
    {
        Element temp = new Element();
        temp = array[index];

        while(temp.next!=null)
        {
            temp = temp.next;
        }
        return temp;
    }

    public void showCount()
    {
        Element temp = new Element();
        for(int i=0;i<array.length; i++)
        {
            temp = array[i];
            if(temp!=null)
            {
                System.out.println("Index : " + (i+1));
                System.out.print(temp.value + " ");
                while(temp.next!=null)
                {

                    temp = temp.next;
                    System.out.print(temp.value + " ");
                }
                System.out.println();
            }
        }

    }
}

