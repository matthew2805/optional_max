import java.util.Arrays;
import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt res;
        if (values != null && values.length > 0)
            res = OptionalInt.of(Arrays.stream(values).max().getAsInt());
        else res = OptionalInt.empty();
        return res;
    }
}
