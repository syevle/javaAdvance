package javaPractice.java8.venkat.m08_7_to_8_code;

import java.util.Collection;

/**
 * Created by Santosh on 3/2/17.
 */
public class Album {


        String name;

        Collection<Track> tracks;

    public Album(String name, Collection<Track> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Collection<Track> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", tracks=" + tracks +
                '}';
    }
}
