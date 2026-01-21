import java.util.Scanner;

public class MainApp {
<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n[ MINI SIMULASI OS - KELOMPOK ]");
            System.out.println("1. CPU Scheduling (FCFS)");
            System.out.println("2. Page Replacement (FIFO)");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            String pil = sc.nextLine();

            if (pil.equals("1")) FCFS.run();
            else if (pil.equals("2")) {
                System.out.print("Masukkan jumlah frame: ");
                int f = Integer.parseInt(sc.nextLine());
                FIFO.run(f);
            } else if (pil.equals("3")) break;
        }
    }
}
=======

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.println("\n[ MINI SIMULASI OS - KELOMPOK ]");
                System.out.println("1. CPU Scheduling (FCFS)");
                System.out.println("2. Page Replacement (FIFO)");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu: ");

                String pil = sc.nextLine();

                if (pil.equals("1")) {
                    FCFS.run();
                }
                else if (pil.equals("2")) {
                    System.out.print("Masukkan jumlah frame: ");
                    int frame = Integer.parseInt(sc.nextLine());
                    FIFO.run(frame);
                }
                else if (pil.equals("3")) {
                    System.out.println("Program selesai.");
                    break;
                }
                else {
                    System.out.println("Pilihan tidak valid!");
                }
            }

        } 
    }
}
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae
