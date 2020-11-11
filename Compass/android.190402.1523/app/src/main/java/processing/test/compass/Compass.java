package processing.test.compass;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Compass extends PApplet {

CompassManager compass;
float direction;


public void setup() {
  compass = new CompassManager(this);
}


public void pause() {
  if (compass != null) compass.pause();
}


public void resume() {
  if (compass != null) compass.resume();
}


public void draw() {
  background(255);
  fill(192, 0, 0);
  noStroke();
  
  translate(width/2, height/2);
  scale(2);
  rotate(direction);
  beginShape();
  vertex(0, -50);
  vertex(-20, 60);
  vertex(0, 50);
  vertex(20, 60);
  endShape(CLOSE);
}


public void directionEvent(float newDirection) {
  direction = newDirection;
}
}
