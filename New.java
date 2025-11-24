public class New
{

  public void newMethod(int num)
  {
    
  }
public static void main (String[] args)
{
  int x=0;
  while (x<10)
    {
      System.out.println(x+1);
      x++;
    }
}
  public void newMethod(int num)
    {
        System.out.printf("Right -  %10d%n", num);

        System.out.printf("Leading 0s -  %010d%n", num);

        System.out.printf("Comas -  %,d%n", num);
    }


}
