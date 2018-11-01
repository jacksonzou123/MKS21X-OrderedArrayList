import java.util.ArrayList;
import java.util.List;

public class NoNullArrayList<T> extends ArrayList<T>{
  private T value;

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int capacity) {
    super(capacity);
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    super.set(index, element);
    return element;
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    super.add(element);
    return true;
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    super.add(index, element);
  }
}
