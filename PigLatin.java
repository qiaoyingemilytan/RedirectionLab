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
    String n = "";
    String[] digraphs = new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    boolean hasDigraph = false;
    for(int i = 0; i < digraphs.length; i++){
      if(s.length() > 2 && s.substring(0,2).equals(digraphs[i])){
        hasDigraph = true;
      }
    }
    if(hasDigraph){
      n = s.substring(2, s.length()-1) + s.substring(0,2) + "ay";
    }
    else{
      n = pigLatinSimple(s);
    }
    return n;
  }

  public static String pigLatinBest(String s){
    String n = "";
    if(s.length() > 1 && !Character.isLetter(s.charAt(s.length()-1))){
      n = pigLatin(s.substring(0,s.length()-1)) + s.charAt(s.length()-1);
    }
    else{
      n = pigLatin(s);
    }
    return n;
  }

  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    while(n.hasNextLine()){
      String line = n.nextLine();
      Scanner s = new Scanner(line);
      String newLine = "";
      while(s.hasNext()){
        newLine += pigLatinBest(s.next());
        newLine += " ";
      }
      System.out.println(newLine);
    }
  }

}
