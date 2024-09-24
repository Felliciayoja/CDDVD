package CDCVDPRO;
import java.util.Scanner;
public class tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih : \n 1.CD \n 2. DVD");
        int pilihan = in.nextInt();
        in.nextLine();
        if (pilihan == 1) {
            System.out.println("Name : ");
            String name = in.nextLine();
            System.out.println("Artist : ");
            String artist = in.nextLine();
            System.out.println("Label : ");
            String label = in.nextLine();
            System.out.println("Quantity : ");    
            int quantity = in.nextInt();
            System.out.println("Number : ");
            int number = in.nextInt();
            System.out.println("Jumlah Lagu :");
            int Jumlah_lagu =  in.nextInt();
            System.out.println("Price :");
            double price = in.nextDouble();
            cd cd1 = new cd (number, name, quantity, price, artist, Jumlah_lagu, label );
            cd1.print();

        } else if ( pilihan == 2) {
            System.out.println("Name : ");
            String name = in.nextLine();
            System.out.println("Rating : ");
            String rating = in.nextLine();
            System.out.println("Label : ");
            String label = in.nextLine();
            System.out.println("Studio : ");
            String studio = in.next();
            System.out.println("Quantity : ");
            int quantity = in.nextInt();
            System.out.println("Number : ");
            int number = in.nextInt();
            System.out.println("Durasi : ");
            double durasi = in.nextInt();
            System.out.println("Price :");
            double price = in.nextDouble();
            dvd dvd1 = new dvd ( number, name, quantity, price, durasi, rating, studio);
            dvd1.print();
        } else {
            System.out.println("Input Salah");
        }
        
    }
    
}
