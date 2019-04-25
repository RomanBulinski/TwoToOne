import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static String longest (String s1, String s2) {

        List s1list = Arrays.asList(s1.split(""));
        List s2list = Arrays.asList(s2.split(""));

        Set<String> setOfBoth = new HashSet<String>();

        s1list.stream().forEach( n-> setOfBoth.add((String) n) );
        s2list.stream().forEach( n-> setOfBoth.add((String) n) );

        List<String> sortedList = setOfBoth.stream().sorted().collect(Collectors.toList());

        StringBuilder builder = new StringBuilder();
        for (String str : sortedList) {
            builder.append(str);
        }
        return builder.toString();
    }


    // solution from code wars
    public static String longestCodeWars (String s1, String s2) {
        return Stream.of(s1.concat(s2).split(""))
                .sorted()
                .distinct()
                .collect(Collectors.joining());
    }


}
