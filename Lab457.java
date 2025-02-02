class Hai{
private void m1(){
System.out.println("Hai - m1()");
}
}
class Hello extends Hai{
void m1(){
System.out.println("Hello - m1()");
}
}
public class Lab457{
public static void main(String args[]){
Hello hello = new Hello();
hello.m1();
}
}