

class Demo extends Thread
{
     public void run()  //Running state
{
          for(int i = 1; i < 1000; i++)
          {}
        System.out.println("End od Thread");
        }
}
class Multi4
 {
    public static void main(String args[]) throws Exception
    {
        System.out.println("Current thread is : "+ Thread.currentThread().getName());

        Demo obj1 = new Demo();  //New state
           obj1.start();   //Runnable state
        obj1.join();
        System.out.println("End od main thread"); //Dead state
    }
 }