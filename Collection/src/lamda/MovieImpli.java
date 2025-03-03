package lamda;

public class MovieImpli {

    public static Movie lamdaCall() {
        Movie movie = (a) -> {
            if (a ==true) {
                return 265.01210;
            }
            if (a == false) {

                return 300.4565;
            }
            return 52.26551;
        };

        return movie;
    }
}
