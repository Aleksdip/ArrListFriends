import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Cheberyak Oleg");
        name.add("Zelenskyy Volodymyr");
        name.add("Zaluzhnyi Valerii");
        name.add("Bagrov Denis");
        name.add("Polyakov Aleksander");

        for (String a : name) {
            System.out.println(a);
        }
        System.out.println("\nCортування за абеткою: \n");
        Collections.sort(name);
        for (String a : name) {
            System.out.println(a);
        }
    }
}
