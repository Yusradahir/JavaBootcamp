package bootcamp.data;

import java.math.BigDecimal;
import java.util.Optional;

public class Result {
    private final Status status;
    private final String statusMessage;
    private final Optional<BigDecimal> value;

   public Result(Status status){
       this.status = status;
       this.statusMessage = status.toString();
       this.value = Optional.empty();
   }

   public Result(Optional<BigDecimal> value){
       this.status = Status.SUCCESS;
       this.statusMessage = status.toString();
       this.value = value;
   }



    public Status getStatus(){

        return status;
    }

    public String getStatusMessage(){

        return statusMessage;
    }

    public Optional<BigDecimal> getValue() {

        return value;
    }


}
