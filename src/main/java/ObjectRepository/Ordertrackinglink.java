package main.java.ObjectRepository;

import org.testng.annotations.Test;

public class Ordertrackinglink 
{
	
	
	
	
	
	
	
	
	public static String username;
	@Test
	public static void shubha() throws Throwable 
	{
		username = main.java.genericLib.Excellib.getExcelData("./testData/testData.xlsx","sdf", 0, 0);
	}

public static void main(String[] args) {
	try {
		shubha();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
