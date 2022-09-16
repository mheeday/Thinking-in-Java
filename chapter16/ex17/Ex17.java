package chapter16.ex17;

import chapter16.Generator;

import java.math.BigDecimal;
import java.util.Arrays;
import chapter16.Generated;


public class Ex17 {
    public static class BigDecimalGenerator implements Generator<BigDecimal> {
        private BigDecimal value = new BigDecimal(0);
        private BigDecimal step;

        BigDecimalGenerator(BigDecimal step) {
            this.step = step;
        }

        public BigDecimal next() {
            BigDecimal oldValue = value;
            value = value.add(step);
            return oldValue;
        }
    }
    public static void main(String[] args) {
        BigDecimal[] a = { new BigDecimal(9), new BigDecimal(8),
                new BigDecimal(7), new BigDecimal(6) };
        System.out.println(Arrays.toString(a));
        a = Generated.array(a, new BigDecimalGenerator(
                new BigDecimal("0.1")));
        System.out.println(Arrays.toString(a));
        BigDecimal[] b = Generated.array(BigDecimal.class,
                new BigDecimalGenerator(new BigDecimal("0.2")), 15);
        System.out.println(Arrays.toString(b));
    }
}
