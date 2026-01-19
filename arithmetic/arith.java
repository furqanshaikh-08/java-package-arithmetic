package arithmetic;
public class arith
{
  public void add(int a,int b)
  {
     int c;
     c=a+b;
      System.out.println("Addition is:"+c);
   }
  public void subtract(int a,int b)
  {
   int c;
   c=a-b;
   System.out.println("Subtraction is:"+c);
  }
  public void multiply(int a,int b)
  {
   int c;
   c=a*b;
   System.out.println("Multiplication is:"+c);
  }
  public void divide(int a,int b)
  {
    if(b==0)
    {
      System.out.println("/Divide by zero");
       return;
     }
    else
   {
       int c;
      c=a/b;
      System.out.println("Division is:"+c);
    }
  }
public void mod(int a,int b)
{
  int c;
  c=a%b;
  System.out.println("Modulus is:"+c);
}
}