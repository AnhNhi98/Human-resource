package HumanResources;
//Chứa thông tin chung về nhân viên
public class Employee extends Staff implements ICalculator {
    private double gioLamThem;
    private double luongNhanVien  = 3000000;

    //contructor
    public Employee(int maSo, String hoTen, int tuoi, double heSoLuong, String ngayVaoLam, String boPhanLamViec, double soNgayNghiPhep, double gioLamThem) {
        super(maSo, hoTen, tuoi, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
        this.gioLamThem = gioLamThem;
    }

    //getter & setter
    public double getGioLamThem() {
        return gioLamThem;
    }

    public void setGioLamThem(double gioLamThem) {
        this.gioLamThem = gioLamThem;
    }

    public double getLuongNhanVien() {
        return luongNhanVien;
    }

    public void setLuongNhanVien(double luongNhanVien) {
        this.luongNhanVien = luongNhanVien;
    }

    //Phương thức tính lương nhân viên
    public double calculateSalary() {

        return (super.getHeSoLuong() * getLuongNhanVien() + getGioLamThem() * 200000 );
    }

    //Phương thức hiển thị thông tin nhân viên
    public void displayInformation() {
        System.out.println(" " + super.getMaSo() + " " + super.getHoTen() + " " + super.getTuoi() + "       " + super.getHeSoLuong() + "        " + super.getNgayVaoLam() + "       " + super.getBoPhanLamViec() + "        " + super.getSoNgayNghiPhep()+ "                     " + getGioLamThem());
    }
}
