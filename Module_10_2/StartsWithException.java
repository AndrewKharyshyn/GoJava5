package Module_10_2;

public class StartsWithException extends Exception {

   private String errMessage;

    StartsWithException(String errMessage) {
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }
}
