package wordsFrequency;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] loremArray = CustomReadFile.readFile("src/lorem.txt");
        String[] articleArray = CustomReadFile.readFile("src/article.txt");

        WordsFrequency loremWordFrequency = new WordsFrequency(loremArray);
        WordsFrequency articleWordFrequency = new WordsFrequency(articleArray);

        System.out.println("Test article");
        articleWordFrequency.showWordFrequency();

        System.out.println("Lorem ipsum");
        loremWordFrequency.showWordFrequency();
    }
}
