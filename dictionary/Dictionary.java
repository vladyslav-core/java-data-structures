package Woche_08_Datenstrukturen.dictionary;

import java.util.Map;
import java.util.HashMap;

public class Dictionary {

    // ===== Ich verwende zwei Maps, damit die Übersetzung in beide Richtungen effizient ist.
    // ===== Mit nur einer Map müsste ich für die Rückübersetzung alle Einträge durchsuchen.
    static Map<String, String> enToDe = new HashMap<>();
    static Map<String, String> deToEn = new HashMap<>();


    // ===== #1 ADD =====
    public static void addWordPair(String key, String value) {
        enToDe.put(key, value);
        deToEn.put(value, key);
    }


    // ===== #2 Remove Word Pair =====
    // ===== Wenn das Wort in keiner Map existiert, passiert nichts.
    // ===== Das Programm wirft keine Exception, weil remove(null) erlaubt ist.
    // ===== Optional könnte man hier noch eine Prüfung einbauen.
    public static void removeWordPair(String key) {
        if (enToDe.containsKey(key)) {
            deToEn.remove(enToDe.get(key));
            enToDe.remove(key);
        } else {
            enToDe.remove(deToEn.get(key));
            deToEn.remove(key);
        }
    }


    // ===== #3 Translate =====
    public static String translate(String target) {

        if (enToDe.containsKey(target)) {
            return enToDe.get(target);
        } else {
            return deToEn.get(target);
        }
    }



    // ====================================================================================================================
    // ===================================================== MAIN =========================================================
    // ====================================================================================================================

    public static void main(String[] args) {

        addWordPair("house", "Haus");
        addWordPair("cat", "Katze");
        addWordPair("dog", "Hund");

        System.out.println(enToDe);

        removeWordPair("dog");
        System.out.println(enToDe);

        removeWordPair("mouse");
        System.out.println(enToDe);

        System.out.println(translate("cat"));



    }
}
