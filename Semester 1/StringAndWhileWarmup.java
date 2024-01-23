String s = "hello";
--------------------------
int a = 0;
while (a < s.length()){
	System.out.println(s.charAt(a));
	a++;
}
--------------------------
int b = s.length() - 1;
while (b > 0){
	b--;
	System.out.println(s.charAt(b));
}
--------------------------
int c = 0;
while (c < s.length() - 1){
	System.out.println(s.substring(c, c + 2));
	c++; 
}
