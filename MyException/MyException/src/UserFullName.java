
public class UserFullName {
    private String firstName, lastName;
    public UserFullName() {
        setFirstName("NO");
        setLastName("Name");
    }
    public UserFullName(String fullName) throws LengthException,InvalidCharsException  {
        if(fullName.indexOf(' ')<0)throw new InvalidCharsException(fullName+" must contain space");
        String name[]=fullName.split(" ");
        setFirstName(lengthCheck(name[0]));
        setLastName(lengthCheck(name[1]));
        checkChuck();
    }
    public UserFullName(String firstName, String lastName)throws StringException{
        setFirstName(lengthCheck(firstName));
        setLastName(lengthCheck(lastName));
        checkChuck();
    }
    private void setFirstName(String firstName){
        this.firstName=firstName;
    }
    private void setLastName(String lastName){
        this.lastName=lastName;
    }
    private String lengthCheck(String name) throws LengthException{
        if (name.length()<3)throw new LengthException("'"+name+"' is too short");
        return name;
    }
    private void checkChuck() throws InvalidCharsException {
        if((firstName+lastName).equalsIgnoreCase("ChuckNorris"))throw new InvalidCharsException("There is only One Chuck Norris!");
    }
    public String toString() {//String representation of UserFullName
        return firstName+" "+lastName;
    }
}
