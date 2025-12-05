import javax.swing.JOptionPane;
String secretWord = "";
String guess = "";

int IDblack = 0;
int IDwhite = 1;
int IDred = 2;
int IDgreen = 3;
int IDblue = 4;
int IDmagenta = 5;
int IDcyan = 6;
int IDyellow = 7;

int size = 4;

color hotPink = color(255, 10, 10);

int fullStrength = 255;

int guessLeftX = 425;
int guessBottomY = 75;
int guessBoxSize = 75;

int controlPanelWidth = 75;

void setup(){
  size(500, 500);
  reset();
  
}

void draw(){
  if (mousePressed){
    if (mouseX < guessLeftX && mouseY > guessBottomY && secretWord.length() != 0){
     fill(fullStrength, 0, 0);
     circle(mouseX, mouseY, size); 
    } else if (secretWord.length() > 0){
       guess(); 
    }
  }
}


//showMessageDialog
void guess(){
  guess = JOptionPane.showInputDialog("What is your guess?");
  if (guess.equals(secretWord)){
    
     background(0, fullStrength, 0);
     text("YOU GOT IT!\nPress 'r' to restart", width / 2, height / 2);
     secretWord = "";
  }
}

void reset(){
  secretWord = JOptionPane.showInputDialog("Player 1, secretly type your word to draw");
   background(0);
   fill(fullStrength);
   rect(guessLeftX, 0, guessBoxSize, guessBoxSize);
   drawControlPanel();
}

//black
//white
//red
//green
//blue
//magenta
//cyan
//yellow

color getColor(int number){
   if (number == IDblack){
      return color(0, 0, 0); 
   } else if (number == IDwhite){
      return color(fullStrength, fullStrength, fullStrength); 
   }else if (number == IDred){
      return color(fullStrength, 0, 0); 
   }else if (number == IDgreen){
      return color(0, fullStrength, 0); 
   }else if (number == IDblue){
      return color(0, 0, fullStrength); 
   }else if (number == IDmagenta){
      return color(fullStrength, 0, fullStrength); 
   }else if (number == IDcyan){
      return color(0, fullStrength, fullStrength); 
   }else if (number == IDyellow){
      return color(fullStrength, fullStrength, 0); 
   } else {
      return color(0, 0, 0); 
   }
}

void drawControlPanel(){
   rect(0, 0, controlPanelWidth, height); 
   int circleDiam = 50;
   int gap = controlPanelWidth - circleDiam;
   int colorNumber = 0;
   for (int y = circleDiam / 2 + gap / 2; y < height; y += circleDiam + (gap / 2 - 1)){
     fill(getColor(colorNumber));
     circle(circleDiam / 2 + gap / 2, y, circleDiam);
     colorNumber++;
   }
}

void keyPressed(){
   if (secretWord.length() == 0){
       if (key == 'r'){
          reset(); 
       }
   }  
}

void mousePressed(){
   if (mouseX < controlPanelWidth){
     
   }
}
