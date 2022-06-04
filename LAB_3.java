Save as bharatvanshi.java
abstract class bharatvanshi
{
 void fighter()
 {
 System.out.println(" bharatvanshi figter");
 }
 abstract void kind();
 abstract void obey();
 abstract void notorious();
}
Save as pandavas.java
class pandavas extends bharatvanshi
{
 void obey()
 {
 System.out.println("pandavas obedience");
 }
 void kind()
 {
 System.out.println("pandavas kind");
 }
 void notorious()
 {
 System.out.println("not notorious");
 }
}
Save as Kauravas.java
class Kauravas extends bharatvanshi{
 void notorious()
 {
 System.out.println("notorious kauravas");
 }
 void obey()
 {
 System.out.println("disobedience kauravas");
 }
 void kind()
 {
 System.out.println(" not kind");
 }
}
Save as bheem.java
class bheem extends pandavas{
 void kind()
 {
 System.out.println("less kind");
 }
 void obey()
 {
 System.out.println("obedeience bheem");
 }
}
Save as arjun.java
class arjun extends pandavas{
 void kind()
 {
 System.out.println("arjun is kind");
 }
 void obey()
 {
 System.out.println("obedeience arjun");
 }
}
Save as duryodhan.java
class duryodhan extends Kauravas{
 void notorious()
 {
 System.out.println("duryodhan were disobedient");
 }
 void obey()
 {
 System.out.println("disobedience duryodhan");
 }
}
Save as vikarn.java
class vikarn extends pandavas{
 void kind()
 {
 System.out.println("vikarn is kind");
 }
 void obey()
 {
 System.out.println("obedeient vikarn");
 }
}
Savw as Main.java
public class Main
{
public static void main(String[] args) {
 arjun a=new arjun();
 a.fighter();
 a.obey();
 a.kind();
 bheem b=new bheem();
 b.fighter();
 b.obey();
 b.kind();
 vikarn v=new vikarn();
 v.fighter();
 v.obey();
 v.kind();
 pandavas p=new pandavas();
 p.kind();
 p.obey();
 duryodhan d=new duryodhan();
 d.notorious();
 d.fighter();
}
}



Save as Testtable.java
interface Testtable
{
 void display();
}
Save as Test.java
class test implements Testtable{

}




abstract class AbsTest implements Testtable{
 void display()
 {
 System.out.println("abstract class");
 }
}
public class Main
{
public static void main(String[] args) {
AbsTest t=new AbsTest();
t.display();
}
}





Save as Duck.java
abstract class Ducks{
 void swim()
 {
 System.out.println("can swim");
 }
 abstract void fly();
 abstract void speak();
}
Save as RD.java
class RD extends Ducks{
 void fly()
 {
 System.out.println("RD cant fly");
 }
 void speak()
 {
 System.out.println("RD squeaks");
 }
}
Save as WD.java
class WD extends Ducks{
 void fly()
 {
 System.out.println("WD cant fly");
 }
 void speak()
 {
 System.out.println("WD mute");
 }
}
Save as RHD.java
class RHD extends Ducks{
 void fly()
 {
 System.out.println("RHD can fly");
 }
 void speak()
 {
 System.out.println("RHD quack");
 }
}
Save as LD.java
class LD extends Ducks{
 void fly()
 {
 System.out.println(" LD can fly");
 }
 void speak()
 {
 System.out.println("LD quack");
 }
}
Save as Main.java
public class Main
{
public static void main(String[] args) {
RD R=new RD();
R.fly();
R.speak();
R.swim();
LD L=new LD();
L.fly();
L.speak();
L.swim();
RHD RH=new RHD();
RH.fly();
RH.speak();
RH.swim();
WD W=new WD();
W.fly();
W.speak();
W.swim();
}
}
