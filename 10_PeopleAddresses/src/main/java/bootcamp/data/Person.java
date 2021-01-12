package bootcamp.data;

public class Person {
    private final String firstName ; //FIXME
    private final String secondName ; //FIXME

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSecondName(){

        return secondName;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + secondName.hashCode();

        return result;
    }




    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Person person = (Person) obj;
        return firstName.equals(person.firstName) && secondName.equals(person.secondName);



    }
}
