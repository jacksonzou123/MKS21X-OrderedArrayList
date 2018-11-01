import java.util.ArrayList;
import java.util.List;

public class NoNullArrayList<T> extends ArrayList<T>{
  private T value;

  public NoNullArrayList<T>() {
    super<T>();
  }

  public NoNullArrayList<T>(int capacity) {
    super<T>(capacity);
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    super.set(index, element);
    return element;
  }

  public Boolean add(T element) {
    if (element = null) {
      throw new IllegalArgumentException();
    }
    super.add(element);
  }

  public void add(int index, T element) {
    if (element = null) {
      throw new IllegalArgumentException();
    }
    super.add(index, element);
  }
}
