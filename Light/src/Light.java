/*
 * Term 2 - Assignment 2, Part 1: Light
 * A class which represents a single light bulb.
 */

public class Light
{
 // Variables that will be initialized in the Light constructors.
 private boolean on;
 public boolean burntOut;
 private String color = "";

 // Default constructor that sets the bulb to on, not burnt out, and "white".
 public Light()
 {
  this(true, false, "white");
 }

 // This constructor sets the variable "on" to the parameter o. The burntOut
 // variable is set to the parameter b. If burntOut
 // is true, on is set to false, no matter what value is stored in o.
 // The color variable is set to the parameter c only if c is "red", "green"
 // or "blue". The constructor ignores the case of the value in c. If c holds
 // any value other than "red", "green" or "blue", the constructor sets
 // color to "white".
 public Light(boolean onInput, boolean burntInput, String colorInput)
 {
  String lowerColor = colorInput.toLowerCase();
  on = onInput;
  burntOut = burntInput;
  if(burntOut == true)
    on = false;
  if(lowerColor.equals("red") || lowerColor.equals("green") || lowerColor.equals("blue"))
    color = lowerColor;
  else
    color = "white";
 }

 // The toString method returns a String with the Light in the format:
 // off red    burnt out
 // on green    not burnt out
 //
 // Notice there is one space between "off"/"on" and the value for color,
 // and a tab before the "burnt out" or "not burnt out".
 public String toString()
 {
   String onStatus = "";
   String burntStatus = "";
   
   if(on == true)
     onStatus = "on";
   else
     onStatus = "off";
   if(burntOut == true)
     burntStatus = "burnt out";
   else
     burntStatus = "not burnt out";
   
    return (onStatus + " " + color + "\t" + burntStatus);
 }

 // This method changes the bulb from on to off, or visa versa. If the
 // burntOut variable is true, then the on variable may only be set to false.
 public void flip()
 {
   if(burntOut == false)
   {
    if(on == true)
      on = false;
    else if(on == false)
      on = true;
   }
   
   else if(burntOut == true)
   {
     if(on == true)
       on = false;
     else
       on = false;
   }
 }

 // The getColor method returns the color of the bulb.
 public String getColor()
 {
  return color;
 }

 // The setColor method sets the color of the Light. The color variable is
 // set to c only if c is "red", "green" or "blue". The method ignore the
 // case of the value in c. If c holds any value other than "red", "green"
 // or "blue", color will be set to "white".
 public void setColor(String colorInput)
 {
   String lowerColor = colorInput.toLowerCase();
   if(lowerColor.equals("red") || lowerColor.equals("blue") || lowerColor.equals("green"))
    color = lowerColor;
   else
     color = "white";
 }

 // The isOn method returns true if on, false otherwise.
 public boolean isOn()
 {
  if(on == true)
    return true;
  else
    return false;
 }

 // The burnOut method sets the variable burntOut to true.
 public void burnOut()
 {
  burntOut = true;
  on = false;
 }


}
