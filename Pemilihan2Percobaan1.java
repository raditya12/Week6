import java.util.Scanner;
public class Pemilihan2Percobaan1 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        int tahun;

            System.out.println("Masukkan Tahun :");
            tahun = input23.nextInt();

            if ((tahun % 4) == 0) {           
                if (tahun % 100 == 0) {
                    if ((tahun % 400) == 0) { 
                        System.out.println("Tahun kabisat");
                    } else { 
                        System.out.println("Bukan tahun kabisat");
                    }
                } else { 
                    System.out.println("Tahun kabisat");
                }
            } else { 
                System.out.println("Bukan tahun kabisat");
            }
        }
        }