package OneWayLinkedListWithHead;

import java.util.*;

public class List<T> {
    private class Element {
        private T value;
        private Element next;

        public T getValue() {
            return value;
        }

        private Element getNext() {
            return next;
        }

        public void setValue(T value) {
            this.value = value;
        }


        private void setNext(Element next) {
            this.next = next;
        }

        Element(T data) {
            this.value = data;
            next = null;
        }
    }

    private class InnerIterator implements Iterator<T> {
        Element act_element;

        public InnerIterator() {
            act_element = head;
        }

        public boolean hasNext() {
            return act_element != null;
        }

        public T next() {
            T value = act_element.getValue();
            act_element = act_element.getNext();
            return value;
        }
    }

    public Iterator<T> iterator() {
        return new InnerIterator();
    }


    private Element head = null;

    public void insert(int index, T data) {
        Element new_element = new Element(data);
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0 && head == null) {
            head = new_element;
            new_element.setNext(null);
        } else if (index == 0 && head != null) {
            Element temp_element = new_element;
            temp_element = head;
            head = new_element;
            head.setNext(temp_element);
        } else {
            Element tail = head;
            int j = 0;
            while (tail.getNext() != null) {
                tail = tail.getNext();
                j++;
            }
            if (index == j + 1) {
                tail.setNext(new_element);
            } else if (j + 1 < index) {
                throw new IndexOutOfBoundsException();
            } else {
                Element act_Element = head;
                int i = index;
                while (0 < (i - 1)) {
                    act_Element = act_Element.getNext();
                    i--;
                }
                new_element.setNext(act_Element.getNext());
                act_Element.setNext(new_element);
            }
        }
    }

    public T get(int index) {
        int i = index;
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            return head.getValue();
        } else {
            Element act_Element = head;


            while (i > 0) {
                act_Element = act_Element.getNext();
                i--;
            }
            return act_Element.getValue();
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        } else {
            Element tail = head;
            int i = 1;
            while (tail.getNext() != null) {
                tail = tail.getNext();
                i++;
            }
            return i;
        }
    }

    public void clear() {
        head = null;
    }

    public void showList() {
        if (head == null) {
            System.out.println("List is not implemented yet!!");
        } else if (head.getNext() == null) {
            System.out.println(head.getValue().toString());
        } else {
            Element tail = head;
            for (int i = 0; i < size(); i++) {
                System.out.println(tail.getValue().toString());
                tail = tail.getNext();
            }
        }
    }

    public void showListWithIterator() {
        Iterator<T> iter = iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }

    }

    public Element delete(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0 && head.getNext() == null) {
            Element ret_element = getHead();
            head = null;
            return ret_element;
        } else if (index == 0 && head.getNext() != null) {
            Element ret_element = getHead();
            head = head.getNext();
            return ret_element;
        } else {
            Element tail = head;
            int j = 0;
            while (tail.getNext() != null) {
                tail = tail.getNext();
                j++;
            }
            if (j < index) {
                System.out.println("Cant delete an Element which does not exist! Program will return null!");
                return null;
            } else {
                Element act_element = head;
                int i = index;
                while (0 < (i - 1)) {
                    act_element = act_element.getNext();
                    i--;
                }
                Element ret_element = act_element.getNext();
                act_element.setNext(ret_element.getNext());
                return ret_element;
            }
        }
    }

    public T set(int index, T value)
    {

        Element del_element = new Element(head.getValue());
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            head.setValue(value);
            return del_element.getValue();
        }
        if (index + 1 == size()) {
            Element tail = head;
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
            del_element.setValue(tail.getValue());
            tail.setValue(value);
            return del_element.getValue();
        } else {

            Element act_element = head;
            for (int j = 0; j < index; j++) {
                act_element = act_element.getNext();
            }
            del_element.setValue(act_element.getValue());
            act_element.setValue(value);
            return del_element.getValue();
        }
    }

    public int indexOf(T value) {

        Element act_element = head;
        for (int i = 0; i < size(); i++) {
            if (act_element.getValue().equals(value)) {
                return i;
            }
            act_element = act_element.getNext();
        }
        System.out.println("List does not contain specified value! Program will return -1!");
        return -1;
    }

    public boolean contains(T value) {
        if (indexOf(value) != -1) {
            return true;
        }
        return false;
    }


    public Element getHead()
    {
        return head;
    }
}
