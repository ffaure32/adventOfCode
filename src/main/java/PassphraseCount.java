import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ffaure32 on 02/01/2018.
 */
public class PassphraseCount {
    private int validCount = 0;
    public void validate(String line) {
        List<String> listeAvecDoublons = Arrays.asList(line.split(" "));
        List<String> listeSansDoublons = listeAvecDoublons.stream()
                .distinct()
                .collect(Collectors.toList());
        if(listeAvecDoublons.size() == listeSansDoublons.size()) {
            validCount++;
        }
    }

    public int getValidCount() {
        return validCount;
    }
}
