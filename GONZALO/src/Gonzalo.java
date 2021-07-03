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

public class Gonzalo extends PApplet {
  public void setup() {


// DIBUJANDO LA "G"
line(5,5,105,5);
line(5,5,5,100);
line(105,5,105,20);
line(105,20,30,20);
line(105,100,105,50);
line(105,50,50,50);
line(50,50,50,70);
line(50,70,80,70);
line(80,70,80,90);
line(80,90,30,90);
line(30,90,30,20);
line(5,100,105,100);


// DIBUJANDO LA "O"
line(115,5,215,5);
line(115,5,115,100);
line(115,100,215,100);
line(215,5,215,100);
line(145,30,185,30);
line(185,30,185,70);
line(185,70,145,70);
line(145,70,145,30);


// DIBUJANDO LA "N"
line(225,5,225,100);
line(225,5,255,5);
line(255,5,305,60);
line(305,60,305,5);
line(305,5,325,5);
line(225,100,245,100);
line(245,100,245,40);
line(245,40,295,100);
line(325,5,325,100);
line(325,100,295,100);


// DIBUJANDO LA "Z"
line(335,5,435,5);
line(335,5,335,25);
line(335,25,395,25);
line(395,25,335,70);
line(335,70,335,100);
line(335,100,435,100);
line(435,100,435,80);
line(435,80,385,80);
line(435,5,435,35);
line(435,35,385,80);


// DIBUJANDO LA "A"
line(445,5,545,5);
line(445,5,445,100);
line(545,5,545,100);
line(445,100,475,100);
line(475,100,475,70);
line(545,100,515,100);
line(515,100,515,70);
line(515,70,475,70);
line(515,20,475,20);
line(515,20,515,50);
line(515,50,475,50);
line(475,50,475,20);


// DIBUJANDO LA "L"
line(555,5,555,100);
line(555,100,655,100);
line(555,5,585,5);
line(585,5,585,70);
line(585,70,655,70);
line(655,70,655,100);


// DIBUJANDO LA "O"
line(665,5,765,5);
line(665,5,665,100);
line(665,100,765,100);
line(765,5,765,100);
line(695,30,735,30);
line(695,30,695,70);
line(695,70,735,70);
line(735,30,735,70);


    noLoop();
  }

  public void settings() { 
size(800,200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Gonzalo" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
