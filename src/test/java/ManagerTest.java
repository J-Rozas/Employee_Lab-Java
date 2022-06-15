import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("John", "1234abc56", 5000000, "Sales");
    }

    @Test
    public void shouldHaveName() {
        assertEquals("John", manager.getName());
    }

    @Test
    public void shouldHaveNINo() {
        assertEquals("1234abc56", manager.getNINo());
    }

    @Test
    public void shouldHaveSalary() {
        assertEquals(50000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void shouldHaveDepartment() {
        assertEquals("Sales", manager.getDepartmentName());
    }

    @Test
    public void shouldBeAbleToGetSalaryRaise() throws Exception {
        manager.raiseSalary(5000.24);
        assertEquals(55000.24, manager.getSalary(), 0.0);
    }

    @Test
    public void shouldNotAcceptNegativeSalaryRaise() {
        Exception exception = assertThrows(Exception.class, () -> {
            manager.raiseSalary(-483.48);
        });

        String expectedMessage = "Negative salary raises are not permitted";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void shouldBeAbleToGetBonus() {
        assertEquals(500.00, manager.payBonus(), 0.0);
    }

    @Test
    public void shouldBeAbleToChangeName() throws Exception{
        manager.setName("New Name");
        assertEquals("New Name", manager.getName());
    }

    @Test
    public void shouldNotAllowToPlaceNullName() {
        Exception exception = assertThrows(Exception.class, () -> {
            manager.setName("");
        });

        String expectedMessage = "The name field cannot be blank";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
