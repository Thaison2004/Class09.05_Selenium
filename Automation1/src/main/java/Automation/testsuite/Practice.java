package Automation.testsuite;

import java.util.Scanner;
import org.testng.annotations.Test;
@Test
public class Practice {
	public void tinhTongMang() {
	  
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Nhap do dai mang:");
	    int n = sc.nextInt();

	    int[] a = new int[n];
	    int sum = 0;

	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử mảng thứ " + (i + 1) + ": ");
	        a[i] = sc.nextInt();
	        sum += a[i];
	    }

	    System.out.println("Tổng các phần tử trong mảng là: " + sum);
	}
	@Test
	public void timSoLonNhatMang() {
		  
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Nhap do dai mang:");
	    int n = sc.nextInt();

	    int[] a = new int[n];
	    int sum = 0;

	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử mảng thứ " + (i + 1) + ": ");
	        a[i] = sc.nextInt();
	        
	    }
	    int max = a[n];
	    for (int i = 0; i < n; i++)
	    {
	    	if (a[i] > max)
	    	{
	    		max = a[i];
	    	}
	    }
	    System.out.println("So lon nhat la :" + max);
	    
	}
}
