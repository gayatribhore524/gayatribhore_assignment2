class Student
{
String name;
int roll_no;
void getdata(String s,int a)
{
name=s;
roll_no=a;
}
void putdata()
{
System.out.println("name="+name);
System.out.println("roll number="+roll_no);
}
public static void main(String[] args)
{
Student s1=new Student();
s1.getdata("john",2);
s1.putdata();
}
}