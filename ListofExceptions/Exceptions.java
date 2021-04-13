import java.util.ArrayList;


public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("bananas");
        myList.add("gopher");
        myList.add(18);
        myList.add("wawawewa");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } catch (ClassCastException e) {
                System.out.println("ERROR: Cannot cast item to Integer");
            }
        }
    }
}