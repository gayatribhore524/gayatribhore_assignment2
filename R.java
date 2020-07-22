class Rectangle
{
int length,breadth;
Rectangle(int i,int k)
{
length=i;
breadth=k;
}
public int area()
{
return(length*breadth);
}
}
class R
{
public static void main(String[] args)
{
Rectangle r=new Rectangle(4,5);
Rectangle r1=new Rectangle(5,8);
System.out.println("area="+r.area());
System.out.println("area2="+r1.area());
}
}

