double subTotal = Math.random() * (50 - 20) + 20;
int tipPercentage = 22;

double tipAmount = subTotal * (tipPercentage / 100.0);

double total = subTotal + tipAmount;

System.out.println("Subtotal: " + subTotal);
System.out.println("Tip: " + tipAmount);
System.out.println("Final Total: " + total);