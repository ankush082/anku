import java.util.*;
class Demo
{
  public static void main(String gg[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of rows");
      int r=sc.nextInt();
      System.out.println("enter number of cols");
      int c=sc.nextInt();
      int ary[][]=new int[r][c];
      System.out.println("enter"+r*c+"elements :");
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
           ary[i][j]=sc.nextInt();    
        }
      }
      System.out.println("matrix :-");
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<r;j++)
        {
          System.out.print(ary[i][j]+" ");
        }
        System.out.println();
      }    
  }
}