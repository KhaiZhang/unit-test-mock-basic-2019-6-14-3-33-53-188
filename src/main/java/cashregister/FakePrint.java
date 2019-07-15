package cashregister;

public class FakePrint extends Printer{
    private String out;
    private boolean isCalled=false;

    @Override
    public void print(String printThis){
        out=printThis;
        isCalled=true;
    }

    public String getOut() {
        return out;
    }

    public boolean isCalledPrint(){
        return isCalled;
    }
}
