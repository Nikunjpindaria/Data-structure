import java.util.HashMap;

public class CountCharacterFrequency {
    public static void main(String[] args) {
        String str = "character";
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Frequencies:");
        for (char c : freqMap.keySet()) {
            System.out.println(c + " → " + freqMap.get(c));
        }
    }
}
