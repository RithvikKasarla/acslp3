package acslprob3;


public class Board 
{
	int[][] aboard;
	Location curlocation;
	
	public void PrintBoard() {
		for (int i = 0; i < aboard.length; i++) {
			for (int j = 0; j < aboard[i].length; j++) {
				System.out.print(aboard[i][j]);
			}
			System.out.println("");
		}
		System.out.println(aboard);
	}
	
	public Board(String line) 
	{
		aboard = createBoard(line);
		curlocation = new Location(0,0);
	}
	
	
	private String hexToBinary(String hex) {
	    int i = Integer.parseInt(hex, 16);
	    String bin = Integer.toBinaryString(i);
	    return bin;
	}
	
	private int[][] createBoard(String lines) 
	{
		aboard = new int[8][8];
		String[] result = lines.split("\\s+");
				
		for (int i = 0; i < result.length; i++) {
			String Strz = hexToBinary(result[i]);
			while (Strz.length() != 8)
			{
				Strz = "0" + Strz;
			}
			for (int j = 0; j < Strz.length(); j++) {
				aboard[i][j] = Integer.parseInt(Strz.substring(j, j+1));
			}
		}
		
		return aboard;
	}
	
	public int getVal(Location loc) {
		// TODO Auto-generated method stub
		return aboard[loc.row][loc.col];
	}

	public void setVal(int i, Location loc) {
		// TODO Auto-generated method stub
		aboard[loc.row][loc.col] = i;
	}


}
