package HomeWorkDay5Phan3;
import java.util.Scanner;
public class Employee {
	private String hoTen;
    private String maNV;
    private String sdt;
    private double heSoLuong;
    private double luong;


    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập mã nhân viên: ");
        maNV = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        sdt = sc.nextLine();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = sc.nextDouble();
        tinhLuong(); 
    }

    public void inThongTin() {
        System.out.println("Mã NV: " + maNV + " | Họ tên: " + hoTen + " | SĐT: " + sdt + " | Lương: " + luong);
    }
    public void tinhLuong() {
        luong = heSoLuong * 5_000_000; 
    }
    public double getLuong() {
        return luong;
    }
    
    
}
