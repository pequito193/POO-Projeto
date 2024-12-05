package gameObjects;

import utils.Point2D;

public class Ladder extends GameObject {
	private static final String NAME = "Ladder";
	private static final int LAYER = 0;
	
	public Ladder(Point2D startingPosition) {
		super(NAME, startingPosition, LAYER);
	}
	
	@Override
	public boolean isWalkable() {
		return true;
	}
	
	@Override
	public boolean isCrossable() {
		return true;
	}
	
	@Override
	public boolean isClimbable() {
		return true;
	}
	
	@Override
	public boolean isAttackable() {
		return false;
	}
	
	@Override
	public boolean isCollectable() {
		return false;
	}
	
	@Override
	public boolean isTrap() {
		return false;
	}
	
	@Override
	public boolean isObjective() {
		return false;
	}

	@Override
	public boolean isFallable() {
		return false;
	}
}
