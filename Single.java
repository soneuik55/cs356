//Name: Son, Sunghwan
//Class: CS356- Object-Oriented Programming

public class Single implements Question{



  private static String[] single_Choice = {"1.Right", "2.Wrong"};


    public static String get_Question(int index){

      return single_Choice[index];
    }

}//end of class
