package bootcamp.data;


//process function and a getValue.
// Constructor of this class takes an array of double precision floating point numbers (type double) to initialise an array instance variable.
// Process function returns a Summary object containing the minimum and maximum values,
// number of elements in the array, sum of values and the average value.
// The getValue function takes the index (type integer) and returns the value at that index.

import java.lang.reflect.Array;

public class Processor {

    private final double[] newArr;

    public Processor(double [] newArr){
        this.newArr = newArr;
    }

    public Summary process() {

        double m_2;
        double m_1;
        double sum;
        double count = newArr.length;
        double average;
        if (newArr.length == 0) {
            return new Summary(Double.NaN, Double.NaN, 0, 0, Double.NaN);

        } else {
            m_1 = newArr[0];
            m_2 = newArr[0];
            sum = 0;
            for (int i = 0; i < newArr.length; i++) {
                sum += newArr[i];
                if (newArr[i] > m_1) {
                    m_1 = newArr[i];
                }
            }
            for (int j = 0; j < newArr.length; j++) {
                if (newArr[j] < m_2) {
                    m_2 = newArr[j];
                }

            }
        }
        average = sum/count;
        return new Summary(m_2, m_1, sum, count, average);
    }

    public double getValue(int index){
        try{

            return this.newArr[index];

        }catch (ArrayIndexOutOfBoundsException e){
            return 0;
        }
    }
}

