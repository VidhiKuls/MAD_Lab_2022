Save as Mother.java
class Mother{
 int x;
 void show()
 {
 System.out.println("I am mother class");
 }
}
Save as Child.java
class Child extends Mother{

}
Save as Application.java
public class Application{
 public static void main(String[] args)
 {
 Mother m=new Mother();
 m.show();
 Child c=new Child();
 c.show();
 }
}
Save as Mother.java
class Mother{
 int x;
 void show()
 {
 System.out.println("Hello World");
 }
}
Save as Child.java
class Child extends Mother{
 void show()
 {
 System.out.println("Hello Juet");
 }
}
Save as Application.java
public class Application{
 public static void main(String[] args)
 {
 Mother m=new Mother();
 m.show();
 Child c=new Child();
 c.show();
 }
}
Save as Mother.java
class Mother{
 int x;
 void show()
 {
 System.out.println("I am mother class");
 }
}
Save as Child.java
class Child extends Mother{
 void show()
 {
 System.out.println("I am child class");
 }
}
Save as Application.java
public class Application{
 public static void main(String[] args)
 {
 Mother m1=new Child();
 m1.show();
 }
}
class Mother{
 int x;
 static void show()
 {
 System.out.println("I am mother class");
 }
}
class Child extends Mother{
 static void show()
 {
 System.out.println("I am Child class");
 }
}
Save as One.java:
class One{
 int x;
 public One(int xx){
 this.x=xx;
 }

}
Save as Two.java
class Two extends One{

 }
Save as Main.java
public class Main{
 public static void main(String [] args)
 {
 Two T=new Two();
 }
}
