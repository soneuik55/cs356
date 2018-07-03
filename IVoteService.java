//Name: Son, Sunghwan
//Class: CS356- Object-Oriented Programming

public class IVoteService{

  private static String type_Of_Question;  // to decide to what type a question is
  private static String[] studentID_Multiple_ARR = new String[100]; //check if a students submitted other answer or not before
  private static String[] studentID_Single_ARR = new String[100]; //check if a students submitted other answer or not before
  private static String[] submission_Multiple_ARR = new String[100];
  private static  String[] submission_Single_ARR = new String[100];
  private static int number_Of_Multiple_Submission =0;  // to count number of submission of a student
  private static int number_Of_Single_Submission =0;  // to count number of submission of a student
  private static String[] resultMultiple = new String[100];
  private static String[] resultSingle = new String[100];


  private static int count_A =0;
  private static int count_B =0;
  private static int count_C =0;
  private static int count_D =0;
  private static int count_Right =0;
  private static int count_Wrong =0;



  public static void set_submission(String type, String sub, String ID){


    if(type.equals("multiple")){
      studentID_Multiple_ARR[number_Of_Multiple_Submission] = ID;
      //if there is the same ID, replace the previous answer with the current Submission

      submission_Multiple_ARR[number_Of_Multiple_Submission] = sub;
      number_Of_Multiple_Submission++;
      }
      else if(type.equals("single")){
        studentID_Single_ARR[number_Of_Single_Submission] = ID;
        //if there is the same ID, replace the previous answer with the current submission
        submission_Single_ARR[number_Of_Single_Submission] = sub;
        number_Of_Single_Submission++;
      }


  }


 public static int get_Single_Submission(){


  return number_Of_Single_Submission;
 }

 public static int get_Multiple_Submission(){


    return number_Of_Multiple_Submission;
 }


  public static void print_Multiple_Answer(){




for(int i=0; i < number_Of_Multiple_Submission; i++){

if(submission_Multiple_ARR[i].equals("A"))
count_A++;
else if(submission_Multiple_ARR[i].equals("B"))
count_B++;
else if(submission_Multiple_ARR[i].equals("C"))
count_C++;
else if(submission_Multiple_ARR[i].equals("D"))
count_D++;

//System.out.println("Student ID: " + studentID_Multiple_ARR[i] +": " +"Answer submitted: " + submission_Multiple_ARR[i]);

}
System.out.println("A: " + count_A);
System.out.println("B: " + count_B);
System.out.println("C: " + count_C);
System.out.println("D: " + count_D);


  }

  public static void print_Single_Answer(){


    for(int j=0; j < number_Of_Single_Submission; j++){

      if(submission_Single_ARR[j].equals("1.Right"))
      count_Right++;
      else if(submission_Single_ARR[j].equals("2.Wrong"))
      count_Wrong++;


    //System.out.println("Student ID: " + studentID_Single_ARR[j] +": " +"Answer submitted: " + submission_Single_ARR[j]);

  }//end of for loop

    System.out.println("1.Right: " + count_Right);
    System.out.println("2.Wrong: " + count_Wrong);
  }



  public static int removeDuplicates(int arr[], int n)
    {
        // Return, if array is empty
        // or contains a single element
        if (n==0 || n==1)
            return n;

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i=0; i<n-1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n-1];

        // Modify original array
        for (int i=0; i<j; i++)
            arr[i] = temp[i];

        return j;
    }
}//end of class
