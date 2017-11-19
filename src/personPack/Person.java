package personPack;
/**
 * @author Jude Kallista-Fitzpatrick
 *Date: 11/19/2017
 *Purpose: To give the name and of person class.
 */
public class Person {
    private String name;
    private int age;
    /**
     *Constructor makes the person class named Jude
     * The default age is set to 18
     */
    public Person() {
        name = "Jude";
        age = 18;
    }
    /**
     * person is made with the values provided
     * @param name name of person
     * @param age age of person
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /**
     * Get name
     * @return get name
     */
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get age
     * @return
     */
    public int getAge() {
        return this.age;
    }
    /**
     * Set age with parameter
     * @param age with parameter
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * return age and name
     * @return age and name
     */
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }

}
