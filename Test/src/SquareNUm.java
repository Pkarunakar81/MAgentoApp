import java.util.Scanner;

public class SquareNUm {
   public static void main(String args[]){
      int number=0;
      Scanner scn = new Scanner(System.in);
      while(scn.hasNext()==true)
      {
    	  System.out.println("Enter a number ::");
    	  number = scn.nextInt();
    	  System.out.println(isSquareNum(number));
    	  
      }
   }

private static boolean isSquareNum(int number) 
{
	if(number==1||number<=0)
	{
		return false;
	}
	else
	{
		int square=1;
		while(number>=square)
		{
			if(number==square)
			{
				return true;
			}
			square=square*2;
		}
		return false;	
	}
}
}