package acslprob3;

public class GameRules {
	private Location loc;
	private char Direction;
	private int numberOfMoves;
	private Board pathBoard;
	
	public GameRules(String rules) {
		// TODO Auto-generated constructor stub
		String [] arrRules = rules.split(" ");
		setLoc(new Location(
					Integer.parseInt(arrRules[0]),  
					Integer.parseInt(arrRules[1])
				));
		setDirection(arrRules[2]);
		setNumberOfMoves(Integer.parseInt(arrRules[3]));
		pathBoard = new Board("0 0 0 0 0 0 0 0");
	}

	public Board getPathBoard() {
		return pathBoard;
	}
	public void Move(Board b) {
		// TODO Auto-generated method stub
		if(b.getVal(loc) == 0)
		{
			pathBoard.setVal(pathBoard.getVal(loc) + 1, loc);
			if(Direction == 'L') {loc.MoveRight();}
			if(Direction == 'R') {loc.MoveLeft();}
			if(Direction == 'A') {loc.MoveBelow();}
			if(Direction == 'B') {loc.MoveAbove();}
			
		}
		else
		{
			int x =  pathBoard.getVal(loc);
			pathBoard.setVal(pathBoard.getVal(loc) + 1, loc);
			x = x % 4;
			if (x == 0) {
				if(Direction == 'L') {loc.MoveAbove();Direction = 'B';}
				else if(Direction == 'R') {loc.MoveBelow();Direction = 'A';}
				else if(Direction == 'A') {loc.MoveRight();Direction = 'L';}
				else if(Direction == 'B') {loc.MoveLeft();Direction = 'R';}
			}
			if (x == 1) {
				if(Direction == 'L') {loc.MoveRight();Direction = 'L';}
				else if(Direction == 'R') {loc.MoveLeft();Direction = 'R';}
				else if(Direction == 'A') {loc.MoveBelow();Direction = 'A';}
				else if(Direction == 'B') {loc.MoveAbove();Direction = 'B';}
			}
			if (x == 2) {
				if(Direction == 'L') {loc.MoveBelow();Direction = 'A';}
				else if(Direction == 'R') {loc.MoveAbove();Direction = 'B';}
				else if(Direction == 'A') {loc.MoveLeft();Direction = 'R';}
				else if(Direction == 'B') {loc.MoveRight();Direction = 'L';}
			}
			if (x == 3) {
				if(Direction == 'L') {loc.MoveLeft();Direction = 'R';}
				else if(Direction == 'R') {loc.MoveRight();Direction = 'L';}
				else if(Direction == 'A') {loc.MoveAbove();Direction = 'B';}
				else if(Direction == 'B') {loc.MoveBelow();Direction = 'A';}
			}
		}
	}
	
	

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public char getDirection() {
		return Direction;
	}

	public void setDirection(String arrRules) {
		Direction = arrRules.charAt(0);
	}

	public int getNumberOfMoves() {
		return numberOfMoves;
	}

	public void setNumberOfMoves(int numberOfMoves) {
		this.numberOfMoves = numberOfMoves;
	}


	
}
