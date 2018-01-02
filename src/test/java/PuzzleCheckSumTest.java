import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by ffaure32 on 10/12/2017.
 */
public class PuzzleCheckSumTest {
    String fileName = "puzzle.txt";

    @Test
    public void computeCheckSumFromFile() {
        PuzzleCheckSum pcs = new PuzzleCheckSum();
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource(fileName).toURI()))) {

            stream.forEach(s -> pcs.collect(s));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void computeModuloSumFromFile() {
        PuzzleModuloSum pcs = new PuzzleModuloSum();
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource(fileName).toURI()))) {

            stream.forEach(s -> pcs.collect(s));
            pcs.printResult();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}