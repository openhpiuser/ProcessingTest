package de.hpi.processing;

import java.util.Arrays;

import processing.core.PApplet;

public class Story extends PApplet {
	
	
	public static void main (String[] args){
		
		
		if(args.length > 0){
			int i = 0;
			for (String s : Arrays.asList(args)){
				System.out.println("Argument " + i + ": "+ s);
				i++;
			}
		}
		
		System.out.println("Swing, AWT, WindowBuilder, Processing");
		
		PApplet.main("de.hpi.processing.Story");
	}
	
	@Override
    public void settings(){
        size(800,800);
    }
			
	@Override
	public void setup(){
		this.fill(100,30,200);
	}
	
	@Override
	public void draw(){
		this.ellipse(100, 100, second(), second());
		
	}
	
    /*
	public Story() {
		super();
		// TODO Auto-generated constructor stub
	}
	*/
	
	

}
