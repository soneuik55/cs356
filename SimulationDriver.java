//Name: Son, Sunghwan
//Class: CS356- Object-Oriented Programming


import java.util.*;



public class SimulationDriver{
    public static void main(String[] args){

      //to generate random number of students, ID, submissions.
      Random random_Generator = new Random();

      //Creating objects
      IVoteService Ivote = new IVoteService() ;
      Multiple mul = new Multiple() ;
      Single sing = new Single();



      // To choose by generating random number for each.
      // 1. choose type of questions
      // 2. if multiple questions?, choose answer from the array multiple_Choices
      // 2. if single questions?, choose answer from the array named single_Choice

      int number_Students = random_Number_Of_student();

      System.out.println("Number of students is "+ number_Students);

      //Create a list of Students with random numbers

      Student[] student_arr = new Student[number_Students];

        //Filling the  studetns_arr with student ID
        //After the for loop, they will have student ID
        for(int i=0; i<student_arr.length; i++){

          student_arr[i]= new Student();

          int ID_students = random_StudentID();
          String number = Integer.toString(ID_students);
          System.out.println("Stdents ID "+ (i+1)+": " + number);
          student_arr[i].set_Student_ID(number);
        }


        System.out.println();
        //set the answer of each student.
        // choosing the type of answer is also random.


        String type =" ";
        for(int i=0; i < student_arr.length; i++){

        //setting up the type of question.
        int chooseTypes = random_Generator.nextInt(2);

        //multiple question chosen
        if(chooseTypes==0){
          type = "multiple";
        int chooseMultple = random_Generator.nextInt(4);  //generating Random# for multiple_Choices
        student_arr[i].set_Answer( mul.get_Question(chooseMultple) ); // choose one answer from A,B,C,D


          Ivote.set_submission(type, student_arr[i].get_Answer() , student_arr[i].get_Student_ID());
        }
        //single question chosen
        else{

        type = "single";
        int chooseSingle = random_Generator.nextInt(2);    //generating Random# for single_Choices
        student_arr[i].set_Answer( sing.get_Question(chooseSingle));   // choose one answer from Right or Wrong
        //countSingle++;
        //int number_submission =random_Submission();

        //for(int j=0; i<number_submission; j++ )
        {
        Ivote.set_submission(type, student_arr[i].get_Answer() , student_arr[i].get_Student_ID());
        }

        }
      }//end of for loop: i


//Print out the results;
//System.out.println("The number of students: "+ number_Students);
System.out.println("The answers submitted by students are.... ");
Ivote.print_Multiple_Answer();
Ivote.print_Single_Answer();



    }//end of main


 

    public static int random_Number_Of_student(){

        Random random_Generator = new Random();

        int result = 0;
        result = random_Generator.nextInt(20)+10;

        return result;
    }

    public static int random_StudentID(){

        Random random_Generator = new Random();
        int ID_students = random_Generator.nextInt(10000)+1000;


        return ID_students;
    }

    public static int random_Submission(){

        Random random_Generator = new Random();
        int number_submission = random_Generator.nextInt(4)+1;


        return number_submission;
    }

















}//end of class







//1. Allow students to submit answers. Every student has a unique ID (String) because
//I used ineger for the ID, and can submit an answer to the iVote service

//2. I need to generate random number for how many times each student submit their answers
//and then only last submission will be taken as a final answer
