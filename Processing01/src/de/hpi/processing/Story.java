package de.hpi.processing;

import java.util.Arrays;

import processing.core.PApplet;

public class Story extends PApplet {
	//	An array of stripes
	  Stripe[] stripes = new Stripe[50];
	
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
		//this.frameRate(5);
		this.rectMode(CORNER);
		System.out.println(this.frameRate);
		// Initialize all "stripes"
	    for (int i = 0; i < stripes.length; i++) {
	      stripes[i] = new Stripe(this);
	    }
		
		
	}
	 

	@Override
	public void draw(){
		//this.ellipse(100, 100, second(), second());
		this.strokeWeight(3);
		this.stroke(0,0,0);
		this.fill(100,30,200);
		this.rect(50, 50, 100, 200);
		
		this.fill(255,30,200);
		this.stroke(0,200,0);
		this.ellipse(400, 400, 200, 200);
		
		//System.out.println(this.frameRate);
		//background(100);
	    // Move and display all "stripes"
	    for (int i = 0; i < stripes.length; i++) {
	      stripes[i].move();
	      stripes[i].display();
	    }		
		
	}
	
	@Override
	public void mouseClicked(){
		System.out.println("mouse clicked");
	}
	
	public void keyPressed(){
		System.out.println("key pressed: " + this.key + " " + this.keyCode);
		
	}
	
    /*
	public Story() {
		super();
		// TODO Auto-generated constructor stub
	}
	*/
	
	

}
