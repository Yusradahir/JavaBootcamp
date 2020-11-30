/**
 * @author Omar Bashir
 */
package bootcamp.kata.process;

import bootcamp.kata.data.Params;
import bootcamp.kata.data.Results;

import java.math.RoundingMode;


public class Processor {
    public Results process(final Params params) {


        return new Results(params.getX().add( params.getY()),params.getX().subtract(params.getY()), params.getX().multiply(params.getY()), params.getX().divide(params.getY()));
    }
}
