package acslprob3;

public class Location {

	int col;
	int row;
	public Location(int x , int y) {
		this.col = y-1;
		this.row = x-1;
	}

	public void PrintLocation() {
		System.out.print("[" + (row +1) + "," + (col + 1) + "]");
	}
	
	public void MoveRight() {
		// TODO Auto-generated method stub
		col+=1;
		if (col == 8)
		{
			col =0;
		}
	}


	public void MoveBelow() {
		// TODO Auto-generated method stub
		row+=1;
		if (row == 8)
		{
			row =0;
		}
	}

	public void MoveLeft() {
		// TODO Auto-generated method stub
		col-=1;
		if (col == -1)
		{
			col =7;
		}
	}

	public void MoveAbove() {
		// TODO Auto-generated method stub
		row -= 1;
		if (row == -1)
		{
			row =7;
		}
	}
	
	
}
