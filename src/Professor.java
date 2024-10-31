public class Professor extends CollagePerson implements TeachingPerson{
    private String teachingSubject;
    public Professor(String name, String surname, int id, String subject) {
        super(name, surname, id);
        this.teachingSubject = subject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println(String.format("Professor %s with collage id %d teaches to other people the subject %s", getName()+" "+getSurname(), getCollageId(), teachingSubject));
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }
}
