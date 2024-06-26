package game;

/**
 *
 */

public class Move {
	private MoveType moveType;
	private int startField;
	private int endField;
	private int moveAmount;
	private int specialBearOff;

	public Move(MoveType mt, int start, int moveAmount) {
		moveType = mt;
		startField = start;
		this.moveAmount = moveAmount;
		endField = start + moveAmount;
	}

	// for bear off move
	public Move(MoveType mt, int start, int moveAmount, int endPos,
			int actualMoveAmount) {
		moveType = mt;
		startField = start;
		this.moveAmount = moveAmount;
		endField = endPos;
		specialBearOff = actualMoveAmount;
	}

	@Override
	public String toString() {
		return moveType.name() + " " + startField + " + " + moveAmount + " = "
				+ endField;
	}

	public MoveType getMoveType() {
		return moveType;
	}

	public int getStartField() {
		return startField;
	}

	public int getEndField() {
		return endField;
	}

	public int getMoveAmount() {
		return moveAmount;
	}

	public int getBEAROFFMoveAmount() {
		return specialBearOff;
	}
}
