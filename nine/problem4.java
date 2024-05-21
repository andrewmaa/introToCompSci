package nine;

import java.math.BigDecimal; // used for BigDecimal manipulation 
import java.math.RoundingMode; // used for rounding to 25 decimal places

public class problem4 {
    public static void main(String[] args) {
        // adding 100 for every approximation case
        for (BigDecimal num = new BigDecimal("100"); num.compareTo(new BigDecimal("1000")) <= 0; num = num.add(new BigDecimal("100"))) {
			System.out.println(num + "    " + findE(num));
		}
    }

    public static BigDecimal findE(BigDecimal num) {
        // create bigdecimal for value of 1 to be compared with
        BigDecimal one = new BigDecimal("1");

        // variable to hold the sum of the approximation
        BigDecimal e = new BigDecimal("0.0");

        // find number of terms based on # of i-values
        for (BigDecimal i = one; i.compareTo(num) <= 0; i = i.add(one)) {
            
            // start adding from i!, then subtract 1 from i for the next factorial
            BigDecimal denom = i;
            for (BigDecimal j = i.subtract(one); j.compareTo(one) >= 1; j = j.subtract(one)) {
                
                // add to denominator
                denom = denom.multiply(j); 

            }
            // find 1/i! and add it to e-value, rounding to 25 decimal places
            e = e.add(one.divide(denom, 25, RoundingMode.UP));
        }

        return e;
    }
}
