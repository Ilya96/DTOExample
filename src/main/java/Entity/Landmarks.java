
package Entity;

public class Landmarks{
    /**
     * Created by vserdiuk on 2/4/17.
     */
    private Long idlandmarks;
    private String namelandmarks;
    private Long idcity;

    public Landmarks() {

    }

    public Long getIdcity() {
        return idcity;
    }

    public void setIdcity(Long idcity) {
        this.idcity = idcity;
    }

    public Long getIdlandmarks() {
        return idlandmarks;
    }

    public void setIdlandmarks(Long idlandmarks) {
        this.idlandmarks = idlandmarks;
    }

    public String getNamelandmarks() {
        return namelandmarks;
    }

    public void setNamelandmarks(String namelandmarks) {
        this.namelandmarks = namelandmarks;
    }

    public Long getIdCity() {
        return idcity;
    }

    public void setIdCity(Long idcity) {
        this.idcity = idcity;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + idlandmarks +
                ", country='" + namelandmarks + '\'' +
                '}';
    }
}