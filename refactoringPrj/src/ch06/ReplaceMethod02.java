package ch06;

import java.util.Arrays;
import java.util.List;

public class ReplaceMethod02 {

// 알고리즘을 더 분명한 것으로 교체해야할 땐, 해당 메소드의 내용을 새 알고리즘으로 바꾸자

	String foundPersonBefore(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				return "Don";
			}
			if (people[i].equals("John")) {
				return "John";
			}
			if (people[i].equals("Kent")) {
				return "Kent";
			}
		}
		return "";
	}

	String foundPersonAfter(String[] people) {
		List candidates = Arrays.asList(new String[] { "Don", "John", "Kent" });
		for (int i = 0; i < people.length; i++) {
			if (candidates.contains(people[i])) {
				return people[i];
			}
		}
		return "";
	}
	
}
