package �Ϸ��ϳ�;

import java.util.Scanner;

public class ����_2018�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		
		for(int i=1;i<=n;i++) {
			int tmp =0;
			for(int k=i;k<=n;k++) {
				tmp+=k;
				if(tmp>n)
					break;
				else if(tmp==n) {
					sum++;
					break;
				}
			}
		}
		System.out.println(sum);
	}
}
