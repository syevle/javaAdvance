package javaPractice.java8.venkat.m08_7_to_8_code;

/**
 * Created by Santosh on 3/2/17.
 */
public class Track {
    int rating;

    public Track(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Track{" +
                "rating=" + rating +
                '}';
    }
}
