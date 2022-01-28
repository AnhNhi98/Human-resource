package HumanResources;
import java.util.ArrayList;
import java.util.Scanner;
public class HumanResources {
    //Kiểm tra nhân viên hiện có trong danh sách
    public static boolean checkHoTen(ArrayList<Staff> nhanSu, String hoTen) {
        boolean check = false;
        for (int i = 0; i < nhanSu.size(); i++) {
            if (nhanSu.get(i).getHoTen().equals(hoTen)) {
                check = true;
                break;
            }

        }
        return check;
    }

    //Phương thức tìm kiếm thông tin nhân viên theo tên
    public static void searchHoTen(ArrayList<Staff> nhanSu, String hoTen) {
        if (checkHoTen(nhanSu, hoTen)) {
            for (int i = 0; i < nhanSu.size(); i++) {
                if (nhanSu.get(i).getHoTen().equals(hoTen)) {
                    nhanSu.get(i).displayInformation();
                }
            }

        } else {
            System.out.println("Nhân viên không tồn tại");
        }
    }

    //Tìm kiếm theo ID nhân viên
    public static void searchMaSo(ArrayList<Staff> nhanSu, int maSo) {
        if (maSo < 0 || maSo > nhanSu.size() - 1) {
            System.out.println("Mã nhân viên không tồn tại");
        } else {
            for (int i = 0; i < nhanSu.size(); i++) {
                if (nhanSu.get(i).getMaSo() == maSo) {
                    nhanSu.get(i).displayInformation();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Tạo mảng chứa thông tin nhân viên
        ArrayList<Staff> nhanSu = new ArrayList<Staff>();
        Manager human1 = new Manager(1, "Nguyen Van A", 30, 3.0, "10/11/2016", "Bus", 4, "Business Leader");
        Manager human2 = new Manager(2, "Nguyen Van B", 28, 2.5, "10/01/2017", "Pro", 1, "Project Leader");
        Manager human3 = new Manager(3, "Nguyen Van C", 27, 2.0, "10/01/2018", "Tec", 2, "Technical Leader");
        Employee human4 = new Employee(4, "Nguyen Van D", 26, 1.5, "10/01/2019", "Bus", 3, 12);
        Employee human5 = new Employee(5, "Nguyen Van E", 25, 1.2, "10/01/2020", "Pro", 4, 13);
        Employee human6 = new Employee(6, "Nguyen Van F", 24, 1.4, "10/01/2021", "Tec", 2, 14);
        //Thêm nhân viên vào mảng nhân sự
        nhanSu.add(human1);
        nhanSu.add(human2);
        nhanSu.add(human3);
        nhanSu.add(human4);
        nhanSu.add(human5);
        nhanSu.add(human6);

        //Tạo mảng bảng lương nhân viên
        ArrayList<Salary> luong = new ArrayList<Salary>();
        Salary nv1 = new Salary(human1.maSo, human1.hoTen, human1.calculateSalary());
        Salary nv2 = new Salary(human2.maSo, human2.hoTen, human2.calculateSalary());
        Salary nv3 = new Salary(human3.maSo, human3.hoTen, human3.calculateSalary());
        Salary nv4 = new Salary(human4.maSo, human4.hoTen, human4.calculateSalary());
        Salary nv5 = new Salary(human5.maSo, human5.hoTen, human5.calculateSalary());
        Salary nv6 = new Salary(human6.maSo, human6.hoTen, human6.calculateSalary());
        //Thêm lương nhân viên vào mảng bảng lương
        luong.add(nv1);
        luong.add(nv2);
        luong.add(nv3);
        luong.add(nv4);
        luong.add(nv5);
        luong.add(nv6);

        //Tạo mảng bộ phận
        ArrayList<Department> boPhan = new ArrayList<Department>();
        Department Dep1 = new Department("BP1", "Bus", 0);
        Department Dep2 = new Department("BP2", "Pro", 0);
        Department Dep3 = new Department("BP3", "Tec", 0);
        //Thêm bộ phận vào mảng bộ phận
        boPhan.add(Dep1);
        boPhan.add(Dep2);
        boPhan.add(Dep3);

        //Hàm while để hiển thị chương trình và các lựa chọn
        while (true) {
            System.out.println("******-QUẢN LÝ NHÂN VIÊN CÔNG TY-******");
            System.out.println("1.Hiển thị danh sách nhân viên hiện có");
            System.out.println("2.Hiển thị danh sách các bộ phận");
            System.out.println("3.Hiển thị nhân viên theo từng bộ phận");
            System.out.println("4.Thêm nhân viên mới");
            System.out.println("5.Tìm kiếm nhân viên.");
            System.out.println("6.Hiển thị bảng lương công ty");
            System.out.println("--------------------------------------");
            System.out.println("Nhấn số để chọn chức năng: ");

            String choose = sc.nextLine();
            switch (choose) {
                //Hiển thị danh sách nhân viên
                case "1": {
                    System.out.println("Danh sách nhân viên: \n");
                    System.out.println("Mã NV   Tên    Tuổi    Hệ số lương  Ngày vào làm    Bộ phận    Số ngày nghỉ phép   Giờ làm thêm     Chức danh");
                    for (int i = 0; i < nhanSu.size(); i++) {
                        nhanSu.get(i).displayInformation();
                    }
                    System.out.println();
                    break;
                }
                //Hiển thị danh sách các bộ phận
                case "2": {
                    System.out.println("Danh sách các bộ phận công ty: \n");
                    for (int i = 0; i < boPhan.size(); i++) {
                        boPhan.get(i).setSoLuongNhanVien(0);
                        for (int j = 0; j < nhanSu.size(); j++) {
                            if (nhanSu.get(j).getBoPhanLamViec().equalsIgnoreCase(boPhan.get(i).getTenBoPhan())) {
                                boPhan.get(i).setSoLuongNhanVien(boPhan.get(i).getSoLuongNhanVien() + 1);
                            }
                        }
                    }
                    System.out.println("Mã bộ phận    Tên bộ phận    Số nhân viên");
                    for (int i = 0; i < boPhan.size(); i++) {
                        System.out.println(boPhan.get(i).toString());
                    }
                    System.out.println();
                    break;
                }

                //Hiển thị danh sách nhân viên theo bộ phận
                case "3": {
                    System.out.println("Danh sách nhân viên theo từng bộ phận: \n");

                    for (int i = 0; i < boPhan.size(); i++) {
                        System.out.println("Bộ phận: " + boPhan.get(i).tenBoPhan);
                        System.out.println("Mã NV  Tên NV  Tuổi   Hệ số lương   Ngày vào làm   Bộ phận      Hệ số lương     Giờ làm thêm        Chức danh");


                        for (int j = 0; j < nhanSu.size(); j++) {
                            if (nhanSu.get(j).getBoPhanLamViec().equalsIgnoreCase(boPhan.get(i).tenBoPhan)) {
                                nhanSu.get(j).displayInformation();
                            }
                        }
                        System.out.println();
                    }

                    System.out.println();
                    break;
                }
                //Thêm thành viên mới
                case "4": {
                    System.out.println("Thêm thành viên mới");
                    System.out.println("Nhấn phím a để thêm nhân viên");
                    System.out.println("Nhấn phím b để thêm quản lý");
                    String c = sc.nextLine();
                    switch (c) {

                        //Thêm nhân viên mới
                        case "a": {
                            System.out.print("Nhập tên nhân viên mới: ");
                            String hoTen = sc.nextLine();
                            System.out.print("Nhập tuổi nhân viên mới: ");
                            int tuoi = Integer.parseInt(sc.nextLine());
                            System.out.print("Nhập hệ số lương nhân viên mới: ");
                            double heSoLuong = Double.parseDouble(sc.nextLine());
                            System.out.print("Nhập ngày vào làm việc nhân viên mới: ");
                            String ngayVaoLam = sc.nextLine();
                            System.out.print("Nhập bộ phận làm việc nhân viên mới: ");
                            String boPhanLamViec = sc.nextLine();
                            System.out.print("Nhập ngày nghỉ phép nhân viên mới: ");
                            double soNgayNghiPhep = Double.parseDouble(sc.nextLine());
                            System.out.print("Nhập giờ làm thêm nhân viên mới: ");
                            double gioLamThem = Double.parseDouble(sc.nextLine());
                            int maSo = nhanSu.get(nhanSu.size() - 1).getMaSo() + 1;
                            Employee h = new Employee(maSo, hoTen, tuoi, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep, gioLamThem);
                            nhanSu.add(h);
                            Salary moi = new Salary(maSo, hoTen, h.calculateSalary());
                            luong.add(moi);

                            System.out.println();
                            System.out.println("Mã NV   Tên NV  Tuổi NV  Hệ số lương   Ngày làm việc  Bộ phận  Ngày nghỉ phép   Giờ làm thêm");
                            h.displayInformation();
                            System.out.println();

                            break;
                        }

                        //Thêm quản lý mới
                        case "b": {
                            System.out.print("Nhập tên quản lý mới: ");
                            String hoTen = sc.nextLine();
                            System.out.print("Nhập tuổi quản lý mới: ");
                            int tuoi = Integer.parseInt(sc.nextLine());
                            System.out.print("Nhập hệ số lương quản lý mới: ");
                            double heSoLuong = Double.parseDouble(sc.nextLine());
                            System.out.print("Nhập ngày vào làm việc quản lý mới: ");
                            String ngayVaoLam = sc.nextLine();
                            System.out.print("Nhập bộ phận làm việc quản lý mới: ");
                            String boPhanLamViec = sc.nextLine();
                            System.out.print("Nhập ngày nghỉ phép quản lý mới: ");
                            double soNgayNghiPhep = Double.parseDouble(sc.nextLine());
                            System.out.print("Nhập chức danh quản lý mới: ");
                            String chucDanh = sc.nextLine();
                            int maSo = nhanSu.get(nhanSu.size() - 1).getMaSo() + 1;
                            Manager h = new Manager(maSo, hoTen, tuoi, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep, chucDanh);
                            nhanSu.add(h);
                            Salary moi = new Salary(maSo, hoTen, h.calculateSalary());
                            luong.add(moi);

                            System.out.println();
                            System.out.println("Mã NV   Tên NV  Tuổi NV  Hệ số lương   Ngày làm việc  Bộ phận  Ngày nghỉ phép   Chức danh");
                            h.displayInformation();
                            System.out.println();

                            break;
                        }
                    }
                    break;
                }

                //Tìm kiếm thông tin theo tên hoặc mã số nhân viên
                case "5": {
                    System.out.println("Chọn phương án tìm kiếm");
                    System.out.println("Nhấn phím a tìm kiếm theo tên nhân viên");
                    System.out.println("Nhấn phím b tìm kiếm theo mã số nhân viên");

                    String choice = sc.nextLine();
                    switch (choice) {
                        //Tìm kiếm theo tên
                        case "a": {
                            System.out.print("Nhập tên nhân viên cần tìm: ");
                            String hoTen = sc.nextLine();
                            System.out.println("Mã NV  Tên NV  Tuổi   Hệ số lương   Ngày vào làm   Bộ phận      Hệ số lương     Giờ làm thêm        Chức danh");
                            searchHoTen(nhanSu, hoTen);
                            System.out.println();

                            break;
                        }
                        //Tìm kiếm theo mã
                        case "b": {
                            System.out.print("Nhập mã nhân viên cần tìm: ");
                            int maSo = sc.nextInt();
                            System.out.println("Mã NV  Tên NV  Tuổi   Hệ số lương   Ngày vào làm   Bộ phận      Hệ số lương     Giờ làm thêm        Chức danh");
                            searchMaSo(nhanSu, maSo);
                            System.out.println();

                            break;
                        }
                    }
                    break;
                }

                //Hiển thị bảng lương toàn công ty
                case "6": {
                    System.out.println("Bảng lương toàn Công ty");
                    System.out.println("Mã NV   Tên NV  Lương");
                    for (int i = 0; i < luong.size(); i++) {
                        luong.get(i).displayInformation();

                    }
                    //Lựa chọn sắp xếp giảm hoặc tăng dần
                    System.out.println("Nhấn phím 1 sắp xếp theo thứ tự giảm dần");
                    System.out.println("Nhấn phím 2 sắp xếp theo thứ tự tăng dần");
                    String choice = sc.nextLine();
                    System.out.println();

                    switch (choice) {
                        case "1": {
                            System.out.println("Sắp xếp bảng lương theo thứ tự giảm dần. \n");
                            luong.sort((l1, l2) -> Double.compare(l2.getLuong(), l1.getLuong()));
                            System.out.println("Mã NV   Tên NV  Lương");
                            for (int i = 0; i < luong.size(); i++) {
                                luong.get(i).displayInformation();
                            }
                            System.out.println();
                            break;
                        }
                        case "2": {
                            System.out.println("Sắp xếp bảng lương theo thứ tự tăng dần. \n");
                            luong.sort((l1, l2) -> Double.compare(l1.getLuong(), l2.getLuong()));
                            for (int i = 0; i < luong.size(); i++) {
                                luong.get(i).displayInformation();
                            }
                            System.out.println();
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}






















