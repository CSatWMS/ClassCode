double subTotal = Math.random() * (40 - 20) + 20;
double tipPercentage = 0.22;

double tipAmount = subTotal * tipPercentage;

double total = subTotal + tipAmount;

System.out.println("Subtotal" + subTotal);
System.out.println("Tip: " + tipAmount);
System.out.println("Final Total" + total);