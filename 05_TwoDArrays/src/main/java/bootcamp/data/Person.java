package bootcamp.data;

public class Person {

    private final String firstName ;
    private final String lastName ;

    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }


    public String getFirstName(){

        return firstName;
    }

    public String getLastName(){
        return lastName;
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person person = (Person) obj;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName);
    }



}
