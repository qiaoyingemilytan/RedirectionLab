import java.util.*;
public class PigLatin{
  public static String pigLatinSimple(String s){
    if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
      s += "hay";
    }
    else{
      s = s.substring(1,s.length()-1) + s.charAt(0) + "ay";
    }
    return s;
  }

  public static String pigLatin(String s){
    String[] digraphs = new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    boolean hasDigraph = false;
    for(int i = 0; i < digraphs.length; i++){
      if(s.substring(0,2).equals(digraphs[i])){
        hasDigraph = true;
      }
    }
    if(hasDigraph){
      s = s.substring(2, s.length()-1) + s.substring(0,2) + "ay";
    }
    else{
      pigLatinSimple(s);
    }
    return "";
  }

  public static String pigLatinBest(String s){
    return "";
  }

  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    while(n.hasNextLine()){
      String line = n.nextLine();
      Scanner s = new Scanner(line);
      String newLine = "";
      while(s.hasNext()){
        newLine += pigLatinSimple(s.next());
        newLine += " ";
      }
      System.out.println(newLine);
    }
  }

}
