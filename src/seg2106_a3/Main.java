package seg2106_a3;

//Oct.6, 1998   By Gregor v. Bochmann & Yaoping Wang
import java.io.*;
import java.util.*;

public class Main {
	private static Syner syn;
	private static String inputFile;
	public static void main (String args[]) throws IOException, EndOfFileEncountered{
		if(args.length != 1) {
			System.out.println("default input is from file exampleInput.txt");
			inputFile = "exampleInput.txt";} else {inputFile = args[0];}
		syn = new Syner(inputFile);
		syn.startAnalysis();
	}
}