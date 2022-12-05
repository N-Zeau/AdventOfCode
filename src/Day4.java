import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Day4 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("C:/Users/Peultier Enzo/IdeaProjects/AdventOfCode/src/input/inputDay4.txt");

        List<String> list = new BufferedReader(new InputStreamReader(new FileInputStream(input), StandardCharsets.UTF_8)).lines().toList();
        int compteur = 0;

        for (String s : list) {
            String[] tab = s.split(",");
            String[] tab2 = tab[0].split("-");
            String[] tab3 = tab[1].split("-");
            int FL = Integer.parseInt(tab2[0]);
            int FR = Integer.parseInt(tab2[1]);
            int SL = Integer.parseInt(tab3[0]);
            int SR = Integer.parseInt(tab3[1]);
            if (SL >= FL && SL <= FR || SR >= FL && SR <= FR || FL >= SL && FL <= SR || FR >= SL && FR <= SR) {
                compteur += 1;
            }
        }
        System.out.println(compteur);


    }
}
