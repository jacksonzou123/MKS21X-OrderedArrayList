import java.util.ArrayList;
import java.util.List;

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
      if element.compareTo(super.get(i)) {
        super.add(i, element);
      }
    }
    return true;
  }

}
