import java.util.Scanner;

public class MainFaktorial06 {
    public static void main(String[] args) {
        
    Scanner input6 = new Scanner(System.in);
    System.out.print("Masukkan nilai: ");
    int nilai = input6.nextInt();

    Faktorial06 fk = new Faktorial06();
    System.out.println("Nilai faktorial "+nilai+" menggunakan BF: "+ fk.FaktorialBF(nilai));
    System.out.println("Nilai faktorial "+nilai+" menggunakan DC: "+ fk.FaktorialDC(nilai));
    }
}
