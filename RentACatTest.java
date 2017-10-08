import static org.junit.Assert.*;

import org.junit.*;

public class RentACatTest{
// Re-usable RentACat reference.
    RentACat _l;

    // Create a new RentACat instance before each test.
    @Before
    public void setup() {
	_l = new RentACat();
    }
    
    // Assert that creating a new RentACat instance
    // does not return a null reference
    @Test
    public void testRentACatExists() {
	assertNotNull(_l);
    }
	
	@Test
	public void testRentCat{
		Cat c= Mockito.mock(Cat.class);
		Mockito.when(c.rentCat(Cat c)).thenReturn("");
	}
}