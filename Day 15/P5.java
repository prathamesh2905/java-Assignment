class Thite
{
void add(int...a)
{
for(int b:a)
{
System.out.print(" \t"+b);
}
}
public static void main(String args[])
{
Thite y=new Thite(); y.add(20,30,40,50);
}
}