public class Overloader {

  static final void callMe(long x, Integer y) {       // (1) Overloaded by (2)
    System.out.println("long, Integer");
  }
  static void callMe(Integer x, long y) {       // (2) Overloaded by (1)
    System.out.println("Integer, long");
  }

  static int retVal(int x) {
    System.out.println("return int");
    return x;
  }

  static float retVal(float x) {
    System.out.println("return float");
    return (float)x;
  }

  public static void main(String[] args) {
    callMe(20, 17L);                // (3) Ambiguous call: Box 1st or 2nd argument?
    callMe(20, Integer.valueOf(17));   // (4) Calls (1): long, Integer
    callMe(Integer.valueOf(20), 17);   // (5) Calls (2): Integer, long
    //retVal(23);
    //retVal(26f);
  }
}
