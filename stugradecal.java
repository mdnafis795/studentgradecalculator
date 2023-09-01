import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entenr the no of subjects: ");
    int num = sc.nextInt();
    System.out.println("Enter the no of subjects code: ");
    int subjects[] = new int[num];
    for(int i=0; i<subjects.length; i++){
      subjects[i] =sc.nextInt();
    }
    int totalmarks = 0;
    for(int j = 0; j<subjects.length; j++){
      System.out.print("Enter marks obtained in subject " + subjects[j]+ "=");
      int marks = sc.nextInt();
      totalmarks += marks;
    }
    double avg = (double)totalmarks/(num*100)*100;
    char grade;
    if(avg>=90){
      grade = 'A';
    }else if(avg>=80){
      grade = 'B';
    }else if(avg>=70){
      grade = 'C';
    }else if(avg>=60){
      grade = 'D';
    }else{
      grade = 'F';
    }
    System.out.println("------------------------");
    System.out.println("Total Marks: " + totalmarks);
    System.out.println("Avg percentage: " + avg +"%");
    System.out.println("Grade: " + grade);
    
  }
}