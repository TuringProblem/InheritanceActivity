import javax.management.ConstructorParameters;

/**
 * @author Override
 * @since 02/17/2024 @ 18:06
 * @see <a href="https://github.com/TuringProblem">GitHub Profile</a>
 */
//Add a private variable SSN to the person class.
public class Person
{
    private String name;
    private int SSN;

    public Person( )
    {
        name = "No name yet";
    }
    
    public Person(String initialName, int initialSSN)
    {
        SSN = initialSSN;
        name = initialName;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     * @see -> setSSN() / getSSN() -> getters and setters for SSN to read and write the value of the SSN
     * @param newSSN argument for SSN
     */
    public void setSSN(int newSSN) {
        SSN = newSSN;
    }
    
    public String getName( )
    {
        return name;
    }
    public int getSSN() {
        return SSN;
    }
    
    public void writeOutput( )
    {
        System.out.println("Name: " + name);
    }
   
    public boolean hasSameName(Person otherPerson)
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}
