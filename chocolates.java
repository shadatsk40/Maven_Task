package com.chocolates;
import java.util.*;

import com.sweets.sweets;

public class chocolates  extends sweets{
	Scanner in=new Scanner(System.in);
	public static int countx=0;
	public void CHOCOLATE1()
	{
		System.out.println("enter no.of choco");
		int numbersx1=in.nextInt();
		System.out.println("choco 1:"+numbersx1);
		countx=countx+numbersx1;
	}
	public void CHOCOLATE2()
	{
		System.out.println("enter no.of choco");
		int numbersx2=in.nextInt();
		System.out.println("choco 2:"+numbersx2);
		countx=countx+numbersx2;
	}
	
	
}
