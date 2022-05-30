package ca.josue.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;

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

    public void getOutput(InputStream inputStream, OutputStream outputStream, Context context) throws IOException, InterruptedException {
        Thread.sleep(4000);

        System.out.println("context.getAwsRequestId() " + context.getAwsRequestId());
        System.out.println("context.getFunctionName() " + context.getFunctionName());
        System.out.println("context.getRemainingTimeInMillis() " + context.getRemainingTimeInMillis());
        System.out.println("context.getMemoryLimitInMB() " + context.getMemoryLimitInMB());
        System.out.println("context.getLogGroupName() " + context.getLogGroupName());
        System.out.println("context.getLogStreamName() " + context.getLogStreamName());
        System.out.println("context.getFunctionVersion() " + context.getFunctionVersion());
        System.out.println("context.getInvokedFunctionArn() " + context.getInvokedFunctionArn());
        System.out.println("context.getIdentity() " + context.getIdentity());
        System.out.println("context.getLogger() " + context.getLogger());
        System.out.println("context.getClientContext() " + context.getClientContext());

        // transform input to lowercase
        int data;
        while ((data = inputStream.read()) != -1) {
            outputStream.write(Character.toLowerCase(data));
        }
    }

}
