 class student{
    static String schoolName = "OSVNIC";
    String name;

    public student(String name) {
        this.name = name;
    }

    static void displaySchool() {
        System.out.println("School Name: " + schoolName);
    }

    void displayStudent() {
        System.out.println("student Name: " + name);
    }

    public static void main(String[] args) {
        student.displaySchool();

        student s1 = new student("Karan");
        student s2 = new student("Ashutosh");

        s1.displaystudent();
        s2.displaystudent();
    }
}
