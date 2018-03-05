package acslprob3;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Walk {
	
	public static void main(String[] args) {
		 String current = Paths.get(".").toAbsolutePath().normalize().toString();
		Path filePath = new File(current + "\\c_3_int_sample.txt").toPath();   
		java.util.List<String> stringList = null;
		try {
			stringList = Files.readAllLines(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] a = new String[6];
				stringList.toArray(a);
		
		String inputData = GetBoardString(a);
		Board b = new Board(inputData);
	
		for (int i = 1; i < a.length; i++) {
			String inputRules = GetRulesString(i,a);
			
			GameRules gr = new GameRules(inputRules);
			//		gr.getPathBoard().PrintBoard();
			
			for (int i1 = 0; i1 < gr.getNumberOfMoves() ; i1++) {
				gr.Move(b);
				}
			
			
			gr.getLoc().PrintLocation();
		}
	}

	private static String GetRulesString(int i, String[] lines) {
		// TODO Auto-generated method stub
		return lines[i];
	}


	private static String GetBoardString(String[] lines) {
		// TODO Auto-generated method stub
		String strBoard = lines[0];
		
		return strBoard;
	}
}
