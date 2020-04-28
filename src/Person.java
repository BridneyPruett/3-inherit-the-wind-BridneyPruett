public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private String fullName;
    private int YOB;

   // public Person(){
   //     this.ID = "012";
   //     this.firstName = "Bridney";
   //     this.lastName = "Pruett";
   //     this.title = "Ms";
   //     this.fullName = "Ms.Bridney Pruett";
   //     this.YOB = 1990;
   // }
    public Person(String ID, String firstName, String lastName, int YOB, String title){
        this.ID = ID;
        this.firstName = firstName;
        this.YOB = YOB;
        this.lastName = lastName;
        this.title = title;


    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        while(this.YOB < 1940){
            System.out.println("TOO OLD!");
            // age has to be between 1940-2010
        }
        while(this.YOB > 2010){
            System.out.println("TOO YOUNG!");
            // age has to be between 1940-2010
        }
    }
    public void names(String fullName){
        this.fullName = firstName + lastName;
    }
}
