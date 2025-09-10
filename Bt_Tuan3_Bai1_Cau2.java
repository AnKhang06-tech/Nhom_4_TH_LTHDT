import java.util.Scanner;

public class Bt_Tuan3_Bai1_Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhap chieu cao (m): ");
        double chieuCao = sc.nextDouble();

        System.out.print("Nhap gioi tinh (M/F): ");
        char gioiTinh = sc.next().charAt(0);

        System.out.print("Ban co thich lap trinh khong? (true/false): ");
        boolean thichLapTrinh = sc.nextBoolean();

        System.out.println("\n===== THONG TIN CA NHAN =====");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Chieu cao: " + chieuCao + " m");
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Co thich lap trinh khong? " + thichLapTrinh);

        sc.close();
    }
}
