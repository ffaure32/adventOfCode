import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ffaure32 on 10/12/2017.
 */
public class PuzzleModuloSum {
    int result = 0;
    public void collect(String line) {
        List<String> split = Arrays.asList(line.split("\t"));
        List<Integer> entiers = split.stream()
                .map(s -> Integer.parseInt(s))
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for(Integer entier : entiers) {
            for(Integer diviseur : entiers) {
                if(entier != diviseur && entier % diviseur == 0) {
                    result+= entier / diviseur;
                    return;
                }
            }
        }
    }

    public void printResult() {
        System.out.println(result);
    }

}
