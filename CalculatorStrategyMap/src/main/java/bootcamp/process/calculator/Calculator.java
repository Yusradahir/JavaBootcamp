package bootcamp.process.calculator;

import bootcamp.data.Params;
import bootcamp.data.Result;
import bootcamp.data.Status;
import bootcamp.process.element.ElementFactory;
import bootcamp.process.element.ProcessingElement;

import java.math.BigDecimal;
import java.util.Optional;

public class Calculator {
    private final ElementFactory factory;

    public Calculator() {
        this.factory = new ElementFactory();
    }

    public Result calculate(final Params params) {
        Optional<ProcessingElement> processingElement = Optional.ofNullable(factory.elementMap.get(params.getOperator()));
        if (!processingElement.isPresent()) {
            return new Result(Status.INVALID_OPERATION, "Invalid operator provided.");
        }

        try {
            BigDecimal value = processingElement.get().process(params.getX(), params.getY());
            return new Result(Optional.ofNullable(value));
        } catch(Exception e) {
            return new Result(Status.ARITHMETIC_ERROR, e.getMessage());
        }
    }
}
