package PlayList;
public class Songs {
    private String name;
    private String singer;
    private String duration;
    private String writer;
    private String movie;

    public Songs()
    {
    }
    public String getName()
    {
        return name;
    }
    public String getSinger()
    {
        return singer;
    }
    public String getDuration()
    {
        return duration;
    }
    public String getWriter() {
        return writer;
    }
    public String getMovie() {
        return movie;
    }
    public Songs (String name,String singer,String duration,String writer,String movie)
    {
        super();
        this.name = name;
        this.singer = singer;
        this.writer = writer;
        this.movie = movie;
        this.duration = duration;
    }
    public String toString()
    {
        return "[Name:" + name + ",Singer:" + singer + ",Duration:" + duration +"]";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Songs)) return false;
        Songs s = (Songs) o;
        return this.name.equalsIgnoreCase(s.name)
                && this.singer.equalsIgnoreCase(s.singer)
                && this.writer.equalsIgnoreCase(s.writer)
                && this.duration.equalsIgnoreCase(s.duration)
                && this.movie.equalsIgnoreCase(s.movie);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + singer.hashCode() + duration.hashCode() + writer.hashCode() + movie.hashCode();
    }

}
