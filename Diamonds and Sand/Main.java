package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		Stack<Character> diamons;

		int totCases = Integer.parseInt(in.readLine());

		for (int i = 0; i < totCases; i++) {
			diamons = new Stack<Character>();
			String tcase = in.readLine();
			int totDi = 0;
			tcase = tcase.replace(".", "");
			for (int j = 0; j < tcase.length(); j++) {
				char item = tcase.charAt(j);
				if ('<' == item) {
					
					diamons.push(item);
				} else {
					if (!diamons.isEmpty()) {
						totDi += 1;
						diamons.pop();
					}
				}
			}
			System.out.println(totDi);

		}

	}
}
