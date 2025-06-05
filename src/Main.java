import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var map = new HashMap<String, Integer>();
        map.put("Java", 1995);
        map.put("Basic", 1964);
        map.put("Go", 2011);
        map.put("C#", 2000);
        map.put("Smalltalk", 1980);
        map.put("Kotlin", 2011);
        map.put("Python", 1991);
        map.put("Ruby", 1995);
        map.put("PHP", 1995);
        map.put("Rust", 2013);
        map.put("Fortran", 1956);
        map.put("Perl", 1987);

        System.out.println(map.get("Java"));

        map.put("C", 1972);

        for (var entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
