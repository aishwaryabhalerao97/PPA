

abstract class AbstractDemo
{
    public int A;
    public int B;

    public Demo()
    {
         System.out.println("Inside Demo");
         this.A=0;
         this.B=0;
    }
   
    abstract void fun();
    //virtual void fun()=0;

    void gun()
    {
              System.out.println("Inside gun of Demo");

    }
   
}
class Hello extends Demo
{
    public Hello()
    {
              System.out.println("Insidefun of Demo");
    }
     public void fun();
    {
        System.out.println("Inside fun of Hello");
        
    }
}
class AbstractDemo
{
    public static void main(String Args[])
    {
       // Demo obj = new Demo();
         Hello hobj =new Hello();
         hobj.fun();
         hobj.gun();
    }
}