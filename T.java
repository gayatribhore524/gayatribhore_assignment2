class Triangle
{
int l,b,h;
public void getarea()
{
double area=(b*h)/2;
System.out.println("area of triangle="+area);
}
public void getperimeter()
{
float perimeter=l+b+h;
System.out.println("perimeter of triangle="+perimeter);
}
}
class T
{
public static void main(String[] args)
{
Triangle t=new Triangle();
t.l=3;
t.b=4;
t.h=5;
t.getarea();
t.getperimeter();
}
}

