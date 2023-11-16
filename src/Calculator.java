import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Akar kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma natural");
        System.out.println("4. Faktorial");
        System.out.println("Pilih operasi (1/2/3/4/5):");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan angka: ");
                double angkaAkar = input.nextDouble();
                double hasilAkar = Math.sqrt(angkaAkar);
                System.out.println("Hasil akar kuadrat dari " + angkaAkar + " adalah " + hasilAkar);
                break;
            case 2:
                System.out.print("Masukkan angka: ");
                double angkaPangkat = input.nextDouble();
                System.out.print("Masukkan pangkat: ");
                double pangkat = input.nextDouble();
                double hasilPangkat = Math.pow(angkaPangkat, pangkat);
                System.out.println(angkaPangkat + " pangkat " + pangkat + " adalah " + hasilPangkat);
                break;
            case 3:
                System.out.print("Masukkan angka: ");
                double angkaLog = input.nextDouble();
                double hasilLog = Math.log(angkaLog);
                System.out.println("Logaritma natural dari " + angkaLog + " adalah " + hasilLog);
                break;
            case 4:
                System.out.print("Masukkan angka: ");
                int angkaFaktorial = input.nextInt();
                int hasilFaktorial = 1;
                for (int i = 1; i <= angkaFaktorial; i++) {
                    hasilFaktorial *= i;
                }
                System.out.println("Faktorial dari " + angkaFaktorial + " adalah " + hasilFaktorial);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}