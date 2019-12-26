package RBTree;



class Element<T>
{
    private T value;
    private Element<T> next;

    public Element(T value)
    {
        this.value = value;
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
        this.next = next;
    }

}
