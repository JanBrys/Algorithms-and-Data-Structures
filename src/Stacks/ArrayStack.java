package Stacks;

public class ArrayStack<T> {

    public static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int top_index;


    @SuppressWarnings("unchecked")
    public ArrayStack(int size)
    {
        array = (T[]) (new Object[size]);
        top_index=0;
        for(int i=0;i<size;i++)
        {
            array[i]=null;
        }
    }

    public ArrayStack()
    {
        this(DEFAULT_CAPACITY);
    }

    public boolean isEmpty()
    {
        return top_index==0;
    }

    public boolean isFull()
    {
        return top_index==array.length;
    }

    public T pop() //throws EmptyStackException
    {
        T temp_value = null;
        if(isEmpty())
        {
            System.out.println("stack is empty!");
            //throw new EmptyStackException();
        }
        else
        {
            temp_value = array[top_index-1];
            array[top_index]=null;
            top_index--;
            tooBig();
            tooSmall();
        }
        return temp_value;
    }

    public void push(T elem)
    {

        if(isFull())
        {
            System.out.println("Stack is full!");
        }
        else
        {
            array[top_index] = elem;
            top_index++;
        }

        tooSmall();
        tooBig();

        //tooSmall();
        //tooBig();

    }

    public int size()
    {
        return array.length;
    }

    public T top()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty!");
        }
        return array[top_index-1];
    }

    @SuppressWarnings("unchecked")
    public void tooBig()
    {
        if(top_index<=0.2*array.length)
        {
            int temp_size = (int) (0.5*array.length);
            T[] temp_array = (T[]) (new Object[temp_size]);

            for(int i=0;i<top_index;i++)
            {
                temp_array[i] = array[i];
            }
            array = (T[]) (new Object[temp_size]);
            for(int j=0;j<top_index;j++)
            {
                array[j] = temp_array[j];
            }
        }
    }


    @SuppressWarnings("unchecked")
    public void tooSmall()
    {
        if(0.8*array.length<=top_index)
        {
            int temp_index = top_index;
            int temp_size = 2*array.length;
            T[] temp_array = (T[]) (new Object[temp_size]);

            for(int i=0;i<top_index;i++)
            {
                temp_array[i] = array[i];
            }
            array = (T[]) (new Object[temp_size]);
            for(int j=0;j<top_index;j++)
            {
                array[j] = temp_array[j];
            }
        }
    }

    public void showStack()
    {

        if(top_index==0)
        {
            System.out.println("Stack is empty!");
        }
        for(int i=0;i<top_index;i++)
        {
            System.out.print(array[i].toString()+ " ");

        }
        System.out.println();
    }

}
