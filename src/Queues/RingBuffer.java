package Queues;

public class RingBuffer<T>
{
    private static final int DEFAULT_CAPACITY = 5;
    private T[] array;
    private int to_read,to_write;

    @SuppressWarnings("unchecked")
    public RingBuffer(int size)
    {
        array = (T[])new Object[size];
    }

    public RingBuffer()
    {
        this(DEFAULT_CAPACITY);
    }

    public void writeBuffer(T data)
    {

        if(array[to_write]==null)
        {
            array[to_write++]=data;
        }
        else
        {
            System.out.println("Buffer is full!");
        }
        if(to_write==array.length)
        {
            to_write=0;
        }


    }

    public T readBuffer()
    {
        T temp = null;

        if(array[to_read]!=null)
        {
            temp=array[to_read];
            array[to_read++]=null;
        }
        else
        {
            System.out.println("Buffer is empty!");
        }

        if(to_read==array.length)
        {
            to_read=0;
        }
        return temp;
    }

    public void showBuffer()
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=null)
            {
                System.out.print(array[i].toString() + " ");
            }
            else
            {
                System.out.print("null ");
            }
        }
        System.out.println("\n");
    }
}
