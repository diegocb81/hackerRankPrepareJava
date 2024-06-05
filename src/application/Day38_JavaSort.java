package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        } else if (!s1.getFname().equals(s2.getFname())) {
            return s1.getFname().compareTo(s2.getFname());
        } else {
            return Integer.compare(s1.getId(), s2.getId());
        }
    }
}

public class Day38_JavaSort {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases-- > 0) {
            int id = scan.nextInt();
            String fname = scan.next();
            double cgpa = scan.nextDouble();
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
        }
        scan.close();

        Collections.sort(studentList, new StudentComparator());
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
