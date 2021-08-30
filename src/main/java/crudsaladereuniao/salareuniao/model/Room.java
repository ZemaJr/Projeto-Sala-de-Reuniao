package crudsaladereuniao.salareuniao.model;


import javax.persistence.*;

@Entity
@Table(name="meetingroom")
public class Room {

    private long id;
    private String name;
    private String date;
    private String startTime;
    private String endTime;

    public Room() {

    }

    public Room(long id, String name, String date, String startTime, String endTime) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name ="name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name ="date", nullable = false )
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Column(name ="startTime", nullable = false )
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Column(name ="endTime", nullable = false )
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Room [id="+ id +",name="+ name + ",startTime="+ startTime + ",endTime="+ endTime + " ]";
    }
}
