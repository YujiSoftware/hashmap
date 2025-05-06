import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<String, String>();
        m.put("HND", "羽田空港");
        m.put("NRT", "成田空港");
        m.put("ASJ", "奄美空港");

        System.out.println(m.get("HND"));
    }
}
