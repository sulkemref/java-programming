package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"Lucy", "Umran", "Sumeye", "Abidullah"}; //4names;
        String[] group2 = {"Madiyar", "Khashayar", "Rayhane"}; //3 names;
        String[] group3 = {"Alena", "Evgeniya", "Shukur", "Hasan", "Bilal"}; //5 names;
        String[] group4 = {"Adelina", "Ali"}; //2 names;

        String [] [] groups = {group1,group2,group3,group4};
        //                      0       1       2       3
        for (String[] group : groups) {
            for (String s : group) {
                System.out.print(s+ " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < groups.length; i++) {
            String [] group = groups[i];
            for (int j = 0; j < group.length; j++) {
                String eachStudent = group[j];
                System.out.print(eachStudent+ " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------------");

        for (int i = groups.length-1; i >= 0; i--) {

            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }

        }


        System.out.println("---------------------------------------------------------");

        System.out.println(groups);

        System.out.println(Arrays.toString(groups));

        System.out.println(Arrays.deepToString(groups)); // deepToString ==> print multi-dimensional array


    }

}
