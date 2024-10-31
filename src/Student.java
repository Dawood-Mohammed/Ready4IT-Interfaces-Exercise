public class Student extends CollagePerson implements LearningPerson{
    private int academicYear;
    public Student(String name, String surname, int id, int year) {
        super(name, surname, id);
        this.academicYear = year;
    }

    public int getYear() {
        return academicYear;
    }

    public void setYear(int year) {
        this.academicYear = year;
    }

    @Override
    public void studyAtHome() {
        System.out.println(String.format("Student %s with collage id %d of year %d is studies at home", getName()+" "+getSurname(), getCollageId(), academicYear));
    }
}
