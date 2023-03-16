class Unary_op2
{
public static void main(String args[])
{
int a=10;
int b=10;
System.out.println(a++);
System.out.println(++a);
System.out.println(a--);
System.out.println(--a);

System.out.println(a++ + ++b);
System.out.println(++a + a++);
System.out.println(b++ + ++a);

System.out.println(a-- + --b);
System.out.println(--a + --a);
System.out.println(b-- + --a);
}
}