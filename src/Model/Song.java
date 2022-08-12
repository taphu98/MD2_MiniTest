package Model;

public class Song {
    private int id;
    private String name;
    private int like;
    private int listen;

    public Song(){
    }
    public Song(int id, String name, int like, int listen) {
        this.id = id;
        this.name = name;
        this.like = like;
        this.listen = listen;
    }
}
