

public class Main {
    public static void main(String[] args) {
       

        Subject subject = new Subject("Math", 5);


        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("John", "Smith", "123458", 3.0f);
        Student fourthStudent = new Student("Saturnino", "Mazapan", "1234510", 6.0f);
        Student fifthStudent = new Student("Paco", "Gerlo", "1234511", 9.0f);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);
        subject.addStudent(fourthStudent);
        subject.addStudent(fifthStudent);


        System.out.println("The average grade is: " + subject.getAverageGrade());
        System.out.println("The best student is: " + subject.getBestStudent().getName());
        System.out.println("The worst student is: " + subject.getWorstStudent().getName());

    }
}