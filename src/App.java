import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class App {

    private static Map<String, Student5> absences = new HashMap<>();

    public static void main(String[] args) {
        init();
        System.out.println(absences);

        setAbsences();
        System.out.println(absences);

    }
    static void init() {
        Student5 stud1 = new Student5("Eric", "Krachnikov");
        Student5 stud2 = new Student5("Max", "Tylypov");
        Student5 stud3 = new Student5("Bill", "Xylahypov");

        absences.put(stud1.getLastName(), stud1);
        absences.put(stud2.getLastName(), stud2);
        absences.put(stud3.getLastName(), stud3);

}
    static void setAbsences(){
    Date dl = new Date();
        Student5 badStud3 = absences.get("Xylahypov");
        badStud3.getAbsences().add(dl);
    }
}
