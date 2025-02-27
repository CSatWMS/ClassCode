int x = 0;
int y = 0;
int dx = 5;
int dy = 5;
void setup(){
   size(400, 400);
   int diam = 200;
   circle(width / 2, height / 2, diam);
   line(width / 2, height / 2 - diam/2, width/2, height/2 + diam/2);
   line(width / 2 - diam/2, height / 2, width/2 + diam/2, height/2);
}

//position (x, y)
//change in position (dx, dy)

void draw(){
  background(0);
  rect(x, y, 20, 20);
  x = x + dx;
  y = y + dy;
}
