package ru.gb.seminar1;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachineTest extends TestCase {

    public void testGetProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new HotDrink("americano",20.0,200,70));
        products.add(new HotDrink("americano",20.0,100,70));
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(products);
        HotDrink expected = new HotDrink("americano",20.0,200,70);

        HotDrink actual = hotDrinkVendingMachine.getProduct("americano",200,70);

        Assertions.assertEquals(expected, actual);
    }
}