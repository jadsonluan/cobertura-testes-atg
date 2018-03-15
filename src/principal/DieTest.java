package principal;

import org.junit.*;
import static org.junit.Assert.*;

public class DieTest {
	@Test
	public void testConstrutorSemParametro() {
		new Die();
		new Die(2);
		new Die(2, 1);
	}
	
	@Test
	public void testRoll() {
		Die die = new Die();
		die.roll();
	}
	
	@Test
	public void testGetNumSides() {
		Die die = new Die();
		die.getNumSides();
	}

	@Test
	public void testGetResult() {
		Die die = new Die();
		die.getResult();
	}
	
	@Test
	public void testEquals() {
		Die die = new Die();
		die.equals(new Die());
		die.equals(null);
		die.equals(die);
		die.equals(new Object());
	}
	
	@Test
	public void testToString() {
		Die die = new Die();
		die.toString();
	}
	
	@Test(expected = AssertionError.class)
	public void TestConstrutorResultadoMaiorLados() {
		Die die = new Die(2, 5);
	}
	
	@Test(expected = AssertionError.class)
	public void TestConstrutorLadosInvalidos() {
		Die die = new Die(1, 0);
	}
	
	@Test
	public void testEquals2() {
		Die die = new Die(6, 3);
		Die dae = new Die(6, 2);
		die.equals(dae);
	}
	
	@Test
	public void testEquals3() {
		Die die = new Die(5, 3);
		Die dae = new Die(6, 3);
		die.equals(dae);
	}
}
