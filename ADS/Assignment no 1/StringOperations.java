import java.util.*;

class StringOperations {

     static boolean isAnagram(String str1, String str2){
      char[] ch1 = str1.toLowerCase().toCharArray();
      char[] ch2 = str2.toLowerCase().toCharArray();

      Arrays.sort(ch1);
      Arrays.sort(ch2);
    return Arrays.equals(ch1,ch2);

}


     static String longestWord(String sentence){
      String words[] = sentence.split(" ");
     String longest = "";
   for(String word : words){
       if(word.length() > longest.length()){
         longest = word;
}
}
return longest;
}



   static void countVowels(String sentence){
     int vowels =0;
      int consonants =0;
    sentence = sentence.toLowerCase();

   for(int i=0; i< sentence.length(); i++){
    char ch = sentence.charAt(i);
         if("aeiou".indexOf(ch) != -1)
            vowels++;
else  
         consonants++;

}
 System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
}
   public static void main(String args[]){
   Scanner sc= new Scanner(System.in);

 System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + isAnagram(str1, str2));
   
 System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Longest word
        String longest = longestWord(sentence);
        System.out.println("Longest word: " + longest);

        // Vowel and consonant count
        countVowels(sentence);
}
}