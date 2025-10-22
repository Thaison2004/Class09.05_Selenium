package Automation.testsuite;
import java.util.Scanner;

import org.testng.annotations.Test;
public class java_BTVN_Day7 {
	private String hoTen;
    private String maNV;
    private String sdt;
    
    public static void main(String[] args)
    {
    	java_BTVN_Day7 test = new java_BTVN_Day7();
    	test.nhapThongTin();
    	test.inThongTin();
    	
    }
    
    @Test
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập mã nhân viên: ");
        maNV = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        sdt = sc.nextLine();
        System.out.print("Nhập hệ số lương: ");
        
    }
    public void inThongTin() {
        System.out.println("Mã NV: " + maNV + " | Họ tên: " + hoTen + " | SĐT: " + sdt );
    }

}
