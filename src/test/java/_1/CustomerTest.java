package _1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    @Test
    public void statement() throws Exception {
        Customer customer1 = new Customer("顾客1");
        Movie movie1 = new Movie("第一部电影", Movie.CHILDRENS);
        Rental rental1 = new Rental(movie1, 2);
        customer1.addRental(rental1);

        System.out.println(customer1.getName());
        String stmt = customer1.statement();
        System.out.println("------------------");
        System.out.println(stmt);

        String result = "Rental Record for 顾客1\n" +
                "\t第一部电影\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";

        assertEquals("测试时间", result, stmt);
    }
}
