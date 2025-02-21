public class MisplacedForLoopBody {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++){
 System.out.println(i);
 System.out.println("Done");
 }
}

}

//
E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>javac MisplacedForLoopBody.java

E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>java MisplacedForLoopBody
0
1
2
3
4
Done
//
E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>java MisplacedForLoopBody
0
Done
1
Done
2
Done
3
Done
4
Done
