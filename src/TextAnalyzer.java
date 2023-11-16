import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan teks yang ingin Anda analisis:");
        String text = input.nextLine();

        int jumlahKarakter = countCharacters(text);
        int jumlahKata = countWords(text);

        System.out.println("Jumlah karakter: " + jumlahKarakter);
        System.out.println("Jumlah kata: " + jumlahKata);

        System.out.println("Masukkan kata yang ingin Anda cari dalam teks:");
        String kataCari = input.nextLine();
        boolean ditemukan = findWord(text, kataCari);
        if (ditemukan) {
            System.out.println("Kata '" + kataCari + "' ditemukan dalam teks.");
        } else {
            System.out.println("Kata '" + kataCari + "' tidak ditemukan dalam teks.");
        }
    }

    public static int countCharacters(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.length();
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }

    public static boolean findWord(String text, String word) {
        if (text == null || text.isEmpty() || word == null || word.isEmpty()) {
            return false;
        }
        String[] words = text.split("\\s+");
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }
}
