# primer
import java.io.*;
import java.util.*;
public class Primerange
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    int n1,n2,flag=0;
    System.out.println("Enter the range");
    n1=sc.nextInt();
    n2=sc.nextInt();
    System.out.println("The prime numbers of given range");
    for(int i=n1; i<=n2; i++)
    {
      for(int j=2; j<i;j++)
      {
        
        if(i%j==0)
        {
          flag=0;        
          
          break;
        }
        else
        {
          
          flag=1;
          }
          }

        if(flag==1)
        {
          
          System.out.println(i);
          
        }
      }
    }
  }

  
