class Solution {
    public boolean isPalindrome(String s) {
    StringBuilder temp=new StringBuilder();
      int i;
      int j=s.length()-1;
      for(i=0;i<=j;i++) {
      if((s.charAt(i)>='a' && s.charAt(i)<='z') ||(s.charAt(i)>='A' && s.charAt(i)<='Z' || (s.charAt(i)>='0' && s.charAt(i)<='9'))) {
        char ch=s.charAt(i);
        if(ch>=65 && ch<=90){
            ch=(char)(ch+32);
        }
        temp.append(ch);
      }
      }
   
      i=0;
      j=temp.length()-1;
      while(i<=j){
        if(temp.charAt(i)!=temp.charAt(j)) return false;
        i++;
        j--;
      }
      return true;
    }
}