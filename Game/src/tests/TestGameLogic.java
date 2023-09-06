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
public class TestGameLogic {
	GameLogic gameL = new GameLogic();
	Game game = new Game("Baldurs Gate 3", "Role Play Game", "Larian Studios", "Larian Studios", 2023, 59.99);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalcualteDiscountPrice() {
		double discountPrice = gameL.claculateDiscountPrice(game, 0.3);
		double expected = 42;
		assertEquals(expected, discountPrice, 0.1);
	}
	
	@Test
	public void testIsAAAGame() {
		assertTrue(gameL.isAAAGame(game));
	}

}
