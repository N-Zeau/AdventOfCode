import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Day1 {
    public static void main(String[] args) throws IOException {

        File input = new File("C:/Users/Peultier Enzo/IdeaProjects/AdventOfCode/src/input/inputDay1.txt");

        List<String> list = new BufferedReader(new InputStreamReader(new FileInputStream(input), StandardCharsets.UTF_8)).lines().toList();

        int sum = 0;
        int sumTemp = 0;
        List<Integer> sumList = new ArrayList<>();


        for (String s : list) {
            if (!s.equals("")) {
                sumTemp += Integer.parseInt(s);
            }else{
                sumList.add(sumTemp);
                sumTemp = 0;
            }
        }

        Collections.sort(sumList);
        System.out.println(sumList.get(sumList.size() - 1) +sumList.get(sumList.size() - 2) +sumList.get(sumList.size() - 3));

    }
}