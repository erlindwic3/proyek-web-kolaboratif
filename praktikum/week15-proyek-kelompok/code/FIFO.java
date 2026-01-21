import java.util.*;

<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        // Data input Page Replacement (Contoh standar praktikum)
        int[] pages = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3};
        int capacity = 3; // Jumlah Frame

        System.out.println("========== SIMULASI PAGE REPLACEMENT (FIFO) ==========");
        System.out.println("Reference String: " + Arrays.toString(pages));
        System.out.println("Kapasitas Frame: " + capacity);
        System.out.println("------------------------------------------------------");

        HashSet<Integer> frames = new HashSet<>(capacity);
        Queue<Integer> queue = new LinkedList<>();
        int pageFaults = 0;

        System.out.printf("%-15s | %-20s | %-10s\n", "Page Request", "Frames in Memory", "Status");
        System.out.println("------------------------------------------------------");

        for (int page : pages) {
            String status = "";
            if (!frames.contains(page)) {
                if (frames.size() < capacity) {
                    frames.add(page);
                } else {
                    int val = queue.poll();
                    frames.remove(val);
                    frames.add(page);
                }
                queue.add(page);
                pageFaults++;
                status = "Page Fault";
            } else {
                status = "Page Hit";
            }
            System.out.printf("%-15d | %-20s | %-10s\n", page, frames.toString(), status);
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Total Page Faults: " + pageFaults);
        System.out.println("Total Page Hits: " + (pages.length - pageFaults));
    }
}
=======
public class FIFO {

    public static void run(int capacity) {

        int[] pages = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3};

        System.out.println("\n=== SIMULASI PAGE REPLACEMENT FIFO ===");
        System.out.println("Jumlah frame: " + capacity);

        HashSet<Integer> frames = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        int pageFaults = 0;

        for (int page : pages) {
            if (!frames.contains(page)) {
                if (frames.size() == capacity) {
                    int removed = queue.poll();
                    frames.remove(removed);
                }
                frames.add(page);
                queue.add(page);
                pageFaults++;
            }
            System.out.println("Page " +
>>>>>>> 4a10d10cc8320ad9a7866e6d4ecbc1d4ce45b3ae
