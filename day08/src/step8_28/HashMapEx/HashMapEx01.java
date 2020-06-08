package step8_28.HashMapEx;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		
		//HashMap�� Key�� Value�� �Ҵ��ϴ� ���
		//Key�� String, Value�� HashMap�� ������ ������ Ÿ���� ���
		
		HashMap<String, Integer> hmap = new HashMap<>();
		
		//(key, value) : HashMap�� Key�� Value�� �Ҵ�
		hmap.put("apple", 1000);
		hmap.put("orange", 1500);
		hmap.put("melon", 5000);
		hmap.put("water melon", 15000);
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("================");
		
		//get(key) : HashMap�� key�� �Ҵ�� value ����
		System.out.println(hmap.get("melon"));
		System.out.println("================");
		
		//put() �޼ҵ�� �������� �ʴ� key�� �־��ָ� ������ �Է�, �����ϴ� key�� �־��ָ� ����
		hmap.put("apple", 1234);
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("================");
		
		//keySet() : HashMap�� key�� ����
		System.out.println(hmap.keySet());
		System.out.println("================");
		
		/*
		 * �׼��� for��
		 * for (����Ÿ�� �����̸� : �迭�̸�) { ���๮; }
		 */
		
		//��� for�� keySet()�޼ҵ带 ����Ͽ� HashMap�� ����� ��� �����͸� ���� �� ����
		int sum = 0;
		for (String key : hmap.keySet()) {
			System.out.println(hmap.get(key));
			sum += hmap.get(key);
		}
		System.out.println("�ݾ� �հ� : " + sum);
		System.out.println("================");
		
		//remove(key) : HashMap�� key�� �ش��ϴ� ���� ����
		hmap.remove("apple");
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("================");
		
		//clear() : HashMap�� ��� ���� ����
		hmap.clear();
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("================");
		
	}
}
