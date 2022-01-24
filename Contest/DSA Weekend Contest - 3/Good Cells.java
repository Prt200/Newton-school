 Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[][] = new int[N][M];
		for(int i = 0;i<N;i++){
			for(int j = 0;j<M;j++){
				a[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for(int i = 1;i<N-1;i++){
			for(int j = 1;j<M-1;j++){
				if(a[i-1][j] == 1 && a[i+1][j] == 1 && a[i][j-1] == 1 && a[i][j+1] == 1)count++;
			}
		}
		System.out.println(count);
