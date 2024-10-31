public class Assistant extends CollagePerson implements LearningPerson, TeachingPerson{
    /**
     * implements the right interfaces and overrides the abstract methods with informative messages
     */
    private boolean isGoingToBeAPhD;
    public Assistant(String name, String surname, int id, boolean willBeAPhD) {
        super(name, surname, id);
        this.isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println(String.format("Assistant %s with collage id %d studies at home and is going to be a PhD %b", getName()+" "+getSurname(), getCollageId(), isGoingToBeAPhD));
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println(String.format("Assistant %s with collage id %d teaches to other people and is going to be a PhD %b", getName()+" "+getSurname(), getCollageId(), isGoingToBeAPhD));
    }
}
