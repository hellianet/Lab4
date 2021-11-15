import java.util.Map;

public class SystemInfo {

    static {
        System.load("/home/kristina/IdeaProjects/Lab4/bin/jrisysteminfo.so");
    }

    static native Map<String,String> getSpuInfo();
}
