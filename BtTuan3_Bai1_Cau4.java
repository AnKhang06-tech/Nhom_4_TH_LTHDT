import java.util.Scanner;

public class BtTuan3_Bai1_Cau4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double TG, LN, LT, TL, T;
        int ST;
        System.out.print("Nhap so tien gui: ");
        TG = sc.nextDouble();
        System.out.print("Nhap lai suat hang nam (%): ");
        LN = sc.nextDouble();
        System.out.print("Nhap so thang gui: ");
        ST = sc.nextInt();
        System.out.println("Tien lai sau " + ST + " thang: " + (TG * (LN / 12 / 100) * ST) + " VND");
        System.out.println("Tong so tien cuoi ky: " + (TG + TG * (LN / 12 / 100) * ST) + " VND");
        sc.close();
    }
}
