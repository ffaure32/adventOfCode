import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * Created by ffaure32 on 10/12/2017.
 */
public class MazeTest {
    String fileName = "maze.txt";


    @Test
    public void testExemples() {
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource("mazeSample.txt").toURI()))) {

            List<Integer> mazeInteger = stream.map(s -> Integer.parseInt(s))
                    .collect(Collectors.toList());
            Maze maze = new Maze(mazeInteger);
            maze.exit();
            assertEquals(5, maze.getStepsCount());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReel() {
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource("maze.txt").toURI()))) {

            List<Integer> mazeInteger = stream.map(s -> Integer.parseInt(s))
                    .collect(Collectors.toList());
            Maze maze = new Maze(mazeInteger);
            maze.exit();
            assertEquals(326618, maze.getStepsCount());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testExemplesSpecial() {
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource("mazeSample.txt").toURI()))) {

            List<Integer> mazeInteger = stream.map(s -> Integer.parseInt(s))
                    .collect(Collectors.toList());
            Maze maze = new SpecialMaze(mazeInteger);
            maze.exit();
            assertEquals(10, maze.getStepsCount());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReelSpecial() {
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource("maze.txt").toURI()))) {

            List<Integer> mazeInteger = stream.map(s -> Integer.parseInt(s))
                    .collect(Collectors.toList());
            Maze maze = new SpecialMaze(mazeInteger);
            maze.exit();
            assertEquals(21841249, maze.getStepsCount());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}