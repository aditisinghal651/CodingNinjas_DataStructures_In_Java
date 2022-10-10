package classesandObjects;

public class DynamicArray {
    private int data[];
    private int nextElementIndex;

    public DynamicArray(){
        data = new int[5];
        nextElementIndex = 0;
    }

    public int size(){
        return nextElementIndex;
    }

    public boolean isEmpty(){
        return nextElementIndex == 0;
    }

    public int get(int i){
        if(i >= nextElementIndex){
            //Throw error
            return -1;
        }
        return data[i];
    }

    public void set(int index, int num){
        if(index >= nextElementIndex){
            //error
            return;
        }
        data[index] = num;
    }

    public int removeLast(){
        if(nextElementIndex == 0){
            return -1;
        }
        int temp = data[nextElementIndex -1];
        nextElementIndex--;
        return temp;
    }

    public void add(int elem){
        if(nextElementIndex == data.length){
            doubleCapacity();
        }
        data[nextElementIndex] = elem;
        nextElementIndex++;
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for(int i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }
    }

}
