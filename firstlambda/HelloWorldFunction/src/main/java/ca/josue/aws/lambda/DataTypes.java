package ca.josue.aws.lambda;

import java.util.*;

public class DataTypes {
    public boolean getNumber(float number){
        return number > 100;
    }

    public List<Integer> getScores(List<String> names){
        HashMap<String, Integer> studentsScores = new HashMap<>();
        studentsScores.put("John", 90);
        studentsScores.put("Bob", 80);
        studentsScores.put("Ahmed", 100);

        List<Integer> scores = new LinkedList<>();
        names.forEach(name -> scores.add(studentsScores.get(name)));

        return scores;
    }

    public void saveEmployeeData(Map<String, String> employeeData){
        System.out.println("Saving employee data");
        System.out.println(employeeData);
    }

    public Map<String, List<Integer>> getStudentScores(){
        HashMap<String, List<Integer>> studentsScores = new HashMap<>();
        studentsScores.put("John", Arrays.asList(90, 80, 100));
        studentsScores.put("Bob", Arrays.asList(80, 70, 100));
        studentsScores.put("Ahmed", Arrays.asList(100, 90, 20));

        return studentsScores;
    }

}
