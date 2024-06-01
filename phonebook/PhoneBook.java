package phonebook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, ArrayList<Long>> numList = new HashMap<>();

    public void addPhone (String name, long num) {
        if (!numList.containsKey(name)) {
            ArrayList<Long> list = new ArrayList<>();
            list.add(num);
            numList.put(name, list);
        } else {
            numList.get(name).add(num);
        }
    }

    public void removePhone (String name, long num) {
        ArrayList<Long> list = new ArrayList<>();
        list.addAll(numList.get(name));
        list.remove(num);
        numList.get(name).clear();
        numList.get(name).addAll(list);
    }

    public void printAll() {
        List<Map.Entry<String, ArrayList<Long>>> sortedEntries = new ArrayList<>(numList.entrySet());
            sortedEntries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
            System.out.println(sortedEntries);
    }
}
