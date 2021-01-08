package bootcamp.app;

import bootcamp.data.Params;
import bootcamp.data.Result;
import bootcamp.process.calculator.Calculator;
import bootcamp.process.element.impl.ElementFactory;
import javafx.application.Application;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

//instantiate the annotation based application context that uses ElementFactory class as the configuration.
//Use the application context to get an instance of Calculator.
//Exercise the Calculator instance using the command line arguments.

public class CalculatorApp {


    public static void main(String[]args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext("bootcamp");
        BeanFactory beanFactory = ctx.getAutowireCapableBeanFactory();
        Calculator calc = beanFactory.getBean(Calculator.class);
        BigDecimal x = new BigDecimal(4);
        BigDecimal y = new BigDecimal(3);
        Params param = new Params(x,y,"+");
        Result r = calc.calculate(param);
        System.out.println("The result is : " + r.getStatus() + ": " + r.getStatusMessage() + ":" + r.getValue().orElse(null));





    }
}
