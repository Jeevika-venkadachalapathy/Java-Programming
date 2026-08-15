import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int no_of_juice = sc.nextInt();
		    double profit = no_of_juice*50;
		    double sugarcane = (20.0/100)*profit;
		    double salt_mint = (20.0/100)*profit;
		    double shop_rent = (30.0/100)*profit;
		    System.out.println((int)(profit-(sugarcane+salt_mint+shop_rent)));
		}

	}
}
