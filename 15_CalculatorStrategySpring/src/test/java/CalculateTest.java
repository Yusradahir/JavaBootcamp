import bootcamp.process.calculator.Calculator;
import javafx.beans.binding.ListBinding;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class CalculateTest {

    private static ApplicationContext context;
    private static Calculator calc;



    //Create a @BeforeClass method of the unit test class to obtain an instance of the Calculator class using the application context.
    @BeforeClass
    public static void BeforeClass(){
        context = new AnnotationConfigApplicationContext("bootcamp");
        calc = context.getBean(Calculator.class);

    }

    //Write unit tests for Calculator class checking if instance members have been correctly assigned, i.e., addition triggers adder, etc.

    @Test
    public void ShouldTestCalculatorClass(){
        Calculator c = context.getBean(Calculator.class);
        assertEquals(c.getAdder(),"+");


    }
//
//    //Check if the application context returns the same instance of the Calculator class every time it is asked
//    // for one (i.e., Calculator is a singleton, default bean scope).
//    @Test

}
