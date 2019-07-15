package cashregister;

public class FakePurchase extends Purchase{
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public FakePurchase(Item[] items) {
        super(items);
    }

    @Override
    public String asString(){
        return message;
    }
}
