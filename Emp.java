import java.util.*;
class Emp
{
String name;
int age;
String post;
double sal;
public Emp(String s,int a,String p,double s2)
{
this.name=s;
this.post=p;
this.age=a;
this.sal=s2;
}
void show()
{
System.out.println("name="+name);
System.out.println("post="+post);
System.out.println("age+"+age);
System.out.println("sal="+sal);
}
public static void main(String args[])
{
Emp e1=new Emp("a",50,"p",10000);
Emp e2=new Emp("a",50,"b",10000);
e1.show();
e2.show();
}
}
