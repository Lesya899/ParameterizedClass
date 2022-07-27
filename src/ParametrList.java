/* Спроектируйте параметризованный класс ParametrList с полями size, data и методами size(), add(value), get(index), set(index, value),
 remove(index),  insert(index, value), find(value) */

public class ParametrList <P> {
    private Object [] data;  //a field that stores all the elements of the array
    private int size;  //array size

    public ParametrList() {
        this.size = 0;
        this.data = new Object[200];
    }

    public int size() {
        return size;
    }

    //adds an element to the end of the list
    public void add(P value) {
        data[size] = value;  //write a new value to the end of the list
        size++; //increase the value of the list size variable
    }

    //gets the element at the specified index
    public P get(int index){
        return (P) data[index];
    }

    //sets the element to the specified position
    public void set(int index, P value){
        data[index] = value;
    }

    //removes element by index
    public void remove (int index){
        for (int i = index; i < size-1; i++)
        data[i] = data[i+1];
        size--;
    }

    //inserts element at index
    public void insert(int index, P value) {
        for (int i = size; i > index; i--)
        data[i] = data[i-1];
        data[index] = value;
        size++;
    }

    //finds a value
    public int find(P value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

