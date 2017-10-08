import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import java.util.ArrayList;

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
	
	//test happy path
	@Test
	public void listCatsTest() {
		ArrayList<Cat> cats = new ArrayList<Cat>();
		Cat cat1 = Mockito.mock(Cat.class);
		cat1._id = 1;
		cat1._name = "cat1Name";
		Cat cat2 = Mockito.mock(Cat.class);
		cat2._id = 2;
		cat2._name = "cat2Name";
		Cat cat3 = Mockito.mock(Cat.class);
		cat3._id = 3;
		cat3._name = "cat3Name";
		cats.add(cat1);
		cats.add(cat2);
		cats.add(cat3);
		String list = _l.listCats(cats);
		String correct = "ID 1. cat1Name\nID 2. cat2Name\nID 3. cat3Name";
		assertEquals(list, correct);
	}
}