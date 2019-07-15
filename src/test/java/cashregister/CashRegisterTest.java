package cashregister;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
        FakePrint fakePrint = new FakePrint();
        CashRegister cashRegister = new CashRegister(fakePrint);
        Item item = new Item("cola", 3);
        Item[] items={item};
        FakePurchase fakePurchase = new FakePurchase(items);
        fakePurchase.setMessage("TEST");
        //when
        cashRegister.process(fakePurchase);
        //then
        assertEquals(fakePurchase.asString(),fakePrint.getOut());
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        Printer printer = mock(Printer.class);
        Purchase purchase = mock(Purchase.class);
        when(purchase.asString()).thenReturn("TEST");
        CashRegister cashRegister = new CashRegister(printer);
        //when
        cashRegister.process(purchase);
        //then
        verify(printer).print("TEST");
    }

}
