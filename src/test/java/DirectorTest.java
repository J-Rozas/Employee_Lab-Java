import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {
    private Director director;

    @Before
    public void before() {
        director = new Director("Jane", "493jufba03", 10000000, "Sales", 8481940193.30);
    }

    @Test
    public void shouldHaveName() {
        assertEquals("Jane", director.getName());
    }

    @Test
    public void shouldHaveNINo() {
        assertEquals("493jufba03", director.getNINo());
    }

    @Test
    public void shouldHaveSalary() {
        assertEquals(100000.00, director.getSalary(), 0.0);
    }

    @Test
    public void shouldHaveDepartment() {
        assertEquals("Sales", director.getDepartmentName());
    }

    @Test
    public void shouldHaveBudget() {
        assertEquals(8481940193.30, director.getBudget(), 0.0);
    }

    @Test
    public void shouldBeAbleToGetSalaryRaise() throws Exception {
        director.raiseSalary(5000.24);
        assertEquals(105000.24, director.getSalary(), 0.0);
    }

    @Test
    public void shouldNotAcceptNegativeSalaryRaise() {
        Exception exception = assertThrows(Exception.class, () -> {
            director.raiseSalary(-0.01);
        });

        String expectedMessage = "Negative salary raises are not permitted";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void shouldBeAbleToGetBonusOf2Percent() {
        assertEquals(2000.0, director.payBonus(), 0.0);
    }

    @Test
    public void shouldBeAbleToChangeName() throws Exception{
        director.setName("New Name");
        assertEquals("New Name", director.getName());
    }

    @Test
    public void shouldNotAllowToPlaceNullName() {
        Exception exception = assertThrows(Exception.class, () -> {
            director.setName("");
        });

        String expectedMessage = "The name field cannot be blank";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}

