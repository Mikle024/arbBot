package arbBot.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DenominationTest {
    Denomination deno = new Denomination(1, "RUB", 1_000);

    @Test
    public void getForIdTest() {

        Assertions.assertEquals(1, deno.getId());
    }

    @Test
    public void getForNameTest() {

        Assertions.assertEquals("RUB", deno.getName());
    }

    @Test
    public void getForQuantityTest() {

        Assertions.assertEquals(1_000, deno.getQuantity());
    }
}
