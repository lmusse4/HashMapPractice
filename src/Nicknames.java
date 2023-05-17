import java.util.HashMap;
public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("mathew", "matt");
        names.put("michael", "mix");
        names.put("arthur", "artie");

        System.out.println(names.get("mathew"));
    }

}
