package step8_28.HashMapEx;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		
		//HashMap은 Key에 Value를 할당하는 방식
		//Key는 String, Value는 HashMap에 저장할 데이터 타입을 사용
		
		HashMap<String, Integer> hmap = new HashMap<>();
		
		//(key, value) : HashMap의 Key에 Value를 할당
		hmap.put("apple", 1000);
		hmap.put("orange", 1500);
		hmap.put("melon", 5000);
		hmap.put("water melon", 15000);
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("================");
		
		//get(key) : HashMap의 key에 할당된 value 리턴
		System.out.println(hmap.get("melon"));
		System.out.println("================");
		
		//put() 메소드는 존재하지 않는 key에 넣어주면 데이터 입력, 존재하는 key에 넣어주면 수정
		hmap.put("apple", 1234);
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("================");
		
		//keySet() : HashMap의 key만 얻어옴
		System.out.println(hmap.keySet());
		System.out.println("================");
		
		/*
		 * 항샹된 for문
		 * for (변수타입 변수이름 : 배열이름) { 실행문; }
		 */
		
		//향상 for와 keySet()메소드를 사용하여 HashMap에 저장된 모든 데이터를 얻어올 수 있음
		int sum = 0;
		for (String key : hmap.keySet()) {
			System.out.println(hmap.get(key));
			sum += hmap.get(key);
		}
		System.out.println("금액 합계 : " + sum);
		System.out.println("================");
		
		//remove(key) : HashMap의 key에 해당하는 값을 제거
		hmap.remove("apple");
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("================");
		
		//clear() : HashMap의 모든 값을 제거
		hmap.clear();
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("================");
		
	}
}
