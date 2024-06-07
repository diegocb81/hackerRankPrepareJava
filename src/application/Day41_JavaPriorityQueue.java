package application;

import java.util.*;

class Students {
    private final int id;
    private final String name;
    private final double cgpa;

    public Students(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    // PriorityQueue is configured with a custom comparator
    private final PriorityQueue<Students> queue = new PriorityQueue<>(
            Comparator.comparingDouble(Students::getCGPA).reversed()
                    .thenComparing(Students::getName)
                    .thenComparingInt(Students::getID));

    public List<Students> getStudents(List<String> events) {
        for (String event : events) {
            String[] details = event.split("\\s+");

            if ("SERVED".equals(details[0])) {
                queue.poll();
            } else if ("ENTER".equals(details[0])) {
                String name = details[1];
                double cgpa = Double.parseDouble(details[2]);
                int id = Integer.parseInt(details[3]);
                queue.add(new Students(id, name, cgpa));
            }
        }

        // Collect the remaining students in sorted order
        List<Students> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }
        return students;
    }
}

public class Day41_JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>(totalEvents);

        for (int i = 0; i < totalEvents; i++) {
            events.add(scan.nextLine());
        }

        List<Students> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Students st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
