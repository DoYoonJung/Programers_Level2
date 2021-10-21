package Progamers_Level_2;

import java.util.Arrays;
import java.util.Comparator;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] files = { new Student(1, 10), new Student(5, 15), new Student(3, 13), new Student(2, 12),
				new Student(6, 16), new Student(10, 20), new Student(9, 19) };
		Student[] files2 = files.clone();
		Student[] files3 = files.clone();
		Student[] files4 = files.clone();

		Arrays.sort(files, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.age - o2.age;
			}

		});

		for (int i = 0; i < files.length; i++) {
			System.out.print(files[i].age + " ");
		}
		System.out.println();

		Arrays.sort(files, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.age - o1.age;
			}

		});

		for (int i = 0; i < files.length; i++) {
			System.out.print(files[i].age + " ");
		}
		System.out.println();

	}
}

class Student {
	int age;
	int number;

	Student(int age, int number) {
		this.age = age;
		this.number = number;
	}
}
