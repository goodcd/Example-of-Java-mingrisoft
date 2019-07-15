package c17_1;

interface Constants {										//�����������ڽӿ���
	public static final int Constants_A = 1;
	public static final int Constants_B = 12;
}

enum Constants2 {											//������������ö��������
	Constants_A, Constants_B
}

public class ConstantsTest {
	public static void doit(int c) {						//����һ������������Ĳ���Ϊint��
		switch(c) {											//���ݳ�����ֵ����ͬ����
		case Constants.Constants_A:
			System.out.println("doit() Constants_A");
			break;
		case Constants.Constants_B:
			System.out.println("doit() Constants_B");
			break;
		}
	}
	
	public static void doit2(Constants2 c) {				//����һ����������ʱö�����͵ķ���
		switch(c) {											//����ö�����Ͷ�������ͬ����
		case Constants_A:
			System.out.println("doit2() Constants_A");
			break;
		case Constants_B:
			System.out.println("doit2() Constants_B");
			break;
		}
	}
	
	public static void main(String[] args) {
		ConstantsTest.doit(Constants.Constants_A);			//ʹ�ýӿ��ж���ĳ���
		ConstantsTest.doit2(Constants2.Constants_A);		//ʹ��ö�������еĳ���
		ConstantsTest.doit2(Constants2.Constants_B);		//ʹ��ö�������еĳ���
		ConstantsTest.doit(3);
		//ConstantsTest.doit2(3);
	}

}