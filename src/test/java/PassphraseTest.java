import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * Created by ffaure32 on 10/12/2017.
 */
public class PassphraseTest {
    String fileName = "passphrase.txt";


    @Test
    public void testExemples() {
        PassphraseCount pcs = new PassphraseCount();
        pcs.validate("aa bb cc dd ee");
        pcs.validate("aa bb cc dd aa");
        pcs.validate("aa bb cc dd aaa");
        assertEquals(2, pcs.getValidCount());
    }


    @Test
    public void computePassphraseFromFile() {
        PassphraseCount pcs = new PassphraseCount();
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource(fileName).toURI()))) {

            stream.forEach(s -> pcs.validate(s));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        assertEquals(466, pcs.getValidCount());
    }

    @Test
    public void testExemplesAnagrams() {
        PassphraseWithoutAnagramsCount pcs = new PassphraseWithoutAnagramsCount();
        pcs.validate("abcde fghij");
        pcs.validate("abcde xyz ecdab");
        pcs.validate("a ab abc abd abf abj");
        pcs.validate("iiii oiii ooii oooi oooo");
        pcs.validate("oiii ioii iioi iiio");
        assertEquals(3, pcs.getValidCount());
    }

    @Test
    public void computePassphraseWithoutAnagramsFromFile() {
        PassphraseWithoutAnagramsCount pcs = new PassphraseWithoutAnagramsCount();
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource(fileName).toURI()))) {

            stream.forEach(s -> pcs.validate(s));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        assertEquals(251, pcs.getValidCount());
    }

}