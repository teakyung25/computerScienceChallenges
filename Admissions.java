import java.util.*;


public class Admissions {
    public static void main (String [] args ){
        String [] student1 = status(1500,95,8,"Mars", "Padjen");
        int solidCount = 0;
        int nopeCount = 0;
        int i = 0;
        while(i < student1.length) {
            if(student1[i] == "Solid") {
                solidCount++;
            }
            if(student1[i] == "Nope"){
                nopeCount++;
            }
            i++;
        }
        if(((student1[0] == "Elite" || student1[1] == "Elite" || student1[2] == "Elite" || student1[3] == "Elite") || (solidCount >= 2) || (student1[4] == "Padjen")) && (nopeCount  == 0)){
            
                        System.out.println("You have been accepted! You got two or more solids, at least one elite, from Colorado or no Florida, and your name was Padjen");
        } else {
            System.out.println("You have not been excepted! sorry, you don't have a Elite, two solids, or your name wasn't padjen and you had more than 0 nopes :(");
            System.out.println(Arrays.toString(student1));
        }
    }

    public static String [] status (int score, int rank, int award, String origin, String name) {
        String [] studentStatus = new String[5];
        studentStatus[4] = name;
        if(score >= 1500){
            studentStatus[0] = "Elite";
        } else if (score >= 1400){
            studentStatus[0] = "Solid";
        } else if (score >= 1200){
            studentStatus[0] = "Acceptable";
        } else {
            studentStatus[0] = "Nope";
        }

        if(rank >= 95){
            studentStatus[1] = "Elite";
        } else if (rank >= 90) {
            studentStatus[1] = "Solid";
        } else if (rank >= 85) {
            studentStatus[1] = "Acceptable";
        } else if (rank < 85) {
            studentStatus[1] = "Nope";
        }

        if (award >= 10){
            studentStatus[2] = "Elite";
        } else if (award >= 8) {
            studentStatus[2] = "Solid";
        } else if (award >= 3) {
            studentStatus[2] = "Acceptable";
        } else {
            studentStatus[2] = "Nope";
        }

        if (origin == "Colorado") {
            studentStatus[3] = "Elite";
        } else if (origin == "Florida") {
            studentStatus[3] = "Nope";
        } else {
            studentStatus[3] = "Acceptable";
        }

        return studentStatus;
    }
}