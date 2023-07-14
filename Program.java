import java.util.*;


//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
//их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию
//числа телефонов.

public class Program {
    public static void main(String[] args) {

        User u1 = new User("a");
        User u2 = new User("d");
        User u3 = new User("c");
        TreeMap<Integer, String> phonebook = new TreeMap<>();
        phonebook.put(323, "u3");
        phonebook.put(324, "u1");
        phonebook.put(325, "u2");
        phonebook.put(126, "u2");
        phonebook.put(127, "u3");
        phonebook.put(128, "u3");
        LinkedHashMap sorted = user_count(phonebook);
        System.out.println(sorted);

    }

    public static LinkedHashMap<Integer, String> user_count(TreeMap<Integer, String> tm){
        TreeMap<String, Integer> tmcount = new TreeMap<String, Integer>();
        LinkedHashMap<Integer, String> sortedtm = new LinkedHashMap<Integer, String>();
        var keys = tm.keySet();
        for(var key : keys) {
            if (tmcount.isEmpty()){
                tmcount.put(tm.get(key), 1);
            }
            else if (tmcount.containsKey(tm.get(key))) {
                tmcount.put(tm.get(key), tmcount.get(tm.get(key)) + 1);
            } else tmcount.put(tm.get(key), 1);
        }
        for (String userSort: tmcount.descendingMap().keySet()) {
            for (Integer key: keys){
                if(userSort.equals(tm.get(key))){
                    sortedtm.put(key, userSort);
                }
            }
        }
        return sortedtm;
    }


}
