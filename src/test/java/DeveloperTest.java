import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Dave", "193jfn83", 8000000);
    }

    @Test
    public void shouldHaveName() {
        assertEquals("Dave", developer.getName());
    }

    @Test
    public void shouldHaveNINo() {
        assertEquals("193jfn83", developer.getNINo());
    }

    @Test
    public void shouldHaveSalary() {
        assertEquals(80000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void shouldBeAbleToGetSalaryRaise() {
        developer.raiseSalary(1.1);
        assertEquals(80001.1, developer.getSalary(), 0.0);
    }

    @Test
    public void shouldBeAbleToGetBonus() {
        assertEquals(800.00, developer.payBonus(), 0.0);
    }
}
