public class array {

    public static void main(String[] args) {
        String names[] = new String[4];
        names[0] = "R15";
        names[1] = "ktm";
        names[2] = "mt15";
        names[3] = "ktm";

        for(int i = 0; i < names.length; i++) {
            System.out.println("names at index " + i + " is " + names[i]);
        }

        String name[]={"R15", "ktm", "mt15", "ktm"};
        for(int i = 0; i < name.length; i++) {
            System.out.println("name at index " + i + " is " + name[i]);
        }

        String name1[]= new String[]{"R15", "ktm", "mt15", "ktm"};
        for(int i = 0; i < name1.length; i++) {
            System.out.println("name1 at index " + i + " is " + name1[i]);
        }

    }
}
