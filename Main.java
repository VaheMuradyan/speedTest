import java.util.*;

public class Main {


    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        long start, end;

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Vector<Integer> vector = new Vector<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int ra;
        for (int i = 0; i < 1000; i++) {
            ra = random.nextInt(1000000);
            hashSet.add(ra);
            linkedHashSet.add(ra);
            treeSet.add(ra);
            arrayList.add(ra);
            linkedList.add(ra);
            vector.add(ra);
            priorityQueue.add(ra);
        }
        System.out.println();
        System.out.println("######## Whot collecton you wonte to test ########");



        boolean ok = true;
        while (ok) {
            System.out.println();
            System.out.println("HashSet -> 1");
            System.out.println("LinkedHashSet -> 2");
            System.out.println("TreeSet -> 3");
            System.out.println("ArrayList -> 4");
            System.out.println("LinkedList -> 5");
            System.out.println("Vector -> 6");
            System.out.println("PriorityQueue -> 7");
            System.out.println("End proces -> 8");
            System.out.println();
            System.out.print("Choice -> ");
            int choice = getUserInput(scanner, 1, 8);
			System.out.println();
            switch (choice) {
                case 1: 
                    System.out.println("-------- HashSet --------");
                    System.out.println();
                    System.out.println("----- Befor -----");
                    printCollection(hashSet);
                    System.out.println();
                    start = System.currentTimeMillis();
                    removeEvenNumbers(hashSet);
                    end = System.currentTimeMillis();
                    System.out.println();
                    System.out.println("----- After -----");
                    printCollection(hashSet);
                    System.out.println();
                    System.out.println("*** Time of removing even numbers is " + (end - start) + "ms ***");
                    System.out.println();
                	break;
                case 2:
                    System.out.println("-------- LinkedHashSet --------");
                    System.out.println();
                    System.out.println("----- Befor -----");
                    printCollection(linkedHashSet);
                    System.out.println();
                    start = System.currentTimeMillis();
                    removeEvenNumbers(linkedHashSet);
                    end = System.currentTimeMillis();
                    System.out.println();
                    System.out.println("----- After -----");
                    printCollection(linkedHashSet);
                    System.out.println();
                    System.out.println("*** Time of removing even numbers is " + (end - start) + "ms ***");
                    System.out.println();
                	break;
                case 3:
                    System.out.println("-------- TreeSet --------");
                    System.out.println();
                    System.out.println("----- Befor -----");
                    printCollection(treeSet);
                    System.out.println();
                    start = System.currentTimeMillis();
                    removeEvenNumbers(treeSet);
                    end = System.currentTimeMillis();
                    System.out.println();
                    System.out.println("----- After -----");
                    printCollection(treeSet);
                    System.out.println();
                    System.out.println("*** Time of removing even numbers is " + (end - start) + "ms ***");
                    System.out.println();
                	break;
                case 4:
                    System.out.println("-------- ArrayList --------");
                    System.out.println();
                    System.out.println("----- Befor -----");
                    printCollection(arrayList);
                    System.out.println();
                    start = System.currentTimeMillis();
                    removeEvenNumbers(arrayList);
                    end = System.currentTimeMillis();
                    System.out.println();
                    System.out.println("----- After -----");
                    printCollection(arrayList);
                    System.out.println();
                    System.out.println("*** Time of removing even numbers is " + (end - start) + "ms ***");
                    System.out.println();
                	break;
                case 5:
                    System.out.println("-------- LinkedList --------");
                    System.out.println();
                    System.out.println("----- Befor -----");
                    printCollection(linkedList);
                    System.out.println();
                    start = System.currentTimeMillis();
                    removeEvenNumbers(linkedList);
                    end = System.currentTimeMillis();
                    System.out.println();
                    System.out.println("----- After -----");
                    printCollection(linkedList);
                    System.out.println();
                    System.out.println("*** Time of removing even numbers is " + (end - start) + "ms ***");
                    System.out.println();
                	break;
                case 6:
                    System.out.println("-------- Vector --------");
                    System.out.println();
                    System.out.println("----- Befor -----");
                    printCollection(vector);
                    System.out.println();
                    start = System.currentTimeMillis();
                    removeEvenNumbers(vector);
                    end = System.currentTimeMillis();
                    System.out.println();
                    System.out.println("----- After -----");
                    printCollection(vector);
                    System.out.println();
                    System.out.println("*** Time of removing even numbers is " + (end - start) + "ms ***");
                    System.out.println();
                	break;
                case 7:
                    System.out.println("-------- PriorityQueue --------");
                    System.out.println();
                    System.out.println("----- Befor -----");
                    printCollection(priorityQueue);
                    System.out.println();
                    start = System.currentTimeMillis();
                    removeEvenNumbers(priorityQueue);
                    end = System.currentTimeMillis();
                    System.out.println();
                    System.out.println("----- After -----");
                    printCollection(priorityQueue);
                    System.out.println();
                    System.out.println("*** Time of removing even numbers is " + (end - start) + "ms ***");
                    System.out.println();
                	break;
                case 8:
                    ok = false;
                	break;
            }
        }

    }


    public static void removeEvenNumbers(Collection<Integer> collection) {
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    public static void printCollection(Collection<Integer> collection) {
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    private static int getUserInput(Scanner scanner, int min, int max) {
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice >= min && choice <= max) {
                    return choice;
                }
            } else {
                scanner.nextLine();
            }
            System.out.println("Invalid input. Please enter a valid number between " + min + " and " + max);
        }
    }
}
