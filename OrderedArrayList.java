import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

  private int helper(T element){
    for (int i = 0; i<size(); i++){
      if (element.compareTo(get(i))>=0){
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
    super.remove(index);
    add(helper(element), element);
    return element;
  }

  public static void main(String[] args){

  }

}
