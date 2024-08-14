package 과거의산물.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class _5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int dd = Integer.parseInt(input[1]);
            int mm = Integer.parseInt(input[2]);
            int yy = Integer.parseInt(input[3]);
            students.add(new Student(input[0], LocalDate.of(yy, mm, dd)));
        }

        Student youngest = students.get(0);
        Student oldest = students.get(0);
        for (Student student : students) {
            if (student.birthDate.isBefore(oldest.birthDate)) {
                oldest = student;
            }
            if (student.birthDate.isAfter(youngest.birthDate)) {
                youngest = student;
            }
        }

        System.out.println(youngest.name);
        System.out.println(oldest.name);


    }
}

class Student {
    String name;
    LocalDate birthDate;

    public Student(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}