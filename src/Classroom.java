// Classroom class
import java.util.Scanner;
public class Classroom {
public static void main(String[] args) {
//Variables

Student students[] = new Student[2];
int score, max;
students[0] = new Student(54100001,"John","Nuvo");
students[1] = new Student(54100003,"Michael","Paang");
//Input
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter score for Student 1: ");
score = keyboard.nextInt();
students[0].setScore(score);
System.out.print("Enter score for Student 2: ");
score = keyboard.nextInt();
students[1].setScore(score);
//Process
if(students[0].getScore()>students[1].getScore()){
max=students[0].getScore();
}else{
max=students[1].getScore();
}
//Output
System.out.println("\n---Summary---");

for(int i=0;i<2;i++){

System.out.println(students[i].getFirstName()+ ": "

+students[i].getScore()+" points");

}

System.out.println("Max score = "+max+" points");

}
}