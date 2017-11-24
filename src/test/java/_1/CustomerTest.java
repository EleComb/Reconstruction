package _1;

import org.junit.Test;

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

    }
}
