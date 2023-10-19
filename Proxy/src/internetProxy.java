import java.util.Arrays;
import java.util.List;

public class internetProxy implements internetServiceProvider {

    private List<String> bloackedSites = Arrays.asList("twitter","youtube","facebook");
    @Override
    public String serviceSite(String url) {
        internetLog(url);
        if(bloackedSites.contains(url)){
            return "This website is blocked ";
        }
        return new Jawall().serviceSite(url);
    }

    private void internetLog(String url) {
        System.out.printf("[%d] -> %s requested \n",System.currentTimeMillis(),url);
    }
}
