public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("Java", 1995);
        m.put("JavaScript", 1995);
        m.put("C#", 2002);
        m.put("Scala", 2004);
        m.put("Kotlin", 2011);
        m.put("Python", 1991);
        m.put("Ruby", 1995);
        m.put("PHP", 1995);
        m.put("Go", 2011);
        m.put("Rust", 2013);
        m.put("Fortran", 1956);
        m.put("Perl", 1987);

        System.out.println(m.get("Java"));

        m.put("C", 1972);
    }
}
