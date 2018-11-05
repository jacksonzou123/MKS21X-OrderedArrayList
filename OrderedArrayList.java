import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  private T value;

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int capacity) {
    super(capacity);
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    super.add(findIndex(element), element);
    return true;
  }

  private int findIndex(T element){
    int index = 0;
    for (int i = 0; i < this.size(); i ++){
      if (this.get(i).compareTo(element) <= 0){
        index ++;
      }
    }
    return index;
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    this.add(element);
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    if (index < size()) {
      T old = super.get(index);
      super.remove(index);
      this.add(findIndex(element),element);
      return old;
    }
    throw new IllegalArgumentException();
  }

}
