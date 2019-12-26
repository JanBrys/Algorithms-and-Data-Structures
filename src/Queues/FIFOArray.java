package Queues;

public class FIFOArray<T> {

    private static final int DEFAULT_CAPACITY = 16;
    T array[];
    int endIndex;

    @SuppressWarnings("unchecked")
    public FIFOArray(int size)
    {
        array = (T[])new Object[size];
    }

    public FIFOArray()
    {
        this(DEFAULT_CAPACITY);
    }

    public boolean isEmpty()
    {
        return endIndex==0;
    }

    public boolean isFull()
    {
        return endIndex==array.length;
    }

    public T dequeue() throws EmptyQueueException
    {
        if(isEmpty())
        {
            throw new EmptyQueueException();
        }
        else
        {
            T out_value = array[0];
            T temp_value = array[0];
            for(int i=0;i<endIndex;i++)
            {
                if(i+1<endIndex)
                {
                    array[i]=array[i+1];
                }

            }
            endIndex--;
            return out_value;
        }
    }

    public void enqueue(T elem) throws FullQueueException
    {
        if(endIndex==array.length)
        {
            System.out.println("Queue is full!");
        }
        else
        {
            array[endIndex++]=elem;
        }

    }

    public int size()
    {
        return endIndex;
    }

    public T first() throws EmptyQueueException
    {
        if(isEmpty())
        {
            throw new EmptyQueueException();
        }
        return array[0];
    }

    public void showQueue()
    {
        for(int i=0;i<endIndex;i++)
        {
            System.out.print(array[i].toString() + " ");
        }
        System.out.println("\n");
    }

    public int bufforsize()
    {
        return array.length;
    }

}
