public class Generator {

    static String[] collection = {"Zorro", "Batman", "Superman", "Wolverine", "Deadpool", "Spiderman", "Iron Man", "Hulk"};
    static int index = 0;

    public String next() {
        for (int i = 0; i < collection.length; i++) {
            System.out.println(collection[index]);
        }
        return collection[index++];
    }
//    public static String getNext(){
//        return collection[index++];
//    }
}
