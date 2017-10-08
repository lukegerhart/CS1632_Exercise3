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
	
<<<<<<< HEAD
	@Test
	public void testRentCat{
		Cat c= Mockito.mock(Cat.class);
		Mockito.when(c.rentCat(Cat c)).thenReturn("");
=======
	//test happy path
	@Test
	public void listCatsTest() {
		ArrayList<Cat> cats = new ArrayList<Cat>();
		for (int i = 1; i < 4; i++) {
			Cat cat = Mockito.mock(Cat.class);
			Mockito.when(cat.toString()).thenReturn("ID " + i + ". " + "catName" + i);
			cats.add(cat);
		}
		String list = _l.listCats(cats);
		String correct = "ID 1. catName1\nID 2. catName2\nID 3. catName3\n";
		assertEquals(list, correct);
	}
	
	//test that the method doesn't list a rented cat1
	@Test
	public void listCatsRentedTest() {
		ArrayList<Cat> cats = new ArrayList<Cat>();
		for (int i = 1; i < 4; i++) {
			Cat cat = Mockito.mock(Cat.class);
			if (i == 1) {
				//stub getrented
				Mockito.when(cat.getRented()).thenReturn(true);
			}
			Mockito.when(cat.toString()).thenReturn("ID " + i + ". " + "catName" + i);
			cats.add(cat);
		}
		String list = _l.listCats(cats);
		String correct = "ID 2. catName2\nID 3. catName3\n";
		assertEquals(list, correct);
	}
	
	//happy path 
	@Test 
	public void rentCatTest(){
		Cat cat = Mockito.mock(Cat.class);
		Mockito.when(cat.getRented()).thenReturn(false);
		boolean b=_l.rentCat(cat);
		assertEquals(b,true);
	}
	
	//rent previously rented cat
	@Test
	public void rentCatNotThereTest(){
		Cat cat = Mockito.mock(Cat.class);
		//cat._rented=true;//make cat already rented
		Mockito.when(cat.getRented()).thenReturn(true);
		boolean b=_l.rentCat(cat);
		assertEquals(b,false);
	}
	
	//return a rented cat
	@Test 
	public void returnCatTest(){
		Cat cat = Mockito.mock(Cat.class);
		Mockito.when(cat.getRented()).thenReturn(true);
		boolean b=_l.returnCat(cat);
		assertEquals(b,true);
	}
	
	//return cat that is not rented
	@Test 
	public void returnCatStillThereTest(){
		Cat cat = Mockito.mock(Cat.class);
		Mockito.when(cat.getRented()).thenReturn(false);
		boolean b=_l.returnCat(cat);
		assertEquals(b,true);
	}
	
	//test cat exists happy path
	@Test
	public void catExistsTest() {
		ArrayList<Cat> cats = new ArrayList<Cat>();
		for (int i = 1; i < 4; i++) {
			Cat cat = Mockito.mock(Cat.class);
			Mockito.when(cat.getId()).thenReturn(i);
			cats.add(cat);
		}
		boolean catexists = _l.catExists(1, cats);
		assertTrue(catexists);
	}
	
	//test cat exists with null
	@Test
	public void catExistsNullTest() {
		boolean catexists = _l.catExists(1, null);
		assertFalse(catexists);
	}
	
	//test cat exists with empty list
	@Test
	public void catExistsEmptyTest() {
		boolean catexists = _l.catExists(1, new ArrayList<Cat>());
		assertFalse(catexists);

	}
}