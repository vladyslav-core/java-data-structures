package Woche_08_Datenstrukturen.sorting;

import java.util.ArrayList;
import java.util.List;

public class ListSorter {

    public static void sort(List<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
            }
        }
    }


    // ====================================================================================================================
    // ===================================================== MAIN =========================================================
    // ====================================================================================================================

    public static void main(String[] args) {

        // [5, 2, 3, 8, 1]
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(1);

        System.out.println(list);

        sort(list);

        System.out.println();
        System.out.println(list);


    }
}
