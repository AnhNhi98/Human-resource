package HumanResources;
//Chứa thông tin cơ bản của nhân viên
public abstract class Staff {
    protected int maSo;
    protected String hoTen;
    protected int tuoi;
    protected double heSoLuong;
    protected String ngayVaoLam;
    protected String boPhanLamViec;
    protected double soNgayNghiPhep;

    //contructor
    public Staff(int maSo, String hoTen, int tuoi, double heSoLuong, String ngayVaoLam, String boPhanLamViec, double soNgayNghiPhep) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhanLamViec = boPhanLamViec;
        this.soNgayNghiPhep = soNgayNghiPhep;
    }

    //Phương thức trừu tượng
    public abstract void displayInformation();

    //getter & setter
    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getBoPhanLamViec() {
        return boPhanLamViec;
    }

    public void setBoPhanLamViec(String boPhanLamViec) {
        this.boPhanLamViec = boPhanLamViec;
    }

    public double getSoNgayNghiPhep() {
        return soNgayNghiPhep;
    }

    public void setSoNgayNghiPhep(double soNgayNghiPhep) {
        this.soNgayNghiPhep = soNgayNghiPhep;
    }
}





