import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin dbadmin;

    @Before
    public void before() {
        dbadmin = new DatabaseAdmin("Joe", "944jkanf93", 3100000);
    }

    @Test
    public void shouldHaveName() {
        assertEquals("Joe", dbadmin.getName());
    }

    @Test
    public void shouldHaveNINo() {
        assertEquals("944jkanf93", dbadmin.getNINo());
    }

    @Test
    public void shouldHaveSalary() {
        assertEquals(31000.00, dbadmin.getSalary(), 0.0);
    }

    @Test
    public void shouldBeAbleToGetSalaryRaise() {
        dbadmin.raiseSalary(1000.0);
        assertEquals(32000.00, dbadmin.getSalary(), 0.0);
    }

    @Test
    public void shouldBeAbleToGetBonus() {
        assertEquals(310.00, dbadmin.payBonus(), 0.0);
    }
}
