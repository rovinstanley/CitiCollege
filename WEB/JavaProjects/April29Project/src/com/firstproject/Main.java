package com.firstproject;

public class Main {

    public static void main(String[] args) {
	// write your code here
       String a1=AgeClassification(40);
       System.out.println(a1);

        String a2=AgeClassification(17);
        System.out.println(a2);

        String a3=AgeClassification(65);
        System.out.println(a3);

    }

    public static String AgeClassification (int age)
    {
        String classification = "";
           if (age>=18 && age<64)
        {
            classification ="Adult";
        }
        else if (age>=65)

        {
            classification = "Senior";
        }
        else if(age<=17)
        {
            classification = "Child";
        }

        return classification;

        }


    }


