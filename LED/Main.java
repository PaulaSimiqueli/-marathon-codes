package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
		 

		// LEDS
		int[] leds = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		int totCases = Integer.parseInt(in.readLine());

		for (int i = 0; i < totCases; i	++) {
			String value = in.readLine();
			int totLed = 0;
			for (int j = 0; j < value.length(); j++) {
				
				String character = String.valueOf(value.charAt(j));
				totLed += leds[Integer.valueOf(character)];
				
				
			}
			System.out.println(totLed + " leds");
			
		}
	}
}
