package Entity;

import java.util.Set;

/**
 * Created by vserdiuk on 2/4/17.
 */
public class Cities {

    private Long idcity;
    private String namecity;

    public String getNamecity() {
        return namecity;
    }

    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }

    public Long getIdcity() {
        return idcity;
    }

    public void setIdcity(Long idcity) {
        this.idcity = idcity;
    }

    public String getNameCity() {
        return namecity;
    }

    public void setNameCity(String namecity) {
        this.namecity = namecity;
    }

    private Set<Landmarks> setOfLandmarks;

    public Set<Landmarks> getSetOfLandmarks() {
        return setOfLandmarks;
    }

    public void setSetOfLandmarks(Set<Landmarks> setOfLandmarks) {
        this.setOfLandmarks = setOfLandmarks;
    }

    public Cities() {

    }

    public String getCity() {
        return namecity;
    }

    public void setCity(String namecity) {
        this.namecity = namecity;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + idcity +
                ", city='" + namecity + '\'' +
                '}';
    }
}