package read_note;

import java.util.HashMap;

public class ReadHashMap {
	public static void main(String[] args) {
		HashMap bookMap = new HashMap();
		
		//测试double
		bookMap.put("JavaBook",20.0);
		System.out.println(bookMap.get("JavaBook"));
		
		//测试int
		bookMap.put("EnglishBook",10);
		System.out.println(bookMap.get("EnglishBook"));
		
		//测试String
		bookMap.put("PM-Book","No goods");
		System.out.println(bookMap.get("PM-Book"));
		
		//查看System.out.println(); 两次加锁
		System.out.println("");
		
		
	}
}
