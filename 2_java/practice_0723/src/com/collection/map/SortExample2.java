package com.collection.map;

import java.util.Comparator;
import java.util.TreeSet;

public class SortExample2 {
	public static void main(String[] args) {
		
		// 비교자(Comparator) 생성
		Comparator<Book2> yearComparator = new Comparator<Book2>() {
			
			@Override
			public int compare(Book2 o1, Book2 o2) {
				// 연도순 정렬
//				Integer o1year = o1.getYear();
//				Integer o2year = o2.getYear();
//				return Integer.compare(o1year, o2year);
				return o1.getYear() - o2.getYear();
			}
		};
		
		TreeSet<Book2> bookSet = new TreeSet<>(yearComparator); // 정렬하는 기준점( )을 yearComparator로 설정
		
		// 정렬을 해줘야 입력됨
		bookSet.add(new Book2("개를 훔치는 완벽한 방법", "B1", 2002));
		bookSet.add(new Book2("수상한 장미마을", "B2", 2000));
		bookSet.add(new Book2("위대한 개츠비", "B3", 1980));
		bookSet.add(new Book2("언어의 온도", "B4", 2015));
		bookSet.add(new Book2("아몬드", "B5", 2006));

	
		System.out.println(bookSet);
		

	}
}
