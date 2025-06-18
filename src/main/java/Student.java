public class Student {
    private String name;
    private int age;
    private String studentNumber;

    public Student (String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

     public String getName (){
        return this.name;
    }

    public int getAge (){
        return this.age;
    }

    public String getStudentNumber(){
        return this.studentNumber;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }

    @Override
	public boolean equals(Object obj) { 
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Student Student = (Student)obj;
		if (Student.getStudentNumber().equals(this.studentNumber)) {
			return true;
		}
		return false;
	}

}