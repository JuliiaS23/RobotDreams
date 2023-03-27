package com.ua.robotdreams.lesson16;
import java.util.Arrays;
public class MyArrayList<T> {
   private T[] list;
   private int size;
   private final int defaultCapacity = 10;

   public MyArrayList(int capacity){
       if (capacity <= 0){
           throw new IllegalArgumentException("Capacity <= 0");
       }else {
           list = (T[]) new Object[capacity];
       }
   }

   public MyArrayList(){
       list = (T[]) new Object[defaultCapacity];
   }

    public void add(T item) {
        if (size == list.length) {
            list = increaseCapacity();
        }
        list[size] = item;
        size++;
    }

   private T [] increaseCapacity(){
       T [] temp = (T[]) new Object[(list.length * 2)];
       System.arraycopy(list, 0, temp, 0, list.length);
       return temp;
   }

   public void add(int index, T elem){
       for (int i = size; i > index; i--){
           list[i] = list[i-1];
       }
       size++;
   }
   public void delete(int index){
       for (int i = index; i < size; i++){
           list[i] = list[i+1];
       }
       size--;
   }
   public void display(){
       for (T elem: list){
           System.out.print(elem + " ");
       }
   }

   private int index(T item){
       if (item == null)
           return -1;
       for (int i  = 0; i < size; i++){
           if (item.equals(list[i]))
               return i;
       }
       return -1;
   }

    public T get(int index){
        isIndexExist(index);  //проверка корректности введенного индекса
        return list[index];
    }
   public void set(int index, T item){
       list[index] = item;
   }

    private int isIndexExist(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size
                    + ". Total size of array = " + list.length);
        }
        return index;
    }

   public boolean isEmpty(){
       return size == 0;
   }
   public String toString(){
       return Arrays.toString(Arrays.copyOf(list, size));
   }
}
