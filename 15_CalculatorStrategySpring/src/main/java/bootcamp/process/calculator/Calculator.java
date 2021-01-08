package bootcamp.process.calculator;

import bootcamp.data.Params;
import bootcamp.data.Result;
import bootcamp.data.Status;
import bootcamp.process.element.ProcessingElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.Optional;

@Configuration
public class Calculator {
    private final ProcessingElement adder ;
    private final ProcessingElement subtractor ;
    private final ProcessingElement multiplier ;
    private final ProcessingElement divider;


    @Autowired
    public Calculator( @Qualifier("adder") ProcessingElement adder,  @Qualifier("subtractor") ProcessingElement subtractor, @Qualifier("multiplier") ProcessingElement multiplier,@Qualifier("divider") ProcessingElement divider) {
        this.adder = adder;
        this.subtractor = subtractor;
        this.multiplier = multiplier;
        this.divider = divider;

    }

    public ProcessingElement getAdder() {

        return adder;
    }

    public ProcessingElement getSubtractor(){
        return subtractor;

    }

    public ProcessingElement getDivider() {

        return divider;
    }

    public ProcessingElement getMultiplier() {

        return multiplier;
    }


    public Result calculate(final Params params) {
        Optional<BigDecimal> value;
        BigDecimal x = params.getX();
        BigDecimal y = params.getY();
        if(params.getOperator() == "+"){
            value = Optional.ofNullable(adder.apply(x, y));
        }
        else if(params.getOperator()=="-"){
            value = Optional.ofNullable(subtractor.apply(x, y));
        }
        else if(params.getOperator() == "*"){
            value = Optional.ofNullable(multiplier.apply(x,y));

        }
        else if(params.getOperator()=="/"){
            value = Optional.ofNullable((divider.apply(x,y)));

        }else{
            return new Result(Status.INVALID_OPERATION);
        }


        return new Result(value);
    }
}
