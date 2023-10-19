public class Jawall implements internetServiceProvider{
    private int browsingSpeed = 10;
    @Override
    public String serviceSite(String url) {
        return String.format("https://%s.com",url);
    }

    public int getBrowsingSpeed() {
        return browsingSpeed;
    }
}
