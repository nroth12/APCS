/*
 * Term 2 - Assignment 2, Part 2: Strand
 * A class which represents a strand of lights.
 */

import java.util.ArrayList;

public class Strand
{
 // An ArrayList that stores a strand of lights
 private ArrayList<Light> strand = new ArrayList<Light>();

 // Default constructor that sets strand to an ArrayList holding one
 // turned on white bulb, that is not burnt out.
 public Strand()
 {
  Light l = new Light();
  strand.add(l);
 }

 // A constructor that sets strand to an ArrayList of size n, holding
 // n white bulbs, that are all turned on and not burnt out. If n <= 0,
 // then the strand should be set to size one, with a white bulb, on
 // and not burnt out.
 public Strand(int n)

 {
   if(n>0){
     for(int i=0; i<n; i++){
       Light light1 = new Light();
       strand.add(light1);
     } 
   }
     else{
       Light light1 = new Light();
       strand.add(light1);
     }
 }

 // This method returns a String representation of the
 // Light objects in the ArrayList, one per line. For example,
 // here is the String returned when toString is called on a
 // Strand with 5 lights:
 //
 // on green    not burnt out
 // off red    not burnt out
 // off green    burnt out
 // on blue    not burnt out
 // on red    not burnt out
 //
 // Note: there is one space between "off"/"on" and the value for
 // color, and a tab before the "burnt out" or "not burnt out".
 public String toString()
 {
   String whole = "";
   
   for(int i=0; i<strand.size(); i++)
	   whole = whole + (strand.get(i) + "\n");
   
   return whole;
 }

 // This method sets the color of all the light bulbs in the entire Strand.
 public void setColor(String c)
 {
   String color = c.toLowerCase();
     for(Light e: strand)
     {
       if(color.equals("red") || color.equals("green") || color.equals("blue")){
    	 //System.out.println("Success");
         e.setColor(color);
       } else 
       {
         e.setColor("white");
     }
   }
 }

 // This method sets the light bulbs to the pattern "red", "green", "blue",
 // "red", "green", "blue",... until the end of the strand.
 public void setMulti()
 {
	 int strandCounter = 0;
 
   for(Light light: strand) 
   {
	   if(strandCounter % 3 == 0)
	   {
		   light.setColor("red");
		   strandCounter++;
	   }
	   else if(strandCounter % 3 == 1)
	   {
		   light.setColor("green");
		   strandCounter++;
	   }
	   else
	   {
		   light.setColor("blue");
		   strandCounter++;
	   }
   }
 }

 // This method turns on all the lights in the strand. Each individual bulb
 // can only be turned on if it's burntOut variable is false.
 public void turnOn()
 {
  for(Light light: strand)
  {
	  if(light.isOn() == false)
		  light.flip(); 
  }
 }

 // This method turns off all the lights in the strand.
 public void turnOff()
 {
	 for(Light light: strand)
	 {
		 if(light.isOn() == true)
			 light.flip();
	 }
 }

 // This method sets the Light at location i’s burntOut variable to true.
 public void burnOut(int i)
 {
	 strand.get(i).burnOut();
 }
 
 
}

