package ca.josue.aws.lambda;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

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

}
