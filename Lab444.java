class A{ }
class B extends A{ }
class C extends B{}
class D{}
class Hai{
B m1(){
System.out.println("Hai - m1()");
return new B();
}
}
class Hello extends Hai{
B m1(){
System.out.println("Hello - m1()");
return new B();
}
}
public class Lab444{
public static void main(String args[]){
Hello hello = new Hello();
hello.m1();
}
}