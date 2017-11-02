package com.ThisKeyword.task;

 public class UsingThis {

static 	int rollno;
static 	String name;
static	float fee;
	 
UsingThis(int rollno,String name,float fee){
	
	this.rollno =rollno;
	this.name = name;
	this.fee =fee;
}	

	 public void display(){
		 System.out.println(rollno+""+name+""+fee);
		 
	 }
	
	 	
	public static void main(String[] args) {
		
		UsingThis s1 = new UsingThis(110, "ABC", 1000f);
		UsingThis s2 = new UsingThis(111, "XYZ", 2000f);
		s1.display();
		s2.display();

	}

}
