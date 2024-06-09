import java.util.Scanner;

public class test {
}
public static void main(String[] args) {
    int heat;

    Scanner input = new Scanner(System.in);
    System.out.print("Lütfen Hava Sicakligini Giriniz :");
    heat = input.nextInt();

    if (heat < 5) {
        System.out.print("Kayak Yapmaya Gidebilirsiniz.");
    }
    if (heat > 5 && heat <= 15) {
        System.out.print("Sinemaya Gidebilirsiniz.");
    }
    if (heat > 15 && heat < 25) {
        System.out.print("Piknik Yapmaya Gidebilirsiniz.");
    }
    if (heat > 25) {
        System.out.print("Yuzmeye Gidebilirsiniz.");
    }
}