package ab;

public class SonyRemote implements TvRemote {
    private String channel;
    private int volInc;
    public SonyRemote(String channel,int volInc)
    {
        this.channel=channel;
        this.volInc=volInc;
    }
    @Override
    public String channelChange() {
        System.out.println("channel change to "+channel+" in sony remote");
        return channel;

    }

    @Override
    public int volumeIncrease() {
        System.out.println("volume increase to "+volInc+" in sony remote");
        return volInc;
    }
}
