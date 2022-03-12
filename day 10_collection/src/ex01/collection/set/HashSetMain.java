
package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person{
	String name;
	int age;
	
	public Person(String name, 	int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + " hashCode = " + this.hashCode() +"]\n";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Person) {
			Person temp = (Person)obj;
			
			return name.equals(temp.name) && age == temp.age;
		}
		
		return false;
		
	}
	// 2022-02-09
	// 같은 문자열은 같은 주소값을 가진다.
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}	
	
}	// Person end

public class HashSetMain {
	public static void main(String[] args) {
		Set set  = new HashSet();
		
		set.add(new Person("SeongRok", 26));
		set.add(new Person("David", 33));
		set.add(new Person("David", 33));
		set.add(new Person("David", 33));
		set.add(new Person("David", 42));
		set.add(new Person("David", 76));
		set.add(new Person("David", 10));	// 사용자가 만든 클래스라 구분을 해줘야 중복을 걸러내줌
		
		set.add(new String("happy"));	//maker측이 제공하는 클래스라 구분을 함
		set.add(new String("happy"));

		
		System.out.println(set.toString());
	} 
	
}
