package LoopsConditionsTest;

import LoopsConditions.PersonAgeClassifier;

public class TestPersonAgeClassifier {
    public static void main(String[] args) {
        // Test cases
        int[] ages = {5, 15, 25};

        // Test each age and classify the person
        for (int age : ages) {
            System.out.print("Age " + age + " is a ");
            PersonAgeClassifier.classifyPerson(age);
        }
    }
}
