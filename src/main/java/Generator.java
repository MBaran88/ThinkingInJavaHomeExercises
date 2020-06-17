public class Generator {

    String[] collection = {"Zorro", "Batman", "Superman", "Wolverine", "Deadpool", "Spiderman", "Iron Man", "Hulk"};
    int index = 0;

    public String next() {
        if (index < collection.length) {
//            System.out.println(collection[index]);
            return collection[index++];
        } else index = 0;
//        System.out.println(collection[index]);
        return collection[index++];
    }
}
