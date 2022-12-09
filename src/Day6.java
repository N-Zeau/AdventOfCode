import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Day6 {
    public static void main(String[] args) throws IOException {
        File input = new File("C:/Users/Peultier Enzo/IdeaProjects/AdventOfCode/src/input/inputDay6.txt");

        String line = new BufferedReader(new InputStreamReader(new FileInputStream(input), StandardCharsets.UTF_8)).readLine();

        for (int i = 0; i < line.length() - 4; i++){
            char[] marqueur = Arrays.copyOfRange(line.toCharArray(), i, i+14);
            Set<Character> set = new java.util.HashSet<>(Collections.emptySet());

            for (int j = 0; j < 14; j++){
                set.add(marqueur[j]);
            }

            if (set.size() == 14){
                System.out.println(i + 14);
                return ;
            }

        }

    }
}
