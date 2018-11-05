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
    for (int i = 0; i < super.size(); i++) {
      if (element.compareTo(super.get(i)) > 0) {
        super.add(i, element);
      }
    }
    return true;
  }

  public void add(int index, T element) {
    super.add(element);
  }

}
