package Queues;



@SuppressWarnings("ALL")
public class FIFO<T> {

    private class Element<T>
    {
        private T value;
        private Element<T> next;

        private Element(T value)
        {
            this.value=value;
        }

        public Element() {

        }

        private T getValue()
        {
            return value;
        }
        private Element<T> getNext()
        {
            return next;
        }
        private void setNext(Element<T> next)
        {
            this.next=next;
        }
    }
    private Element head;

    public FIFO()
    {
        head=null;
    }

    public boolean isEmpty()
    {
        return head==null;
    }
    public boolean isFull()
    {
        return false;
    }

    public T dequeue() throws EmptyQueueException
    {
        if(head==null)
        {
            throw new EmptyQueueException();
        }
        T temp_value = (T)head.getValue();
        head=head.getNext();
        return temp_value;
    }
    public void enqueue(T elem) throws FullQueueException
    {
        Element<T> new_elem = new Element<T>(elem);

        Element<T> tail = head;

        if(head==null)
        {
            head = new_elem;
        }
        else
        {
            while(tail.getNext()!=null)
            {
                tail = tail.next;
            }

            tail.next = new_elem;
        }



       // new_elem.setNext(head);
       // head=new_elem;
    }
    public int size()
    {
        int temp = 0;
        if(head==null)
        {
            return 0;
        }
        Element<T> tail=head;
        while(tail!=null)
        {
            temp++;
            tail=tail.getNext();
        }
        return temp;
    }

    public T top()
    {
        if(head==null)
        {
            System.out.println("Queue is empty!");
        }
        return (T)head.getValue();
    }

    public void showFifo()
    {
        if(size()==0)
        {
            System.out.println("Queue is empty!");
        }
        Element<T> tail = head;
        while(tail!=null)
        {
            System.out.print(tail.getValue().toString() + " ");
            tail = tail.getNext();
        }
        System.out.println();
    }
    public T first()
    {
        return (T)head.getValue();
    }
}
