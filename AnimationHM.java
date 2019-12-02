/*

*/
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.lang.*;
import java.io.*;

public class AnimationHM{

  // public static void main(String[]args) throws IOException, InterruptedException
  // {
    //creating string arrays.


    public static String[] HM1 =
      {
        "                                                       ",
        "                     ||                                ",
        "                     ||                                ",
        "                     ||                                ",
        "                     ||                                ",
        "                     ||                                ",
        "                     ||                                ",
        "                     ||                                ",
        "                     ||                                ",
        "                     ||                                ",
        "              ||=============||                        ",
        "              ||=============||                        ",
        "              ||=============||                        ",
        "--------------||=============||------------------------",
		};


	  public static String[] HM2 =
      {

"                      ___________________              ",
"                     ||                                ",
"                     ||                                ",
"                     ||                                ",
"                     ||                                ",
"                     ||                                ",
"                     ||                                ",
"                     ||                                ",
"                     ||                                ",
"                     ||                                ",
"              ||=============||                        ",
"              ||=============||                        ",
"              ||=============||                        ",
"--------------||=============||------------------------",
		};
    public static String[] HM3 =
      {

"                      ___________________                  ",
"                     ||                 ||                 ",
"                     ||                 ||                 ",
"                     ||                 ||                 ",
"                     ||                 ||                 ",
"                     ||                 ||                 ",
"                     ||                                    ",
"                     ||                                    ",
"                     ||                                    ",
"                     ||                                    ",
"              ||=============||                            ",
"              ||=============||                            ",
"              ||=============||                            ",
"--------------||=============||-----------------------------",
    };

public static String[] HM4 ={

  "                                                             ",
  "                                           { ^ ^ }           ",
  "                                             ***             ",
  "                                              |              ",
  "                                      []======|======[]      ",
  "                                              |              ",
  "                                              |              ",
  "                                              |              ",
  "                                           =======          ",
  "                                          ||     ||         ",
  "                                          ||     ||         ",
  "                                          ||     ||         ",
  "                                       ---------------      ",
};




	 public static String[] HM5 =
      {
"                      ________________________             ",
"                      ||                     ||             ",
"                      ||                     ||             ",
"                      ||                     ||             ",
"                      ||                     ||             ",
"                      ||                     ||             ",
"                      ||                     ||             ",
"                      ||                   { ^ ^ }           ",
"                      ||                     ***             ",
"                      ||                      |              ",
"                      ||                ======|======        ",
"                      ||                      |              ",
"                      ||                      |              ",
"                      ||                      |              ",
"                      ||                   =======           ",
"                ||=============||         ||     ||          ",
"                ||=============||         ||     ||          ",
"                ||=============||                            ",
"----------------||=============||-----------------------------",

    };
  public static String[] HM6 =
      {
        "\n",
        "\n",
        "What do you think is happed after the winter has been hangged ? ",
        "Let's find out! ?",
      };
      // String[] HM7 =
      //   {
      //     "\n",
      //     "\n",
      //
      //   };

/* place into function */
public void myMethod() {


// String[] HM1 =new String[200];
// String [] HM2=new String[200];
// String [] HM3= new String[200];
// String [] HM4 =new String[200];
// String [] HM5 = new String[200];
// String [] HM6= new String[200];
//String [] HM7 = new String[5];
try {
    print(HM1);
		Thread.sleep(1500);
		print(HM2);
		Thread.sleep(1500);
		print(HM3);
    Thread.sleep(1500);
		animate(HM4);
    Thread.sleep(1500);
		print(HM5);
    Thread.sleep(1500);
    print(HM6);
    Thread.sleep(5500);
    // print(HM7);
    // Thread.sleep(5500);
  }
  catch (Exception e) {

   e.printStackTrace();
 }

    try {
      Thread.sleep(1500);

     URI uri= new URI("https://www.youtube.com/watch?v=bah_B7YW2Lk");

     java.awt.Desktop.getDesktop().browse(uri);

    } catch (Exception e) {

     e.printStackTrace();
   }
 }
/* place into function */

//  }// end main

  /**
  */
   public static void print(String[] printout) throws IOException, InterruptedException
   {
     cls();
     for(int j = 0; j < printout.length; j++) {
       System.out.println(printout[j]);
     }
   }

/*
   */
  // throws IOException, InterruptedException
   public void animate(String[] printout)
   {
     try{
     cls();
     for(int length = 0; length < printout.length; length++)
     {
	   Thread.sleep(500);
     cls();
       for(int i = 0; i < printout.length; i++)
       {
         for(int width = printout.length; width > length; width--)
         {
          System.out.print(" ");
         }
		  System.out.println(printout[i]);
       }
     }
   }
   catch (Exception e) {

    e.printStackTrace();
  }

     	 //System.out.println(ANSI_RESET);
   }// end animate

/**
 * a quick process that clears the screen  Currently only for windows users.
 */
    public static void cls() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }//end cls
}//end class
