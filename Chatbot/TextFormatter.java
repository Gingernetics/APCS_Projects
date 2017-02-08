public class TextFormatter{
  private String line; // The line to format
  
  public TextFormatter (String lineToFormat)
  {line = lineToFormat;}
  
  /**
   * Find the first single instance of str in line,
   * starting at the position start
   * @param str the string of length 1 to find.
   * Guaranteed to be length 1.
   * @param star the position to start searching.
   * Guaranteed to be in the string line.
   * @return the index of the first single instance of
   * str if the string is found or -1 if it is not found.
   */
  public int findString (String str, int start){
    for(int i = start; i < line.length(); i++){
      if (i == 0 && (line.substring(i, i+1).equals(str)) && !line.substring(i+1, i+2).equals(str))
        return i;
      else if (i == line.length() - 1 && (line.substring(i).equals(str)) && !line.substring(i-1, i).equals(str))
        return i;
      else if ((line.substring(i, i+1).equals(str)) && !line.substring(i-1, i).equals(str) && !line.substring(i+1, i+2).equals(str))
        return i;
    }
    return -1;
  }
  
  /**
   * Count the number of times single instances of str appear in
   * the line.
   * @param str the string to find.
   * Guaranteed to be length 1.
   * @return the number of times the string appears in the line
   */
  private int countStrings (String str){
    int count = 0;
    for(int i = 0; i < line.length(); i++){
      if (i == 0 && (line.substring(i, i+1).equals(str)) && !line.substring(i+1, i+2).equals(str))
        return count += 1;
      else if (i == line.length() - 1 && (line.substring(i).equals(str)) && !line.substring(i-1, i).equals(str))
        return count += 1;
      else if ((line.substring(i, i+1).equals(str)) && !line.substring(i-1, i).equals(str) && !line.substring(i+1, i+2).equals(str))
        return count += 1;
    }
    return count;
  }
  
  /**
   * Replace all single instances of underscores in the line given by
   * line with italic tags. There must be an even number of underscores
   * in the line, an they will be replaced by <I>, </I>, alternating.
   * @param original a string of length 1 to replace
   * @param replacement the string (of any length) use as a replacement 
   * @return the line with single instances of underscores replaced with 
   * <I> tags or the original line if there are not an even number of 
   * underscores.
   */
  public String convertItalics (){
    String ans = "";
    int numCheck = countStrings("_");
    
    if ((numCheck % 2) == 1) return line;
    for (int i = 0; i < line.length(); i++){
      if (((line.substring(i, i + 1)).equals("_")) && ((numCheck % 2) == 0)){
        ans += "<I>";
        numCheck--;
      }
      else if (((line.substring(i, i + 1)).equals("_")) && ((numCheck % 2) == 1)){
        ans += "</I>";
        numCheck--;
      }
      else ans += line.substring(i, i + 1);
    }
    return ans;
  }

}


        
        
      
  
    
    
