package cashregister;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
        FakePrint fakePrint = new FakePrint();
        CashRegister cashRegister = new CashRegister(fakePrint);
        Item item = new Item("cola", 3);
        Item[] items={item};
        Purchase purchase = new Purchase(items);
        //when
        cashRegister.process(purchase);
        //then
        assertTrue(fakePrint.isCalledPrint());
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given

        //when

        //then

    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given

        //when
        //then
    }

}
