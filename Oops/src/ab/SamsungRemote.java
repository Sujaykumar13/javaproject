package ab;

public class SamsungRemote implements TvRemote{
    private String channel;
    private int vol;
    public SamsungRemote(String channel,int vol)
    {
      this.channel=channel;
      this.vol=vol;
    }
    @Override
    public String channelChange() {
        System.out.println("channel change to "+channel+" in samsung remote");
        return channel;
    }

    @Override
    public int volumeIncrease() {
        System.out.println("volume change to "+vol+" in samsung remote");
        return vol;

    }
}
