package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {

    private String message = "";
    private String messageError = null;
    public ClearState(ClearState copy) {
        message = copy.message;
        messageError = copy.messageError;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.
    public ClearState() {}

    public String getMessage() {
        return message;
    }

    public String getMessageError() {
        return messageError;
    }

    public void setMessage(String message) {this.message = message; }

    public void setMessageError(String messageError) {this.messageError = messageError; }

}
