package praktikum.week15_proyek_kelompok.code;

import java.util.*;

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
                System.out.println("Page " + page + " -> [MISS] Frame: " + frames);
            } else {
                System.out.println("Page " + page + " -> [HIT]  Frame: " + frames);
            }
        }
        System.out.println("Total Page Faults: " + pageFaults);
    }
}
