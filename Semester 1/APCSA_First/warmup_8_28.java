int a = 3; // 3

double b = 3; //3.0 (promotion)

int b2 = 3.0; //ERRORS

int b3 = (int) 3.0; //3 because of casting -> forces truncation

double c = 7.0 / 2; // 3.5

int d = 7 / 2; // 3 because integer division

double e = 7 / 2; // 3.0 

double f = (double) 7 / 2; // 3.5

double g = (double) (7 / 2); // 3.0

