size(800, 400);

int noseX = 400;
int noseY = 200;
int noseSize = 15;
circle(noseX, noseY, noseSize);

int faceHeight = 100;
int faceWidth = 200;

int faceX = noseX - faceWidth / 2;
int faceY = noseY - faceHeight / 2;
noFill();
rect(faceX, faceY, faceWidth, faceHeight);

int antHeight = faceHeight / 3;
int antWidth = faceWidth / 10;
int antX = noseX - antWidth/2;
int antY = noseY - faceHeight /2 - antHeight;
rect(antX, antY, antWidth, antHeight);

//doodleSize = noseSize
int doodleX = noseX;
int doodleY = antY - noseSize/2;
circle(doodleX, doodleY, noseSize);
