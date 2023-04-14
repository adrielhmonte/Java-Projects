public class generics {
    
    public static void main(String[] args) {

        Integer[] intArray = {1,2,3,4};
        Double[] doubleArray = {2.1,2.3,4.5};
        Character[] charArray = {'S','A','L'};
        String[] stringArray = {"B","A","F"};

        //displayArray(stringArray);
        //displayArray(doubleArray);
        //displayArray(charArray);
        //displayArray(intArray);
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));


    }

    public static <thing> void displayArray(thing[] array) {

        for (thing x : array){
            System.out.print(x+"");
        }
        System.out.println();

    }

    public static <T> T getFirst (T[] array){
        return array[0];


    }

}
