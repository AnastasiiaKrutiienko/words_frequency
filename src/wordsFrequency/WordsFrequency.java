package wordsFrequency;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsFrequency {
    private String[] wordsArray;

    public WordsFrequency(String[] wordsArray) {
        this.wordsArray = wordsArray;
    }

    public void showWordFrequency () {
        Stream<String> streamFromArray = Arrays.stream(this.wordsArray);

        streamFromArray
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .filter((element) -> element.getValue() > 1)
                .limit(5)
                .forEach((element) -> System.out.println(element.getKey() + ", frequency: " + element.getValue()));
    }

}
