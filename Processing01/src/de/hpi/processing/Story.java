package de.hpi.processing;

import java.util.Arrays;

public class Story {
	
	public static void main (String[] args){
		if(args.length > 0){
			int i = 0;
			for (String s : Arrays.asList(args)){
				System.out.println("Argument " + i + ": "+ s);
				i++;
			}
		}
		
		System.out.println("Swing, AWT, WindowBuilder, Processing");
		
		
	}

	public Story() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
