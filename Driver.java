public class Driver{
  public static void main(String[] args) {
    NoNullArrayList<String> a = new NoNullArrayList<>();
    a.add("cat");
    System.out.println(a.get(0));
    a.add("cow");
  }
}
