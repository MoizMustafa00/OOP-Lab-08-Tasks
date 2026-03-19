package Lab_08_Tasks;

abstract class User {
    public abstract void login();
}

class Student extends User {
    @Override
    public void login() {
        System.out.println("Student Logged In!");
    }
}

class Instructor extends User {
    @Override
    public void login() {
        System.out.println("Instructor Logged In!");
    }

    public void uploadCourse(String courseName) {
        System.out.println("Course " + courseName + " Uploaded!");
    }
}

class Main4 {
    public static void main(String[] args) {
        Student s = new Student();
        s.login();
        Instructor i = new Instructor();
        i.login();
        i.uploadCourse("OOP");
    }
}