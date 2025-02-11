int x = 0;
int y = 300;
int size = 50;
int speed = 5;

void setup(){
   size(400, 600); 
}

void draw(){
    background(0);
    circle(x, y, size);
    x = x + speed;
}
