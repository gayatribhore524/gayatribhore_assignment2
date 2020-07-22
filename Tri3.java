class Triangle{
int l,b,h;
Triangle(int p,int q,int r)
{
l=p;
b=q;
h=r;
}
public double getArea(){
double s = (l+b+h)/2.0;
return Math.pow((s*(s-l)*(s-b)*(s-h)),.5);
}
public double getPerimeter(){
return (l+b+h)/2.0;
}
}
class Tri3{
public static void main(String[] args){
Triangle t = new Triangle(2,5,6);
System.out.println("Area=" +t.getArea());
System.out.println("perimeter=" +t.getPerimeter());
}
}