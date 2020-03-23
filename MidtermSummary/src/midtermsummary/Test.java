package midtermsummary;

public class Test { 
  public static void main(String[] args) {
    B b = new B();
    b.m(5);
    System.out.println("i is " + b.i);
  }
}

class A {
  int i;

  public void m(int i) {
    this.i = i;
  }
}

class B extends A {
  public void m(String s) {
  }
}