import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public void add(int index, T element){
    if (element==null){
      throw new IllegalArgumentException("Element cannot be null");
    }
    super.add(index, element);
  }

  public boolean add (T e){
    if (e==null){
      throw new IllegalArgumentException("Element cannot be null");
    }
    super.add(e);
    return true;
  }

  public T set(int index, T element){
    super.set(index, element);
    return element;
  }

  public static void main(String[] args){

  }

}
