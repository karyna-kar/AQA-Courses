package Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transliteration {
    public static  Map <Character, String> alphabet = new HashMap<Character, String>();

    static {
        alphabet.put('а', "a");
        alphabet.put('б', "b");
        alphabet.put('в', "v");
        alphabet.put('г', "g");
        alphabet.put('д', "d");
        alphabet.put('е', "e");
        alphabet.put('ё', "e");
        alphabet.put('ж', "zh");
        alphabet.put('з', "z");
        alphabet.put('и', "i");
        alphabet.put('й', "i");
        alphabet.put('к', "k");
        alphabet.put('л', "l");
        alphabet.put('м', "m");
        alphabet.put('н', "n");
        alphabet.put('о', "o");
        alphabet.put('п', "p");
        alphabet.put('р', "r");
        alphabet.put('с', "s");
        alphabet.put('т', "t");
        alphabet.put('у', "u");
        alphabet.put('ф', "f");
        alphabet.put('х', "h");
        alphabet.put('ц', "c");
        alphabet.put('ч', "ch");
        alphabet.put('ш', "sh");
        alphabet.put('щ', "sch");
        alphabet.put('ъ', "'");
        alphabet.put('ы', "y");
        alphabet.put('ъ', "'");
        alphabet.put('э', "e");
        alphabet.put('ю', "yu");
        alphabet.put('я', "ya");
    }
    //метод парсинга строки на слова
    public static String [] parsInput(String inputString)
    {
        String[] words = inputString.split(" ");
        return words;
    }
    //главный метод по переводу вводных данных
    public static List<String> getTransliteration(String [] words)
    {
        List<String> outputString = new ArrayList<String>();
        for (int i=0; i < words.length; i++) {
            outputString.add(translateWord(words[i]));
        }
        return outputString;
    }

    //метод по переводу слова
    public static String translateWord(String word)
    {
        StringBuilder outputWord = new StringBuilder();
        char[] letters  = word. toCharArray();
        for (int i = 0; i < letters.length; i++) {
            outputWord = outputWord.append(translateLetter(letters[i]));
        }
        return outputWord.toString();
    }

    //метод по переводу буквы
    public static String translateLetter(Character letter)
    {
        String translatedLetter;
        //проверка регистра буквы
        if (Character.toString(letter).matches("[А-Я]")) {
            letter = Character.toLowerCase(letter);
            translatedLetter = alphabet.get(letter).toUpperCase();
        }
        else {
            translatedLetter = alphabet.get(letter);
        }
        return translatedLetter;
    }

    //вывод результата
    public static void printResult( List<String> outputString)
    {
        for (int i=0; i<outputString.size(); i++)
        {
            System.out.print(outputString.get(i)+" ");
        }
    }
}
