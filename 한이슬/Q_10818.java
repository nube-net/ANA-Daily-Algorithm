import java.util.*;

public class Q_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		N = sc.nextInt();
		int[] num = new int[N]; // �迭 ����
		int max, min;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt(); // ������ �Է� �� �迭�� ����
		}
		max = num[0]; // �ִ밪 �ʱ� ����
		min = num[0]; // �ּҰ� �ʱ� ����
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) { // �ִ밪 ��
				max = num[i]; // �ִ밪 �Ҵ�
			}
			if (min > num[i]) { // �ּҰ� ��
				min = num[i]; // �ִ밪 �Ҵ�
			}
		}
		System.out.printf("%d %d", min, max);
	}

}
