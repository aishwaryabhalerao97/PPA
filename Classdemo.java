
class Marvelleous
{
    public int i;
    public int j;

    public Marvelleous()
    {
         System.out.println("Inside Default constructor");
         this.i=0;
         this.j=0;
    }
    public Marvelleous(int a,int b)
    {
          System.out.println("Inside Parameterised constructor");

    }

    public void Fun()
    {
        System.out.println("Inside Fun method");
    }
}
class Classdemo
{
     public static void main(String args[])
     {
        Marvelleous mobj1 = new Marvelleous();
        Marvelleous mobj2 = new Marvelleous(11,21);
        
        System.out.println("Inside main");
     }
}
