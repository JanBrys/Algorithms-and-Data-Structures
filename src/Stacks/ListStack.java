package Stacks;

public class ListStack<T> {

    private class Element<T>
    {
        private T value;
        private Element<T> next;

        public Element(T value)
        {
            this.value=value;
        }
        public T getValue()
        {
            return value;
        }
        public Element<T> getNext()
        {
            return next;
        }
        public void setNext(Element<T> next)
        {
            this.next=next;
        }
    }

    private Element<T> head;

    public ListStack()
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

    public T pop()
    {

        if(head==null)
        {
            System.out.println("stack is empty!");
            return null;
        }
        else
        {
            T return_elem = head.getValue();
            head=head.getNext();
            return return_elem;
        }

    }

    public void push(T elem)
    {
        Element<T> new_elem = new Element<>(elem);
        new_elem.setNext(head);
        head=new_elem;
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
            System.out.println("stack is empty!");
        }
        return head.getValue();
    }

    public void showStack()
    {
        if(size()==0)
        {
            System.out.println("stack is empty!");
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
        return head.getValue();
    }


}
