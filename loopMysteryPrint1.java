// print christmas tree

for(int i = 1; i <= 10; i++){
	for(int j = 1; j <= 10 - i; j++){
		print(" ");
	}
	for(int j = 1; j <= 2 * i - 1; j++){
		print("*");
	}
	println();
