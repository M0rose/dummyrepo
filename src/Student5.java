
import java.util.ArrayList;
import java.util.*;

public class Student5 {

    private String firstName;
    private String lastName;
    private List<Date> absences = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Date> getAbsences() {
        return absences;
    }

    public Student5(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Student5 ");
        sb.append(": firstName - ").append(firstName);
        sb.append(", lastName - ").append(lastName);
        sb.append(", absences - ").append(absences).append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student5 student5 = (Student5) o;

        if (firstName != null ? !firstName.equals(student5.firstName) : student5.firstName != null) return false;
        if (lastName != null ? !lastName.equals(student5.lastName) : student5.lastName != null) return false;
        return absences != null ? absences.equals(student5.absences) : student5.absences == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (absences != null ? absences.hashCode() : 0);
        return result;
    }
}
