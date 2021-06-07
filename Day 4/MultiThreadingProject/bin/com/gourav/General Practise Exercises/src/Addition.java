public class Addition
{
int a;
int b;
int c;
public void sum(int a, int b)
{
this.a=a;
this.b=b;
c=this.a+this.b;
System.out.println(c);
}
public void diff(int a, int b)
{
this.a=a;
this.b=b;
c=this.a-this.b;
System.out.println(c);
}
public void prod(int a, int b)
{
this.a=a;
this.b=b;
c=a*b;
System.out.println(c);
}
public static void main(String args[])
{
Addition a= new Addition();
a.sum(10,5);
a.diff(10,5);
a.prod(10,5);
}
}