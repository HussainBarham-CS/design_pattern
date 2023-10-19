import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sites = Arrays.asList("HusseinBarham","linkedIn","twitter","youtube","facebook");

        internetServiceProvider isp = new internetProxy();
        for(String site : sites){
            System.out.println(isp.serviceSite(site));
        }
    }
}