package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("--------------------------------------------------------");
        // how many female & male employees in the map?

        int CountMaleEmployees = 0, CountFemaleEmployees = 0;

         /*
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployee++;
            }else{
                countFemaleEmployees++;
            }
        }
        */

        for (String value : employeeMap.values()) {
            CountMaleEmployees+=(value.charAt(0)=='M')?1:0;
            CountFemaleEmployees+=(value.charAt(0)=='F')?1:0;
        }
        System.out.println("CountMaleEmployees = " + CountMaleEmployees);
        System.out.println("CountFemaleEmployees = " + CountFemaleEmployees);

        System.out.println("--------------------------------------------------------");
        // display the names of all the female employees

        /*
        for (String name : employeeMap.keySet()) {
            String gender =employeeMap.get(name);
            if(gender.equals("F")){
                System.out.println(name);
            }
        }
         */

        for (Map.Entry<String, String> stringStringEntry : employeeMap.entrySet()) {
            if(stringStringEntry.getValue().equals("F")){
                System.out.println(stringStringEntry.getKey());
            }
        }

        System.out.println("---------------------------------------------");
        // update all the "M" values with "Male", "F" values with "Female"

        for (Map.Entry<String, String> stringStringEntry : employeeMap.entrySet()) {
            if(stringStringEntry.getValue().equals("F")){
                stringStringEntry.setValue("Female");
            }else{
                stringStringEntry.setValue("Male");
            }
        }

        System.out.println(employeeMap);

    }
}
