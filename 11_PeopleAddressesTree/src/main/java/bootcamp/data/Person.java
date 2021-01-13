package bootcamp.data;

public class Person implements Comparable<Person> {

    private final String firstName ;

    private final String secondName ;

    public Person(String firstName,String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

//    @Override
//    public String toString(){
//        return "Person firstname is :" + firstName + " second name is :" + secondName;
//    }


    //first obj calling the method + p object
    //access an obj youre calling -> this
    //1st obj is less -> return -1
    //1st obj is > ->return +1
    //1st obj  = ->0
    @Override
    public int compareTo(Person p) {

        if(this.getFirstName() == p.getFirstName()){
            return 0;
        }else{
            return -1;
        }

    }


}
