package HumanResources;
//Chứa thông tin chung về quản lý
public class Manager extends Staff implements ICalculator {
    private String chucDanh;
    private double luongQuanLy = 5000000;

    //Contructor
    public Manager(int maSo, String hoTen, int tuoi, double heSoLuong, String ngayVaoLam, String boPhanLamViec, double soNgayNghiPhep, String chucDanh) {
        super(maSo, hoTen, tuoi, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
        this.chucDanh = chucDanh;
    }

    //getter & setter
    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public double getLuongQuanLy() {
        return luongQuanLy;
    }

    public void setLuongQuanLy(double luongQuanLy) {
        this.luongQuanLy = luongQuanLy;
    }

    //Hiển thị thông tin quản lý
    public void displayInformation() {
        System.out.println(" " + super.getMaSo() + " " + super.getHoTen() + " " + super.getTuoi() + "       " + super.getHeSoLuong() + "        " + super.getNgayVaoLam() + "       " + super.getBoPhanLamViec() + "        " + super.getSoNgayNghiPhep() + "                                " + getChucDanh());
    }

    //Tính lương quản lý
    public double calculateSalary() {
        double luong;
        if (getChucDanh().equals("Business Leader")) {
            luong = getHeSoLuong() * getLuongQuanLy() + 8000000;
        } else if (getChucDanh().equals("Project Leader")) {
            luong = getHeSoLuong() * getLuongQuanLy() + 5000000;
        } else {
            luong = getHeSoLuong() * getLuongQuanLy() + 6000000;
        }
        return luong;
    }
}
