class Hai{
void m1(){
System.out.println("Hai - m1()");
}
}
class Hello extends Hai{
void m1(){
System.out.println("Hello - m1()");
}
}
public class Lab462{
public static void main(String args[]){
Hai hai = new Hello();
hai.m1();
}
}