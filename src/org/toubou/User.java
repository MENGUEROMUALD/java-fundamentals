package org.toubou;

public class User {
		String name;
		int age;
		float height;
		String gender;
		public User() {
			this.name="CAUCHY";
			this.age=36;
			this.height=1.71F;
			this.gender="Male";
		}
		public User(String name,int age,float height,String gender) {
			this.name=name;
			this.age=age;
			this.height=height;
			this.gender=gender;
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
		public float getHeight() {
			return height;
		}
		public void setHeight(float height) {
			this.height = height;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
}
