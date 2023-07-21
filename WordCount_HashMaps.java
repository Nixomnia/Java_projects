
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class Maps {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> wordCount = new HashMap<>();
        //must have paragraph such that sentences end with a full stop and a space then a new word
        //Example : This is line 1. This is line 2.
        while (sc.hasNext() ) {
            String word = ((sc.next()).toLowerCase());
            int len = word.length();
            if(word.charAt(len-1) == '.') continue;
            else if (!wordCount.containsKey(word)) {
                wordCount.putIfAbsent(word, 1);
            } else {
                int newValue = wordCount.get(word);
                newValue++;
                wordCount.put(word, newValue);
                }
            }
        System.out.println("Word\t\t\t\tWord Count");
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word+"\t\t\t\t"+count);
        }
    }
}
