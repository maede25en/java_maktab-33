package question1;

import exceptions.InvalidAgeException;
import exceptions.InvalidNameException;

import java.util.*;

public class Main {
    static ArrayList<String> city = new ArrayList<>();

    public static void main(String[] args) throws InvalidNameException, InvalidAgeException {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("shiva taheri", 15, "physics", "tehran");
        students.add(s1);
        Student s2 = new Student("zahar akbari", 14, "chemistry", "esfahan");
        students.add(s2);
        Student s3 = new Student("sara zamani", 16, "computer", "hamedan");
        students.add(s3);
        Student s4 = new Student("sanaz kamali", 13, "chemistry", "tehran");
        students.add(s4);
        Student s5 = new Student("ali asqari", 15, "physics", "yazd");
        students.add(s5);
        Student s6 = new Student("reza nemati", 15, "computer", "tehran");
        students.add(s6);
        Student s7 = new Student("sina rad", 14, "biology", "shiraz");
        students.add(s7);
        Student s8 = new Student("mohamd omrani", 16, "biology", "tehran");
        students.add(s8);
        Student s9 = new Student("ali ahmadi", 13, "physics", "qom");
        students.add(s9);
        Student s10 = new Student("saman sadati", 17, "chemistry", "tehran");
        students.add(s10);
        Student s11 = new Student("mobina ghafari", 14, "math", "sari");
        students.add(s11);
        Student s12 = new Student("reza taqavi", 17, "computer", "rasht");
        students.add(s12);
        Student s13 = new Student("sanaz razavi", 16, "math", "qom");
        students.add(s13);
        Student s14 = new Student("ali jafari", 14, "biology", "yazd");
        students.add(s14);


        System.out.println("cities:\n " + showCities(students));
        System.out.println("-----------------------------");
        System.out.println("cities and students:\n" + showCityStudent(students));
        System.out.println("-----------------------------");
        System.out.println("course and cities:\n" + showCourseAndCities(students));
        System.out.println("-----------------------------");
        //System.out.println(cityAverage(cityAndAge(students)));


    }

    public static HashSet<String> showCities(ArrayList<Student> students) {
        HashSet<String> cities = new HashSet<>();
        for (Student student : students) {
            cities.add(student.getCity());
        }

        return cities;
    }

    public static HashMap<String, List<String>> showCityStudent(ArrayList<Student> students) {
        HashMap<String, List<String>> cityAndStudent = new HashMap<>();
        for (Student student : students) {
            String city = student.getCity();
            List<String> studentOfsameCity = cityAndStudent.get(city);
            if (studentOfsameCity == null) {
                studentOfsameCity = new ArrayList();
                cityAndStudent.put(city, studentOfsameCity);
            }
            studentOfsameCity.add("name:" + student.getName() + ",age:" + student.getAge() + " ,course: " + student.getCourseName());
        }
        return cityAndStudent;

    }

    public static HashMap<String, HashSet<String>> showCourseAndCities(ArrayList<Student> students) {
        HashMap<String, HashSet<String>> courseCity = new HashMap<>();
        for (Student student : students) {
            String course = student.getCourseName();
            HashSet<String> sameCity = courseCity.get(course);
            if (sameCity == null) {
                sameCity = new HashSet<>();
                courseCity.put(course, sameCity);
            }
            sameCity.add(student.getCity());
        }
        return courseCity;
    }




}
