public class Student {
    private String name;
    private String surname;
    private String id;
    private float grade;

    /**
     * Creates a new Student with his name, surname, id and grade
     * @param name The name of the student
     * @param  surname The surname of the student
     * @param id The identification of the student
     * @param grade The grade of the student within a subject
     * */
    public Student(String name, String surname, String id, float grade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public float getGrade() {
        return grade;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
