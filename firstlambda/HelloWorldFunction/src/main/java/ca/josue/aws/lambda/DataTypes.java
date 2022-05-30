package ca.josue.aws.lambda;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

    public ClinicalData getClinicalData(Patient patient) {
        System.out.println("Getting clinical data for patient: " + patient.getName());
        System.out.println("Patient ssn " + patient.getSsn());
        ClinicalData clinicalData = new ClinicalData();
        clinicalData.setBloodPressure("80/120");
        clinicalData.setHeartRate(80);
        return clinicalData;
    }

    public void getOutput(InputStream inputStream, OutputStream outputStream) throws IOException {
        // transform input to lowercase
        int data;
        while ((data = inputStream.read()) != -1) {
            outputStream.write(Character.toLowerCase(data));
        }
    }

}
