import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:/Users/Peultier Enzo/IdeaProjects/AdventOfCode/src/input/inputDay2.txt");

        List<String> list = new BufferedReader(new InputStreamReader(new FileInputStream(input), StandardCharsets.UTF_8)).lines().toList();

        int point = 0;

        for (String s : list) {
            String[] tab = s.split(" ");
            switch (tab[0]) {
                case "A":
                    switch (tab[1]) {
                        case "X":
                            point += 3;
                            break;
                        case "Y":
                            point += 3;
                            point += 1;
                            break;
                        case "Z":
                            point += 6;
                            point += 2;
                            break;
                    }
                    break;
                case "B":
                    switch (tab[1]) {
                        case "X":
                            point += 1;
                            break;
                        case "Y":
                            point += 3;
                            point += 2;
                            break;
                        case "Z":
                            point += 6;
                            point += 3;
                            break;
                    }
                    break;
                case "C":
                    switch (tab[1]) {
                        case "X":
                            point += 2;
                            break;
                        case "Y":
                            point += 3;
                            point +=3;
                            break;
                        case "Z":
                            point += 1;
                            point += 6;
                            break;
                    }
                    break;
            }
        }
        System.out.println(point);
    }
}
