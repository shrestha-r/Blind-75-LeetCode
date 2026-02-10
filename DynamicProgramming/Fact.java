import java.util.HashMap;
import java.util.function.Function;

public class Fact {
    private final Function<Integer, Integer> f;

    public Fact() {
        HashMap<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 1);
        this.f = x -> {
            if (memo.containsKey(x)) {
                return memo.get(x);
            } else {
                int result = x * f.apply(x - 1);
                memo.put(x, result);
                return result;4
            }
        };
    }

    public int fact(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        return f.apply(n);
    }
}   