double subTotal = Math.random() * (20 - 40) + 40;
double tipPercentage = 0.22;

double tipAmount = subTotal * tipPercentage

double total = subTotal + tipAmount;

System.out.println("Subtotal" + subTotal);
System.out.println("Tip: " + tipAmount);
System.out.println("Final Total" + total);