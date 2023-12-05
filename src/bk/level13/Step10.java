package bk.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문제번호 10814 : 나이순 정렬


public class Step10 {
	static class User implements Comparable<User>{
		String name;
		int age;
		
		public User(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public int compareTo(User o) {
			return this.age - o.getAge();
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<User> users = new ArrayList<User>();
		
		for(int i = 0; i < N; i++) {
			String[] inputStr = br.readLine().split(" ");
			users.add(new User(inputStr[1], Integer.parseInt(inputStr[0])));
		}
		
		Collections.sort(users);
		
		users.stream().forEach(x -> {
			System.out.println(x.getAge() + " " + x.getName());
		});
	}
}
