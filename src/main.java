import java.util.*;

public class main {
    public static void main(String[] args) {
        Student2 student = new Student2("Kien", 30, "HT");
        Student2 student1 = new Student2("Nam", 26, "HN");
        Student2 student2 = new Student2("Anh", 38, "HT" );
        Student2 student3 = new Student2("Tung", 38, "HT" );

        List<Student2> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        System.out.println(lists);
        lists.sort(((o2, o1) -> o1.getName().compareTo(o2.getName())));
        for(Student2 st : lists){
            System.out.println(st.toString());
        }

        lists.sort(((o1, o2) -> o1.getAge().compareTo(o2.getAge()) ));
        System.out.println("So sanh theo tuoi:");
        for(Student2 st : lists){
            System.out.println(st.toString());
        }
    }
}
