import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.*;

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
    public void shouldBeAbleToGetSalaryRaise() throws Exception {
        developer.raiseSalary(1.1);
        assertEquals(80001.1, developer.getSalary(), 0.0);
    }

    @Test
    public void shouldNotAcceptNegativeSalaryRaise() {
        Exception exception = assertThrows(Exception.class, () -> {
            developer.raiseSalary(-103.3);
        });

        String expectedMessage = "Negative salary raises are not permitted";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void shouldBeAbleToGetBonus() {
        assertEquals(800.00, developer.payBonus(), 0.0);
    }

    @Test
    public void shouldBeAbleToChangeName() throws Exception{
        developer.setName("New Name");
        assertEquals("New Name", developer.getName());
    }

    @Test
    public void shouldNotAllowToPlaceNullName() {
        Exception exception = assertThrows(Exception.class, () -> {
            developer.setName("");
        });

        String expectedMessage = "The name field cannot be blank";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
