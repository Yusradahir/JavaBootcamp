import org.junit.Test;

import static org.junit.Assert.*;

public class CinemaTest {
    @Test
    public void shouldBeAbleToBuyCinemaTicketWhenOlderThanRestriction() {
        //given
        int age = 19;
        Customer customer = new Customer(age);
        Movie movie = new Movie("Frozen 2", 12);
        Cinema cinema = new Cinema();
        //when
        boolean canGetTicket = cinema.canBuyTicket(movie, customer);
        //then
        assertTrue(canGetTicket);
    }

    @Test
    public void shouldNotBeAbleToBuyCinemaTicketWhenYoungerThanRestriction() {
        int age = 11;
        Customer customer = new Customer(age);
        Movie movie = new Movie("Frozen",12);
        Cinema cinema = new Cinema();
        boolean canGetTicket = cinema.canBuyTicket(movie, customer);
        assertFalse(canGetTicket);
//        fail("not implemented");
    }

    @Test
    public void shouldThrowExceptionWhenTryOrderTicketAndYoungerThanAgeRestriction() {
        fail("not implemented");
    }

    @Test
    public void shouldGetTicketForTheRightSeatAndMovie() {
        //given
        int age = 19;
        String title = "Frozen 2";
        int seat = 42;
        Customer customer = new Customer(age);
        Movie movie = new Movie(title, 12);
        Cinema cinema = new Cinema();
        //when
        Ticket ticket = cinema.orderTicket(movie, customer, seat);
        //then
        assertEquals(new Ticket(title, seat), ticket);
    }
}
