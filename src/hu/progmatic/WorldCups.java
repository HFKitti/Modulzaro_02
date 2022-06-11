package hu.progmatic;

public class WorldCups {

    private int year;
    private String host;
    private String confederation;
    private int date_from;
    private int date_to;

    public WorldCups() {
    }

    public WorldCups(String sor, int year, String host, String confederation, int date_from, int date_to) {

        String[] data = sor.split(";");
        this.year = Integer.parseInt(data[0]);
        this.host = data[1];
        this.confederation = data[2];
        this.date_from = Integer.parseInt(data[3]);
        this.date_to = Integer.parseInt(data[4]);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getConfederation() {
        return confederation;
    }

    public void setConfederation(String confederation) {
        this.confederation = confederation;
    }

    public int getDate_from() {
        return date_from;
    }

    public void setDate_from(int date_from) {
        this.date_from = date_from;
    }

    public int getDate_to() {
        return date_to;
    }

    public void setDate_to(int date_to) {
        this.date_to = date_to;
    }

    @Override
    public String toString() {
        return "WorldCups{" +
                "year=" + year +
                ", host='" + host + '\'' +
                ", confederation='" + confederation + '\'' +
                ", date_from=" + date_from +
                ", date_to=" + date_to +
                '}';
    }
}
