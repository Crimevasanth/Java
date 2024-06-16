import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
ArrayList<Integer> integerList = new ArrayList<>();
integerList.add(0);
integerList.add(2);
integerList.add(3);
integerList.add(5);
integerList.add(6);
integerList.add(7);

for (int i = 0; i < integerList.size(); i++) {
System.out.println(i + " is " + integerList.get(i));
}

integerList.add(1, 1);

for (int i = 0; i < integerList.size(); i++) {
System.out.println(i + " is " + integerList.get(i));
}

integerList.add(4, 4);

for (int i = 0; i < integerList.size(); i++) {
System.out.println(i + " is " + integerList.get(i));
}
}
}
