package bootcamp.process;

import bootcamp.data.Processor;
import bootcamp.data.Summary;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProcessorTest {

    @Test
    public void shouldGetSummaryWithCorrectValuesWhenProcessingValidArray() {
        double[] arr = new double[]{1.0,2.0,3.0};
        Processor p = new Processor(arr);
        Summary sum = p.process() ;

        assertEquals(sum.getMax(),3.0,0.0);
        assertEquals(sum.getMin(),1.0,0.0);
        assertEquals(sum.getAverage(),2,0.0);
        assertEquals(sum.getCount(),3,0.0);
        assertEquals(sum.getSum(),6.0,0.0);

    }

    @Test
    public void shouldGetDefaultSummaryWhenProcessingEmptyArray() {
        double[] arr = new double[]{};
        Processor p = new Processor(arr);
        Summary sum = p.process() ;

        assertEquals(sum.getMax(),Double.NaN,0.0);
        assertEquals(sum.getMin(),Double.NaN,0.0);
        assertEquals(sum.getAverage(),Double.NaN,0.0);
        assertEquals(sum.getCount(),0,0.0);
        assertEquals(sum.getSum(),Double.NaN,0.0);

    }

    @Test
    public void shouldReturnValueAtGivenArrayIndex() {
        double[] arr = new double[]{1.0,2.0,3.0};
        Processor p = new Processor(arr);

        assertEquals(p.getValue(1),2.0,0.0);

    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldGetExceptionFromGetValueWhenIndexTooLarge() {
        double[] arr = new double[]{1.0,2.0,3.0};
        Processor p = new Processor(arr);

        assertEquals(p.getValue(5),0,0.0);


    }
}
