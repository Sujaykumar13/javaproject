package ab;

public class RemoteRunner {
    public static void main(String[] args) {
        TvRemote sonyRemote = new SonyRemote("StarSports", 75);
        String sonyChannel= sonyRemote.channelChange();
        System.out.println(sonyChannel);
        int sonyVolume= sonyRemote.volumeIncrease();
        System.out.println(sonyVolume);
        TvRemote samRemote=new SamsungRemote("sports1",85);
        String samChannel=samRemote.channelChange();
        System.out.println(samChannel);
        int samVol= samRemote.volumeIncrease();
        System.out.println(samVol);


    }
}
