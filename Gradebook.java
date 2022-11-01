package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Gradebook {

    public static void main(String args[])
    {
        Map<String ,Integer> gradebook = getoriginalGrades();
        Map<String ,Integer> makeupGrades = getmakeupexamGrades();

        gradebook.forEach((student ,originalgrade)->{
            Integer makeupgrade = makeupGrades.get(student);
            if(makeupgrade>originalgrade){
                gradebook.put(student,makeupgrade);
            }
            System.out.println(student + ":" + gradebook.get(student));
        });
    }
    public static Map getoriginalGrades()
    {
        Map orgGrade = new HashMap();
        orgGrade.put("Zarina",99);
        orgGrade.put("Yasmeen",77);
        orgGrade.put("Leena",67);
        orgGrade.put("Madina",56);
        orgGrade.put("Ameenah",78);

        return orgGrade;

    }

    public static Map getmakeupexamGrades()
    {
        Map makupGrade = new HashMap();
        makupGrade.put("Zarina",89);
        makupGrade.put("Yasmeen",87);
        makupGrade.put("Leena",97);
        makupGrade.put("Madina",96);
        makupGrade.put("Ameenah",88);

        return makupGrade;

    }
}
