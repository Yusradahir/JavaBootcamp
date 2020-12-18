package bootcamp.process;

import bootcamp.data.Location;
import bootcamp.data.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class PersonLocatorTest {

    //You need at least two unit tests here, being able to locate a value in the two dimensional array and not being able to locate a value there.


    PersonLocator people;
    @Before
    public void createObjectsForAllTests(){

//        PersonLocator per = new PersonLocator(new Person[][]{{new Person("Harry","Style"),new Person("Yusra","Dahir")}});
        Person [][] per = new Person [][] {{new Person("Yusra","Dahir"),new Person("harry","styles")},{new Person("John","Smith")}
                };

        Optional<Location> location = Optional.empty();
        people = new PersonLocator(per);

    }



    @Test
    public void shouldBeAbleToLocateValueIn2DArray(){

        Person person = new Person("harry","styles");
        assertTrue(people.find(person).isPresent());


    }

    @Test
    public void WillNotFindPerson(){
        Person person = new Person("sam","simpson");
        assertTrue(people.find(person).isEmpty());
    }
}