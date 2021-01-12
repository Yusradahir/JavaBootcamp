import bootcamp.data.Address;
import bootcamp.data.Person;
import bootcamp.data.PersonAddressPair;
import bootcamp.directory.AddressDirectory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class testAddressDirectory {
    //name is key
    //address is value

    AddressDirectory ad;


    @Before
    public void SetUpForTestBefore(){
        List<PersonAddressPair> l = new ArrayList<>();
        l.add(new PersonAddressPair(new Person("Yusra","Dahir"),new Address("London","highstreet","NE","HELLO")));
         ad = new AddressDirectory(l);
    }

    @Test
    public void getPersonAddressIfPersonExist(){
        Person p = new Person("Yusra","Dahir");
        Address a = new Address("London","highstreet","NE","HELLO");
        //return type im expecting
        Optional <Address> o = ad.getAddress(p);

        Assert.assertEquals(a,o.get());


    }

    @Test
    public void getPersonAddressIfPersonDoesNotExist(){
        Person person = new Person("Tracey", "parker");
//        Address address = new Address("London","highstreet","NE","HELLO");
        Optional <Address> o = ad.getAddress(person);
        Assert.assertTrue(o.isEmpty());


    }


    //update a persons address when that person exists in the directory
    //expected,actual
    @Test
    public void shouldUpdateAddressWhenPersonExists(){
        Person p = new Person("Yusra","Dahir");
        Address a = new Address("New York","highstreet","NE","HELLO");
        PersonAddressPair pair = new PersonAddressPair(p,a);
        ad.updateAddress(pair);
        Optional <Address> o = ad.getAddress(p);
        Assert.assertEquals(o.get(),a);

    }

    //Update a persons address when that person does not exist in the directoy

    @Test
    public void ShouldUpdatePersonsAddressDoesNotExists(){
        Person p = new Person("Tracey", "parker");
        Address a = new Address("LA","highstreet","NE","HELLO");
        PersonAddressPair pair = new PersonAddressPair(p,a);
        ad.updateAddress(pair);
        Optional <Address> o = ad.getAddress(p);
        Assert.assertEquals(o.get(),a);

    }



    //remove a person address from the directory

    @Test
    public void ShouldRemovePersonAddressFromTheDirectoy(){
        Person p = new Person("Yusra","Dahir");
        Address a = new Address("London","highstreet","NE","HELLO");
        ad.remove(p);
        Optional <Address> o = ad.getAddress(p);
        Assert.assertTrue(o.isEmpty());



    }







}
