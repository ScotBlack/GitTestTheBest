package com.company;

public class Person {
    public static void main(String[] args) {

        private String firstName;
        private String lastName;
        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        // Getters en Setters zijn weggelaten. Die kunnen jullie zelf toevoegen.


        @Override
        public String toString() {
            return firstName + " " + lastName;



    }
}
