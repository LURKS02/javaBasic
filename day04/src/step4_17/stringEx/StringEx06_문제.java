package step4_17.stringEx;

public class StringEx06_���� {

	public static void main(String[] args) {
		
		String jumin = "890101-2012932";
		
		// ���� ���
		int age = Integer.parseInt(jumin.substring(0,2));
		age = 100 - age + 21;
		System.out.println(age);
	
		// ���� ���
		int gender = jumin.charAt(7);
		if (gender == '1') System.out.println("����");
		else if (gender == '2') System.out.println("����");
	}
}
