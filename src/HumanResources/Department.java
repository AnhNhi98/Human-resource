package HumanResources;
//Chứa thông tin chung về bộ phận
public class Department {
    protected String maBoPhan;
    protected String tenBoPhan;
    protected int soLuongNhanVien;

    //Contructor
    public Department(String maBoPhan, String tenBoPhan, int soLuongNhanVien) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.soLuongNhanVien = soLuongNhanVien;
    }

    //getter & setter
    public String getMaBoPhan() {

        return maBoPhan;
    }

    public void setMaBoPhan(String maBoPhan) {

        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {

        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {

        this.tenBoPhan = tenBoPhan;
    }

    public int getSoLuongNhanVien() {

        return soLuongNhanVien;
    }

    public void setSoLuongNhanVien(int soLuongNhanVien) {

        this.soLuongNhanVien = soLuongNhanVien;
    }

    //Hiển thị thông tin bộ phận
    public String toString() {
        return ("   " + getMaBoPhan() + "        " + getTenBoPhan() + "                   " + getSoLuongNhanVien());
    }
}
