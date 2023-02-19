package lab02;
import java.util.Scanner;

public class hocsinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap diem trung binh: ");
        double diemTB = input.nextDouble();
        String xepLoai;

        if (diemTB >= 9.0) {
            xepLoai = "Xuat sac";
        } else if (diemTB >= 8.0) {
            xepLoai = "Gioi";
        } else if (diemTB >= 7.0) {
            xepLoai = "Kha";
        } else if (diemTB >= 6.0) {
            xepLoai = "Trung binh kha";
        } else if (diemTB >= 5.0) {
            xepLoai = "Trung binh";
        } else {
            xepLoai = "Yeu";
        }

        System.out.println("Xep loai cua hoc sinh la: " + xepLoai);
    }
}
