package sfm;

public class Main {
    public static void main(String[] args) {
        String name = "Blake";
        System.out.println(name.charAt(2));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        for(char character : name.toCharArray()) {
            System.out.printf("%c  ", character);
        }
        System.out.printf("%n");
        System.out.println(name.startsWith("Bl"));
        System.out.println(name.endsWith("kem"));
        
        System.out.println(name.indexOf("a")+ " "+ name.indexOf("f"));

        String fullname = name.concat(" Kemp");

        System.out.println(fullname);

        StringBuilder sb = new StringBuilder("Bruce Springsteen ");
        sb.append("is the artist ever");

        System.out.println(sb.toString());

        sb.insert(24," greatest");
        sb.replace(34, 40, "singer");
        System.out.println(sb.toString());

        new Game(); //starts game

        
    }
}