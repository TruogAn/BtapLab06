package lab06;
import java.util.Scanner;
public class HocSinh {
	Scanner input = new Scanner(System.in);
	public String hoTen;
	public String lop;
	public double toan;
	public double ly;
	public double hoa;
	public double diemTrungBinh;
	public Hocsinh(String hoTen, String lop) {
	this.hoTen=hoTen;
	this.lop=lop;
	}
	public String gethoTen() {
	return hoTen;
	}
	public String getlop() {
	return lop;
	}
	public double gettoan() {
	return toan;
	}
	public double getly() {
	return ly;
	}
	public double gethoa() {
	return hoa;
	}
	public double getdiemTrungBinh() {
	return diemTrungBinh;
	}
	public void setdiemTrungBinh(double diemTrungBinh) {
	this.diemTrungBinh=diemTrungBinh;
	}
	public void sethoTen(String string) {
	this.hoTen=hoTen;
	}
	public void setlop(String string) {
	this.lop=lop;
	}
	public void settoan(double d) {
	this.toan=d;
	}
	public void sethoa(double d) {
	this.hoa=d;
	}
	public void setly(double d) {
	this.ly=d;
	}
	void nhap() {
	System.out.println("nhap ho ten");
	sethoTen(input.nextLine());
	System.out.println("nhap lop");
	setlop(input.nextLine());
	System.out.println("nhap diem toan");
	settoan(input.nextDouble());
	System.out.println("nhap diem ly");
	setly(input.nextDouble());
	System.out.println("nhap diem hoa");
	sethoa(input.nextDouble());
	double diemTrungBinh = (gettoan() + getly() + gethoa()) / 3;
	setdiemTrungBinh(diemTrungBinh);
	System.out.println("diem trung binh la: " + getdiemTrungBinh());
	}
public class HocsinhChuyenToan extends Hocsinh {
	public HocsinhChuyenToan(String hoTen, String lop) {
	super(lop, lop);
	}
	void Nhap() {
	System.out.println("nhap ho ten");
	sethoTen(input.nextLine());
	System.out.println("nhap lop");
	setlop(input.nextLine());
	System.out.println("nhap diem toan");
	settoan(input.nextDouble());
	System.out.println("nhap diem ly");
	setly(input.nextDouble());
	System.out.println("nhap diem hoa");
	sethoa(input.nextDouble());
	double diemTrungBinh = (gettoan()*2 + getly() + gethoa()) / 3;
	setdiemTrungBinh(diemTrungBinh);
	System.out.println("diem trung binh la: " + getdiemTrungBinh());
	}
	}
public class main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Hocsinh hocSinh = new Hocsinh("", "");
	System.out.println("Nhập thông tin học sinh:");
	hocSinh.nhap();
	System.out.println("Thông tin học sinh:");
	System.out.println("Tên: " + hocSinh.gethoTen());
	System.out.println("Lớp: " + hocSinh.getlop());
	System.out.println("Điểm toán: " + hocSinh.gettoan());
	System.out.println("Điểm lý: " + hocSinh.getly());
	System.out.println("Điểm hóa: " + hocSinh.gethoa());
	System.out.println("Điểm trung bình: " + hocSinh.getdiemTrungBinh());
	HocsinhChuyenToan hocSinhChuyenToan = new HocsinhChuyenToan("", "");
	System.out.println("Nhập thông tin học sinh chuyên toán:");
	hocSinhChuyenToan.Nhap();
	System.out.println("Thông tin học sinh chuyên toán:");
	System.out.println("Tên: " + hocSinhChuyenToan.gethoTen());
	System.out.println("Lớp: " + hocSinhChuyenToan.getlop());
	System.out.println("Điểm toán: " + hocSinhChuyenToan.gettoan());
	System.out.println("Điểm lý: " + hocSinhChuyenToan.getly());
	System.out.println("Điểm hóa: " + hocSinhChuyenToan.gettoan());
	}
	}
}
