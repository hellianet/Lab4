import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> systemInfo = SystemInfo.getSpuInfo();
        for(Map.Entry<String, String > entry: systemInfo.entrySet()) {
            System.out.println(entry);
        }
    }
}
