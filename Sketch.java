/**
 * A simple program to draw a house
 * @author: A. Ng
 * 
 */
import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 300);
  }
    
  public void draw() {
	
    // foreground
    fill(90, 140, 90);
    rect(0, 300, 400, 100);

    // house
    fill(200, 170, 150);
    rect(100, 250, 200, 300);
    stroke(255);
    line(200, 150, 300, 250);
    stroke(255);
    line(200, 150, 100, 250);
    fill(220, 170, 150);
    triangle(200, 150, 300, 250, 100, 250);
  
    // sun
    fill(300, 400, 200);
    ellipse(380, 20, 60, 60);
    stroke(225);
    line(340, 15, 320, 12);
    line(338, 30, 315, 35);
    line(340, 45, 320, 57);
    line(355, 53, 350, 70);
    line(375, 60, 380, 80);

    // door
    fill(220, 170, 150);
    rect(200, 300, 50, 100);
    fill(200, 170, 150);
    ellipse(240, 350, 7, 7);

    // cloud
    fill(255);
    ellipse(100, 50, 20, 20);
    ellipse(115, 40, 20, 20);
    ellipse(112, 60, 20, 20);
    ellipse(125, 45, 20, 20);
    ellipse(125, 65, 20, 20);
    ellipse(140, 42, 20, 20);
    ellipse(140, 62, 20, 20);
    ellipse(155, 48, 20, 20);
    ellipse(155, 68, 20, 20);
    ellipse(165, 60, 20, 20);
  }
  
}
