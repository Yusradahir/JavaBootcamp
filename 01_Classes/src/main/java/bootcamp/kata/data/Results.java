/**
 * @author Omar Bashir
 */
package bootcamp.kata.data;

import java.math.BigDecimal;

public class Results {

    private final BigDecimal sum;
    private final BigDecimal difference;
    private final BigDecimal product;
    private final BigDecimal quotient;

//    private final BigDecimal sum = new BigDecimal(0); // TODO use constructor initialisation
//    private final BigDecimal difference = new BigDecimal(0); // TODO use constructor initialisation
//    private final BigDecimal product = new BigDecimal(0); // TODO use constructor initialisation
//    private final BigDecimal quotient = new BigDecimal(0); // TODO use constructor initialisation


    public Results(final BigDecimal sum, final BigDecimal difference,final BigDecimal product,final BigDecimal quotient) {
        this.sum = sum;
        this.difference = difference;
        this.product = product;
        this.quotient = quotient;

    }



    public final BigDecimal getSum() {
        return sum;
    }

    public final BigDecimal getDifference() {

        return difference;
    }

    public final BigDecimal getProduct() {
        return product;
    }

    public final BigDecimal getQuotient() {
        return quotient;
    }
}
