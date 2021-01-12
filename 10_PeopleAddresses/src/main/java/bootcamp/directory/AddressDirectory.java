package bootcamp.directory;

import bootcamp.data.Address;
import bootcamp.data.Person;
import bootcamp.data.PersonAddressPair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


//The AddressDirectory’s constructor takes a list of PersonAddressPair objects

//should populate a HashMap assigned to the directory instance member


public class AddressDirectory {

    private final Map<Person, Address> directory ;


    public AddressDirectory(final List<PersonAddressPair> addressList) {
        this.directory = new HashMap<>();

        for(PersonAddressPair p: addressList){
            directory.put(p.getPerson(),p.getAddress());

        }
    }

    //return address of the person
    public Optional<Address> getAddress(final Person person) {

        if(this.directory.containsKey(person)){
            return Optional.of(this.directory.get(person));
        }

        return Optional.empty();
    }

    public void updateAddress(final PersonAddressPair personAddress) {
       directory.put(personAddress.getPerson(),personAddress.getAddress());
    }

    public void remove(final Person person) {
        directory.remove(person);

    }
}
