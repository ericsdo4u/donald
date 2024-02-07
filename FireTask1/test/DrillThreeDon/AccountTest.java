package DrillThreeDon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositposistiveBalance_balanceWillChangechangedTest() {
        Account donAccount = new Account();
        donAccount.deposit(36.4);
        assertEquals(36.4,donAccount.getBalanec());


    }


    @Test
    public void depositAddMorePositiveBalance_balanceWillchangeTest() {
        Account donAccount = new Account();
        donAccount.deposit(23);
        donAccount.deposit(100);
        assertEquals(123, donAccount.getBalanec());

    }
}