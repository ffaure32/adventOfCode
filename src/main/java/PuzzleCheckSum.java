import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ffaure32 on 10/12/2017.
 */
public class PuzzleCheckSum {
    int result = 0;
    public void collect(String line) {
        List<String> split = Arrays.asList(line.split("\t"));
        List<Integer> entiers = split.stream()
                .map(s -> Integer.parseInt(s))
                .sorted().collect(Collectors.toList());
        result += (entiers.get(entiers.size()-1) - entiers.get(0));
        System.out.println(result);
    }
}
