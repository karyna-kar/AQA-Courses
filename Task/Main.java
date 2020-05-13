package Task;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static Task.Transliteration.getTransliteration;
import static Task.Transliteration.parsInputs;
import static Task.Transliteration.printResult;

public class Main {
    public static void main(String[] args)  throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String example = reader.readLine();
        printResult(getTransliteration(parsInputs(example)));
    }
}
