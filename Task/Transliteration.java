package Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Transliteration {
    public static Map<String, String> setAlphabet(){
        Map <String, String> alphabet = new HashMap<String, String>();
        alphabet.put("а", "a");
        alphabet.put("б", "b");
        alphabet.put("в", "v");
        alphabet.put("г", "g");
        alphabet.put("д", "d");
        alphabet.put("е", "e");
        alphabet.put("ё", "e");
        alphabet.put("ж", "zh");
        alphabet.put("з", "z");
        alphabet.put("и", "i");
        alphabet.put("й", "i");
        alphabet.put("к", "k");
        alphabet.put("л", "l");
        alphabet.put("м", "m");
        alphabet.put("н", "n");
        alphabet.put("о", "o");
        alphabet.put("п", "p");
        alphabet.put("р", "r");
        alphabet.put("с", "s");
        alphabet.put("т", "t");
        alphabet.put("у", "u");
        alphabet.put("ф", "f");
        alphabet.put("х", "h");
        alphabet.put("ц", "c");
        alphabet.put("ч", "ch");
        alphabet.put("ш", "sh");
        alphabet.put("щ", "sch");
        alphabet.put("ъ", "'");
        alphabet.put("ы", "y");
        alphabet.put("ъ", "'");
        alphabet.put("э", "e");
        alphabet.put("ю", "yu");
        alphabet.put("я", "ya");
        return alphabet;
    }
    public static String [] parsInputs(String example)
    {
        String[] words = example.split(" ");
        return words;
    }

    public static String [] getTransliteration(String [] example)
    {
        Map<String, String> alphabet = setAlphabet();
        String [] results = new String[example.length];
        for (int j=0; j < results.length; j++) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < example[j].length(); i++) {
                String letter = example[j].substring(i, i + 1);
                if (letter.matches("[А-Я]")) {
                    letter = letter.toLowerCase();
                    result = result.append((alphabet.get(letter)).toUpperCase());
                } else {
                    result = result.append(alphabet.get(letter));
                }
            }
            results[j]=result.toString();
        }
        return results;
    }

    public static void printResult(String [] results)
    {
        for (int i=0; i<results.length; i++)
        {
            System.out.print(results[i]+" ");
        }
    }
}
