package HumanResources;

public class Salary {
    private int maSo;
    private String hoTen;
    private double luong;

    //Contructor
    public Salary(int maSo, String hoTen, double luong) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luong = luong;
    }

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

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    //Hiển thị lương từng nhân viên
    public void displayInformation() {
        System.out.print(getMaSo() + " " + getHoTen() + " ");
        System.out.printf("%,.0f %n", getLuong());
        System.out.println();
    }
}
