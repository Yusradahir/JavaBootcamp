package bootcamp.data;

public class Person {
    private final String firstName ;
    private final String secondName ;

    public Person(String firstName,String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    //TODO Fix the compilation error.

}
