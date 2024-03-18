public class MyClass {
  public static void main(String[] args) {
      B b = new B("Test");
  }
}

class A {
  A() {
      this("1", "2");
      System.out.println("here in no args cstrctr for A");
  }

  A(String s, String t) {
    this(s + t);
System.out.println("here in two args cstrctr for A");
  }

  A(String s) {
System.out.println("here in one arg cstrctr for A");
      System.out.println(s);
  }
}

class B extends A {
  B(String s) {
System.out.println("here in one arg cstrctr for B");
      System.out.println(s);
  }

  B(String s, String t) {
      this(t + s + "3");
System.out.println("here in two arg cstrctr for B");
  }

  B() {
      super("4");
System.out.println("here in no arg cstrctr for B");
  };
}
