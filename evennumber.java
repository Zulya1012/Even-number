public class evennumber {
  public static void main(String[] arg) {
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 1) {
        continue;
      }
      System.out.println(i);
    }
  }
}
