/* Multi-level Inheritance */
class A //super
{
    int a,b,c;
    void add()
    {
        a=10; b=20;
        c=a+b;
        System.out.println("Sum of two Numbers: "+c);
    }
    void sub()
    {
        a=10; b=20;
        c=a-b;
        System.out.println("Sub of two Numbers: "+c);
    }
}
class B extends A //sub1
{
    void multi()
    {
        a=10; b=20;
        c=a*b;
        System.out.println("Multiplication of two Numbers: "+c);
    }
    void div()
    {
        a=10; b=2;
        c=a/b;
        System.out.println("Division of two Numbers: "+c);
    }
}
class C extends B //sub2
{
    void rem()
    {
        a=10; b=3;
        c=a%b;
        System.out.println("Remainder of two Numbers: "+c);
    }
}
class Test 
{
    public static void main(String[] args) {
        C r=new C();
        r.add(); r.sub(); r.multi(); r.div(); r.rem();
    }
}