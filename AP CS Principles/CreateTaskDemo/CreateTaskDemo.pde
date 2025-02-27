import javax.swing.JOptionPane;

void setup(){
   IntList list = new IntList();
   list.append(90);
   list.append(80);
   list.append(95);
   list.append(92);
   list.append(74);
   list.append(97);
   int threshold = int (JOptionPane.showInputDialog("What is your threshold?"));
   int count = numStudents(list, threshold);
   float percent = float(count) / list.size() * 100;
   println("The percentage of students above " + threshold + " is " + percent + "%");
}

int numStudents(IntList list, int threshold){
  int count = 0;
   for (int i = 0; i < list.size(); i++){
      if (list.get(i) > threshold){
         count++; 
      }
   }
  return count;
}
