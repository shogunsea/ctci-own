public static int countFactZerosOwn(int num) {
		int sum = 0;
		for(int i = 1; i<=num; i++){
			int temp = 0;
			int j = i;
			while(j%5==0){
				temp++;
				j/=5;
			}
			sum+=temp;
		}
		return sum;
	}