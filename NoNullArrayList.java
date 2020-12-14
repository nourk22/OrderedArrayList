import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public void add(int index, T element){
    if (element==null){
      throw new IllegalArgumentException("Element cannot be null");
    }else{
      super.add(index, element);
    }
  }

  public boolean add (T e){
    if (e==null){
      throw new IllegalArgumentException("Element cannot be null");
    }else{
      super.add(e);
      return true;
    }
  }

  public T set(int index, T element){
    if (element==null){
      throw new IllegalArgumentException("Element cannot be null");
    }else{
      return super.set(index, element);
    }
  }

  public static void main(String[] args){

  }

}
