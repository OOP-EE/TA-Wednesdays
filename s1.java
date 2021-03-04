public class di {
    public static void main(String[] args) {
        String str = "salam";
        System.out.println(str.toUpperCase());
        System.out.println(str.compareTo("sala")); // comparing 2 strings output = number of different characters
        System.out.println(str.isEmpty());
        System.out.println(str.concat(" khobi")); // joining two strings
        System.out.println(str.contains("sa")); // it checks whether the input exist in the string or not
        System.out.println(str.indexOf('m')); // it returns the index of the character or string (the first one)
        System.out.println(str.indexOf("la"));

        String str2 = "salam khobi khbam";
        System.out.println(str2.lastIndexOf('k')); // it returns the index of the character or string (the last one)

        System.out.println(str.toCharArray()[3]); // we can make the string to a char array
        System.out.println(str.charAt(2)); // it returns the character with index 2

        Integer a = 2;
        System.out.println(a.toString()); // this function transform any kind of object to a string

        System.out.println(str2.substring(6,10));
    }
}
