class student
{
String name;
String address;
long phone_no;
int rollno;
student(String a,String b,long c,int d)
{
name=a;
address=b;
phone_no=c;
rollno=d;
}
}
class Stud
{
public static void main(String args[])
{
student s1=new student("Sam","Latur",77449577,1);
student s2=new student("John","osmanabad",75076230,2);
System.out.println("Rollno:"+s1.rollno+"\nNmae:"+s1.name+"\nAddress:"+s1.address+"\nPhoneno.:"+s1.phone_no);
System.out.println("Rollno:"+s2.rollno+"\nNmae:"+s2.name+"\nAddress:"+s2.address+"\nPhoneno.:"+s2.phone_no);
}
}