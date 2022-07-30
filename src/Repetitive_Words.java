import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetitive_Words {
	public static void main(String[] args) {
		String s = "api testing functional testing perforformance testing";
		String[] allwords = s.split(" ");
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		for (String word : allwords) {
			
			if (m.containsKey(word)) {
				Integer value = m.get(word);
				m.put(word, value + 1);

			} 
			else {
				m.put(word, 1);
			}

		}
		System.out.println(m);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
		
				System.out.println(entry);
			}

		}

	}
}
