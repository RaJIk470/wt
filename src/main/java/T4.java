import org.apache.commons.math3.primes.Primes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T4 {

    public List<Integer> calculate(int[] input) {
        return Arrays.stream(input)
                .filter(Primes::isPrime)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}
