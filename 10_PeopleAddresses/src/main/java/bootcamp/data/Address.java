package bootcamp.data;

public class Address {
    private final String firstLine ;
    private final String secondLine ;
    private final String postCode ;
    private final String city ;

    public Address(String firstLine, String secondLine, String postCode, String city) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.postCode = postCode;
        this.city = city;
    }

    public String getFirstLine(){
        return firstLine;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {

        return postCode;
    }

    public String getSecondLine() {

        return secondLine;
    }


    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + firstLine.hashCode();
        result = 31 * result + secondLine.hashCode();
        result = 31 * result + postCode.hashCode();
        result = 31 * result + city.hashCode();


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
        Address a = (Address) obj;
        return firstLine.equals(a.firstLine) && secondLine.equals(a.secondLine) && postCode.equals(a.postCode) && city.equals(a.city)  ;



    }

}
