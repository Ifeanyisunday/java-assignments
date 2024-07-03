import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    @Test
    public void testIfBankAddsAccount(){
        Bank gtb = new Bank();
        gtb.addAccount("ify", "1111");
        gtb.addAccount("sunday", "2222");
        gtb.addAccount("guy", "3333");
        assertEquals(3, gtb.getNoOfCustomers());
    }

    @Test
    public void testIfDeposit4k_is4k(){
        Bank gtb = new Bank();
        gtb.addAccount("ify", "1111");
        gtb.addAccount("sunday", "2222");
        gtb.addAccount("guy", "3333");
        gtb.bankDeposit(1, 4000);
        assertEquals(4000, gtb.checkBalance(1));
    }

    @Test
    public void testIfWithdraw3k_balanceIs_1k(){
        Bank gtb = new Bank();
        gtb.addAccount("ify", "1111");
        gtb.bankDeposit(1, 4000);
        gtb.bankWithdraw(1, 1000, "1111");
        assertEquals(3000, gtb.checkBalance(1));
    }

    @Test
    public void testIfTransferOf1k_is2k(){
        Bank gtb = new Bank();
        gtb.addAccount("ify", "1111");
        gtb.addAccount("sunday", "2222");
        gtb.bankDeposit(1, 2000);
        gtb.bankTransfer(1, 2, 1000, "1111");
        assertEquals(1000, gtb.checkBalance(1));
    }
}

