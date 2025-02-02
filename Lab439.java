class Hai{
void m1(){
System.out.println("Hai - m1()");
}
}
class Hello extends Hai{
void M1(){
System.out.println("Hello - M1()");
}
}
public class Lab439{
public static void main(String args[]){
Hello hello = new Hello();
hello.m1();
hello.M1();
}
}