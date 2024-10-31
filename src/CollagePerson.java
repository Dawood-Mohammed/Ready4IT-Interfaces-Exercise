public class CollagePerson {
    private String name;
    private String surname;
    private int collageId;

    public CollagePerson(String name, String surname, int collageId) {
        this.name = name;
        this.surname = surname;
        this.collageId = collageId;
    }

    public void goToCollage(){
        System.out.println(String.format("Collage ID: %d, Name: %s, Surname: %s", collageId, name, surname));
    }

    public int getCollageId() {
        return collageId;
    }

    public void setCollageId(int collageId) {
        this.collageId = collageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
