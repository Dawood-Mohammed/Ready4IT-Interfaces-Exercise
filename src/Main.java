public class Main {
    public static void main(String[] args) {
        /**
         * create 3 objects, 1 for each subclass type
         * invoke the goToCollege() method for each of the newly created objects
         * invoke the implemented methods from interfaces (1 for Student, 1 for Professor and 2 for Assistant)
         */
        Student student = new Student("ali", "hassan", 123, 3);
        Professor professor = new Professor("ahmed", "mohammed", 135, "mathematics");
        Assistant assistant = new Assistant("salih", "isac", 246, true);
        student.goToCollage();
        professor.goToCollage();
        assistant.goToCollage();
        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}