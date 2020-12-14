import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

  private int helper(T element){
    if (element==null){
      throw new IllegalArgumentException("Element cannot be null");
    }

    for (int i = 0; i<size(); i++){
      if (element.compareTo(get(i))<=0){
        return i;
      }
    }
    return size();
  }

  public void add(int index, T element){
    super.add(helper(element), element);
  }

  public boolean add (T e){
    add(helper(e), e);
    return true;
  }

  public T set(int index, T element){
    if (element==null){
      throw new IllegalArgumentException("Element cannot be null");
    }
    T original = get(index);
    remove(index);
    add(element);
    return original;
  }

  public static void main(String[] args){

  }

}
