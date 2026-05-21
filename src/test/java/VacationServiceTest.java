import org.example.VacationService;

public class VacationServiceTest {
    @Test
    public void testFirstExample() {
        VacationService service = new VacationService();
        Assertions.assertEquals(3, service.calculate(10_000, 3_000, 20_000));
    }

    @Test
    public void testSecondExample() {
        VacationService service = new VacationService();
        Assertions.assertEquals(2, service.calculate(100_000, 60_000, 150_000));
    }
}
