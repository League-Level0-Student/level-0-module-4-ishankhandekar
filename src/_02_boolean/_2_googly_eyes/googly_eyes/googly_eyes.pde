  PImage face;
void setup() {

  face = loadImage ("bigeyes.jpg");
  size(800,600);
  face.resize(800,600);
 
  image(face, 0, 0);
}

void draw() {
  image(face, 0, 0);
   int X = (mouseX);
  int Y = (mouseY);
    println(mouseX,mouseY);
    noStroke();
    fill(#FFFFFF);
ellipse(447,343,100,130);
ellipse(207, 351, 100, 130);
fill(#050505);
if( X >= 172 && X <= 244 && Y >= 305 && Y <= 391 ){
  X = mouseX;
  Y = mouseY;
}else{ X = 202;
  Y = 346;}
  ellipse(X, Y, 50, 50);
  ellipse(X + 250, Y, 50, 50);

}
