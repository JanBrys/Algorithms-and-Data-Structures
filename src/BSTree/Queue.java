package BSTree;


public class Queue<T> {


    private Element<T> first;

    public Element<T> getFirst()
    {
        return first;
    }

    public Queue()
    {
        first = null;
    }

    public boolean isEmpty()
    {
        if(first==null)
        {
            return true;
        }
        return false;
    }

    public void enqueue(T value)
    {
        if(isEmpty())
        {
            first = new Element<>(value);
        }
        else
        {
            Element<T> temp = first;
            while(temp.getNext()!=null)
            {
                temp = temp.getNext();
            }

            Element<T> new_Element = new Element<>(value);
            temp.setNext(new_Element);
        }
    }

    public T dequeue() throws EmptyQueueException
    {
        if(isEmpty())
        {
            throw new EmptyQueueException();
        }
        else
        {
            T value_to_return = first.getValue();
            first = first.getNext();
            return value_to_return;
        }
    }

    public void showQueue()
    {
        Element<T> tail = first;

        while(tail!=null)
        {
            System.out.print(tail.getValue() + " ");
            tail = tail.getNext();
        }
        System.out.println();
    }

    public int size()
    {
        if(isEmpty())
        {
            return 0;
        }
        else
        {
            int counter = 0;
            Element<T> tail = first;
            while(tail!=null)
            {
                tail = tail.getNext();
                counter++;
            }
            return counter;
        }
    }

}

