package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Game;
import model.GameLogic;

/**
 * @author Kenneth Nimmo - Knimmo
 * CIS175 - Fall 2021
 * Sep 6, 2023
 */
public class TestGame {
	GameLogic gameL = new GameLogic();
	Game game = new Game("Baldurs Gate 3", "Role Play Game", "Larian Studios", "Larian Studios", 2023, 59.99);
	Game gameNull = new Game();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetName() {
		String expected = "Baldurs Gate 3";
		assertEquals(expected, game.getName());
	}
	
	@Test
	public void testSetGenre() {
		game.setGenre("First Person Shooter");
		String expected = "First Person Shooter";
		assertEquals(expected, game.getGenre());
	}
	
	@Test
	public void testSetPrice() {
		game.setPrice(29.99);
		double expected = 29.99;
		assertEquals(expected, game.getPrice(), 0.1);
	}
	
	@Test
	public void testDefaultConstructor() {
		assertNull(gameNull.getPublisher());
	}

}
