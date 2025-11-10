
for (int i = 0; i < 4; i++){
	println(i);
}

















for (int i = 0; i < 3; i++){
	for (int k = 0; k < 3; k++){
		println(i + "," + k);
	}
}














for (int i = 0; i < 4; i++){
	for (int k = 0; k < i; k++){
		println(i + "," + k);
	}
}














for (int i = 0; i < 3; i++){
	for (int k = i; k < 3; k++){
		println(i + "," + k);
	}
}












// If you can only print one '*' at a time, 
// how do you make this shape?
//  *****


print("*");


A (Wrong - 6): for (int i = 0; i <= 5; i++){ print("*"); }
B: for (int i = 0; i < 5; i++){ print("*"); }
C: for (int i = 1; i <= 5; i++){ print("*"); }
D (Wrong - 4): for (int i = 1; i < 5; i++){ print("*"); }
E: for (int i = 5; i > 0; i--){ print("*"); }
F (Wrong - 6): for (int i = 5; i >= 0; i--){ print("*"); }

Ranked answer preference
B 
E 
C - least favorite





/*
Can you make these shapes?
*****
*****
*****
*****
*****
-------
*
**
***
****
*****
-------
*****
****
***
**
*
-------
*?*?*
?*?*?
*?*?*
?*?*?
*?*?*
-------
*/
