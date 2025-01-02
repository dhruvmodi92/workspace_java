package org.dhruv;

import java.util.Scanner;

public class InheritanceSolution {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String firstName = scan.next();
			String lastName = scan.next();
			int id = scan.nextInt();
			int numScores = scan.nextInt();
			int[] testScores = new int[numScores];
			for(int i = 0; i < numScores; i++){
				testScores[i] = scan.nextInt();
			}
			scan.close();
			
			Student1 s = new Student1(firstName, lastName, id, testScores);
			s.printPerson();
			System.out.println("Grade: " + s.calculate() );
		}
	
}

class Student1 extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student1(String firstName, String lastName, int id,int[] scores)
    {
        super(firstName,lastName,id);
        this.testScores = scores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public Character calculate()
    {
        float avg = 0;
        int sum = 0;
        int count = 0;
        Character grade = 'O';
        for(int score : this.testScores)
        {
            sum += score;
            count++;
        }
        avg = sum / count;
        if(avg >= 80 && avg < 90)
            grade = 'E';
        else if(avg >= 70 && avg < 80)
            grade = 'A';
        else if(avg >= 55 && avg < 70)
            grade = 'P';
        else if(avg >= 40 && avg < 55)
            grade = 'D';
        else if(avg < 40)
            grade = 'T';
        
        return grade;
    }
}


class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
