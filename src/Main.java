public class Main {
    public static void main(String[] args) {

        System.out.println(Factorial.factorial(5));

        CP3LinkedList<String> list = new CP3LinkedList();

        list.addFirst("one");
        list.addFirst("two");
        list.addFirst("three");
        list.addFirst("four");
        list.addFirst("five");

        System.out.println(list.size());

        int[] numbers = {11, 6, 14, 7, 45, 98, 34, 23, 23};

        System.out.println(Small.findSmallest(numbers, numbers.length - 1));

        System.out.println(MyArray.binSearch(numbers, 7));
    }
}
