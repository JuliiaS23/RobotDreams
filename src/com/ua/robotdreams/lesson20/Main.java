package com.ua.robotdreams.lesson20;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Map<String, String[]> vocabulary = new HashMap<>();
        vocabulary.put("розробник", new String[]{"developer", "開発者", "Entwickler"});
        vocabulary.put("собака", new String[]{"dog", "犬", "Hund"});
        vocabulary.put("квітка", new String[]{"flower", "花", "Blume"});
        vocabulary.put("дерево", new String[]{"tree", "木", "Baum"});
        vocabulary.put("дощ", new String[]{"rain", "雨", "Regen"});
        vocabulary.put("сонце", new String[]{"sun", "太陽", "Sonne"});
        vocabulary.put("дитина", new String[]{"child", "子供", "Kind"});
        vocabulary.put("шоколад", new String[]{"chocolate", "チョコレート", "Schokolade"});
        vocabulary.put("музика", new String[]{"music", "音楽", "Musik"});
        vocabulary.put("книга", new String[]{"book", "本", "Buch"});

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the word in Ukrainian: ");
        String word = scanner.nextLine().toLowerCase();
        if (vocabulary.containsKey(word)) {
            String[] wordTranslations = vocabulary.get(word);
            System.out.println("Переклади:");
            System.out.println("Англійська: " + wordTranslations[0]);
            System.out.println("Японська: " + wordTranslations[1]);
            System.out.println("Німецька: " + wordTranslations[2]);
        } else {
            System.out.println("Переклад не знайдено.");
        }
    }
}

