package my_own_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		/*ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		for(int i = 1; i < numbers.size(); i++) {
			if(i % 2 == 0) {
				System.out.println(numbers.get(i)+" Number is Even");
			}else {
				System.out.println(numbers.get(i) + " Number is Odd");
			}
		}*/
		
		
		/*
		System.out.println(" Enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			int res = num * i;
			System.out.println(num + " X " + i +  " = " + res);
		}*/
		
		int a = 15, b = 30, c = 65;
		
		if(a > b && a > c ) {
			System.out.println(a + " is Largest number");
		} else if(b > a && b > c ) {
			System.out.println(b + " is Largest number");
		}else {
			System.out.println(c + " is Largest number");
		}

	}

}
