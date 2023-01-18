package BitManipulation.Basics;

import java.util.List;

public class SwapTwoNo {
    static List<Integer> get(int a, int b) {
        a = a^b;
        b = a^b;
        a = a^b;
        var x = List.of(a,b);
        return x;
    }
}
