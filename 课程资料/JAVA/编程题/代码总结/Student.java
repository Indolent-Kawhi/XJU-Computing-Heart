public class Student implements Comparable<Student>{

	private int no;
	private String name;
	private int age;

	public Student(){
	
	}

	public Student(int no,String name,int age){
		this.no = no;
		this.name = name;
		this.age = age;
	}

	public void setNo(int no){
		this.no = no;
	}


	public int getNo(){
		return no;
	}

		
	public String toString(){
		return "Student [no=" + no +", school=" +school +"]";
		
	}
	

	public int compareTo(Student o){ //升序
		return this.getNo() - o.getNo();
	}

	public boolean equals(Object obj){

		if(obj == null|| !(obj instanceof Student){
			return false;
		}
		if(this == obj){
			return true;
		}

		Student s = (Student)obj;
		return this.no == obj.no;
	
	}

	public int compareTo(Customer c) { //TreeSet必须要实现compareTo
        return this.age - c.age;//升序
        
    }




}

