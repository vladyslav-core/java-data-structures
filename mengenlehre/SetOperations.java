package Woche_08_Datenstrukturen.mengenlehre;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    // ===== UNION =====
    // === Diese Methode berechnet die Vereinigungsmenge (Union) von zwei Mengen.
    // === Die Originalmengen werden nicht verändert, es wird mit einer Kopie gearbeitet.
    // === addAll() fügt alle Elemente der zweiten Menge hinzu.
    // === Doppelte Werte werden automatisch vom Set verhindert.
    // =====================================================================================
    // ===== Durch Generics ist die Methode typunabhängig und wiederverwendbar.
    // ===== Der konkrete Typ wird zur Compile-Zeit festgelegt, wodurch Typsicherheit gewährleistet ist.
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }


    // ===== INTERSECTION =====
    // ===== Diese Methode berechnet die Schnittmenge (Intersection) von zwei Mengen.
    // ===== Es bleiben nur die Elemente erhalten, die in beiden Mengen vorkommen.
    // ===== retainAll() entfernt alle Elemente, die nicht in der zweiten Menge enthalten sind.
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }


    // ===== DIFFERENCE =====
    // ===== Diese Methode berechnet die Differenzmenge (A \ B).
    // ===== Alle Elemente, die auch in der zweiten Menge vorkommen,
    // ===== werden aus der ersten Menge entfernt.
    // ===== Die Originalmenge bleibt unverändert.
    public static <T> Set<T> difference(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }



    // ========================================================================================================
    // ================================================== MAIN ================================================
    // ========================================================================================================
    public static void main(String[] args) {

        Set<Integer> A = new HashSet<>();
        A.add(1);
        A.add(3);
        A.add(5);

        Set<Integer> B = new HashSet<>();
        B.add(3);
        B.add(5);
        B.add(7);

        Set<Integer> C = new HashSet<>();
        C.add(5);
        C.add(7);
        C.add(9);

        // === #1 UNION ===
        System.out.println("===========================================================");
        System.out.println("UNION: ");
        System.out.println("A ∪ B = " + union(A, B));
        System.out.println("A ∪ C = " + union(A, C));
        System.out.println("B ∪ C = " + union(B, C));

        // === #2 INTERSECTION ===
        System.out.println("===========================================================");
        System.out.println("INTERSECTION");
        System.out.println("A ∩ B = " + intersection(A, B));
        System.out.println("A ∩ C = " + intersection(A, C));
        System.out.println("B ∩ C = " + intersection(B, C));

        // === #3 DIFFERENCE ===
        System.out.println("===========================================================");
        System.out.println("DIFFERENCE: ");
        System.out.println("A \\ B = " + difference(A, B));
        System.out.println("A \\ C = " + difference(A, C));
        System.out.println("B \\ A = " + difference(B, A));
        System.out.println("B \\ C = " + difference(B, C));
        System.out.println("C \\ A = " + difference(C, A));
        System.out.println("C \\ B = " + difference(C, B));

        // === #4 A ∪ B ∪ C ===
        System.out.println("===========================================================");
        System.out.println(" --- A ∪ B ∪ C ---");
        System.out.println("A ∪ B ∪ C = " + union(union(A, B), C));

        // === #5 A ∪ (B ∩ C) ===
        System.out.println("===========================================================");
        System.out.println("--- A ∪ (B ∩ C) ---");
        System.out.println("A ∪ (B ∩ C) = " + union(A, intersection(B, C)));
        System.out.println("===========================================================");
    }
}

