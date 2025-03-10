import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> nameAge = new HashMap<>();
        System.out.print("Print count people: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        while (count > 0){
            System.out.print("Print " + count + " name people: ");
            String name = scanner.nextLine();
            System.out.print("Print age people: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            nameAge.put(name, age);
            count -= 1;
            }
        Map<Integer, List<String>> swapped = nameAge.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        System.out.println("Swapped Key and Value: " + swapped);
        }
    }
