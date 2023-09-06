package model;

/**
 * @author Kenneth Nimmo - Knimmo
 * CIS175 - Fall 2021
 * Sep 6, 2023
 */
public class GameLogic {
	
	public double claculateDiscountPrice(Game game, double percent) {
		double discountPrice = 0;
		double discountPercent = 1 - percent;
		discountPrice = game.getPrice() * discountPercent;
		return discountPrice;
	}
	
	public boolean isAAAGame(Game game) {
		if(game.getPrice() >= 59.99) {
			return true;
		}
		else return false;
	}

}
