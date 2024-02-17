/**
 * @author Override
 * @since 02/17/2024 @ 18:06
 * @see <a href="https://github.com/TuringProblem">GitHub Profile</a>
 */
//Add a private variable major to the student class.
public class Student extends Person {
    private int studentNumber;
    private String major;

    public Student() {
        super();
        studentNumber = 0;//Indicating no number yet
    }



    /**
     * @see -> setMajor() / getMajor() -> getters and setters for major to read and write the value of the of the Major
     * @param newMajor argument for SSN
     */
    public String setMajor(String newMajor) {
        return major = newMajor;
    }
    public String getMajor() {
        return major;
    }

    /**
     * @param initialName -> argument for name
     * @param studentMajor -> argument for major
     * @param studentSSN -> argument for SSN
     * @param initialStudentNumber -> argument for student number
     *                             -> added studentSSN to super class, (construct from the parent class)
     */
    public Student(String initialName, String studentMajor, int studentSSN, int initialStudentNumber) {
        super(initialName, studentSSN);
        this.major = studentMajor;
        studentNumber = initialStudentNumber;
    }

    /**
     *
     * @param newName -> argument for name
     * @param studentMajor -> argument for major
     * @param studentSSN -> argument for SSN
     * @param newStudentNumber -> argument for student number
     *                         -> reset() method to reset the name, major, SSN, and student number
     */
    public void reset(String newName, String studentMajor, int studentSSN, int newStudentNumber) {
        setName(newName);
        setSSN(studentSSN);
        major = studentMajor;
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber) {
        studentNumber = newStudentNumber;
    }


    //switched println to printf for better formatting -> added major and student ssn with getMethods -> which have both already been SET!
    //Also added @Override to the method -> implementation from parent class
    @Override
    public void writeOutput() {
        System.out.printf("Name: %s \n", getName());
        System.out.printf("SSN: %d \n", getSSN());
        System.out.printf("Major: %s \n", major);
        System.out.printf("Student Number: %d \n", studentNumber);
    }

    public boolean equals(Student otherStudent) {
        return this.hasSameName(otherStudent) &&
                (this.studentNumber == otherStudent.studentNumber);
    }


    public String toString() {
        return "Name: " + getName() +
                "\nStudent number: " + studentNumber;
    }


 /* //For Optional Section
    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (!(otherObject instanceof Student))
            return false;
        else
        {
            Student otherStudent = (Student)otherObject;
            return (this.sameName(otherStudent)
                && (this.studentNumber ==
                                otherStudent.studentNumber));
        }
    }
*/

}
