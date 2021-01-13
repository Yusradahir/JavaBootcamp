package bootcamp.directory;

import bootcamp.data.Address;
import bootcamp.data.Person;
import bootcamp.data.PersonAddressPair;

import java.util.*;

public class AddressDirectory {
    private final Map<Person, Address> directory;


    public AddressDirectory(final List<PersonAddressPair> addressList) {
        directory = new TreeMap<>(new Comparator<Person>() {

            @Override
            public int compare(Person person, Person t1) {
                if(person.getFirstName()==t1.getFirstName()){
                    return 0;
                }else{
                    return -1;
                }
            }

        });

        for(PersonAddressPair p: addressList){
            directory.put(p.getPerson(),p.getAddress());

        }    }

    public Optional<Address> getAddress(final Person person) {

        if(this.directory.containsKey(person)){
            return Optional.of(this.directory.get(person));
        }

        return Optional.empty();
    }

    public void updateAddress(final PersonAddressPair personAddress) {
        directory.put(personAddress.getPerson(),personAddress.getAddress());    }

    public void remove(final Person person) {
        directory.remove(person);
    }
}
