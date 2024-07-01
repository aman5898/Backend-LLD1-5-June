package Collections;

import java.util.Comparator;

public class StudentPSPComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.psp-o2.psp);
    }
}
