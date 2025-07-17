import java.util.HashMap;
import java.util.Map;

public class EjerciciosPD {
    private Map<Integer, Long> map = new HashMap<>();

    public Long getFibonaci(int n) {
        if (n <= 1)
            return (long) n;

        return getFibonaci(n - 1) + getFibonaci(n - 2);
    }

    public Long getFibonaciPD(int n) {
        if (n <= 1)
            return (long) n;

        if (map.containsKey(n)) {
            return (long) map.get(n);
        }

        long result = getFibonaciPD(n - 1) + getFibonaciPD(n - 2);
        map.put(n, result);
        return result;
    }

}