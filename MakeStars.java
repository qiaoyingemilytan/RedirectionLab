import java.util.*;
public class MakeStars{
  public static void main( String[]args ){
      Scanner n = new Scanner(System.in);
      while(n.hasNextLine()){
        String line = n.nextLine();
        Scanner s = new Scanner(line);
        String newLine = "";
        while(s.hasNext()){
          String word = s.next();
          for(int i = 0; i < word.length(); i++){
            newLine += "*";
          }
          newLine += " ";
        }
      System.out.println(newLine);
    }
  }
}
