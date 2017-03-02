package javaPractice.java8.venkat.m08_7_to_8_code;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlbumTest {

    public List<Album> getAlbum(){
        List<Album> albumList = new ArrayList<>();

        Track t1 = new Track(1);
        Track t2 = new Track(2);
        Track t3 = new Track(3);
        Track t4 = new Track(4);
        Track t5 = new Track(5);

        List<Track> trackList = new ArrayList<>();
        trackList.add(t1);
        trackList.add(t2);
        trackList.add(t3);
        trackList.add(t4);
        trackList.add(t5);
        Album a1 = new Album("Album1",trackList);
        Album a2 = new Album("Album2",trackList);
        Album a3 = new Album("Album3",trackList);
        Album a4 = new Album("Album4",trackList);
        Album a5 = new Album("Album5",trackList);

        albumList.add(a1);
        albumList.add(a2);
        albumList.add(a3);
        albumList.add(a4);
        albumList.add(a5);

        return albumList;
    }

    public List<Album> java7(List<Album> albums){
        List<Album> favs = new ArrayList<>();
        for (Album a : albums) {
            boolean hasFavorite = false;
            for (Track t : a.tracks) {
                if (t.rating >= 4) {
                    hasFavorite = true;
                    break;
                }
            }
            if (hasFavorite)
                favs.add(a);
        }
        Collections.sort(favs, new Comparator<Album>() {
            public int compare(Album a1, Album a2) {
                return a1.name.compareTo(a2.name);
            }});
        return favs;
    }

    public List<Album> java8(List<Album> albums){
        List<Album> sortedFavs =
                albums.stream()
                        .filter(a -> a.tracks.stream().anyMatch(t -> (t.rating >= 4)))
                        .sorted(Comparator.comparing(a -> a.name))
                        .collect(Collectors.toList());
        return sortedFavs;
    }

    public List<Album> java8ReversOrder1(List<Album> albums){
//        Comparator<Album> comparator
//                = (h1, h2) -> h1.getName().compareTo(h2.getName());
        List<Album> sortedFavs =
                albums.stream()
                        .filter(a -> a.tracks.stream().anyMatch(t -> (t.rating >= 4)))
                        .sorted(Comparator.comparing(Album::getName).reversed())
                        .collect(Collectors.toList());
        return sortedFavs;
    }

    public List<Album> java8ReversOrder2(List<Album> albums){
        Comparator<Album> comparator
                = (h1, h2) -> h1.getName().compareTo(h2.getName());
        List<Album> sortedFavs =
                albums.stream()
                        .filter(a -> a.tracks.stream().anyMatch(t -> (t.rating >= 4)))
                        .sorted(comparator.reversed())
                        .collect(Collectors.toList());
        return sortedFavs;
    }

    public List<Album> java8ReversOrder3(List<Album> albums){
        Comparator<Album> comparator
                = (h1, h2) -> h2.getName().compareTo(h1.getName());
        List<Album> sortedFavs =
                albums.stream()
                        .filter(a -> a.tracks.stream().anyMatch(t -> (t.rating >= 4)))
                        .sorted(comparator)
                        .collect(Collectors.toList());
        return sortedFavs;
    }


    public static void main(String sa[]){

        AlbumTest at = new AlbumTest();


        System.out.println("+++++++++++++++++java 7+++++++++++++++++++++++\n"+at.java7(at.getAlbum()));
        System.out.println("+++++++++++++++++java 8+++++++++++++++++++++++\n"+at.java8(at.getAlbum()));
        System.out.println("+++++++++++++++++java 8 reverse order+++++++++++++++++++++++\n"+at.java8ReversOrder1(at.getAlbum()));
        System.out.println("+++++++++++++++++java 8 reverse order+++++++++++++++++++++++\n"+at.java8ReversOrder2(at.getAlbum()));
        System.out.println("+++++++++++++++++java 8 reverse order+++++++++++++++++++++++\n"+at.java8ReversOrder3(at.getAlbum()));
    }
}
