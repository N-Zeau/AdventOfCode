import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Day3 {
    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("C:/Users/Peultier Enzo/IdeaProjects/AdventOfCode/src/input/inputDay3.txt");

        List<String> list = new BufferedReader(new InputStreamReader(new FileInputStream(input), StandardCharsets.UTF_8)).lines().toList();

        int sum = 0;

        for (int i = 0; i < list.size(); i += 3) {
            String elf1 = list.get(i);
            String elf2 = list.get(i + 1);
            String elf3 = list.get(i + 2);
            sum += functAux(elf1, elf2, elf3);

        }
        System.out.println(sum);

    }

    static int functAux(String elf1, String elf2, String elf3) {
        for (int i = 0; i < elf1.length(); i++) {
            for (int j = 0; j < elf2.length(); j++) {
                for (int k = 0; k < elf3.length(); k++) {
                    if (elf1.charAt(i) == elf2.charAt(j) && elf2.charAt(j) == elf3.charAt(k)) {
                        int ascii = elf1.charAt(i);
                        if (Character.isUpperCase(elf1.charAt(i))) {
                            return (ascii - 65 + 27);
                        } else {
                            return (ascii - 96);
                        }
                    }
                }
            }
        }
        return 0;
    }

}


