for (int i = 0; i < 5; i++){
	for (int j = 0; j < 5; j++){
		System.out.println(i + "," + j);
	}
}

for (int i = 0; i < 5; i++){
	for (int j = 0; j < i; j++){
		System.out.println(i + "," + j);
	}
}

for (int i = 0; i < 5; i++){
	for (int j = i; j < 5; j++){
		System.out.println(i + "," + j);
	}
}