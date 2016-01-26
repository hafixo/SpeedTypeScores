package STS.domain;

import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Score extends AbstractPersistable<Long> {

    private String name;
    private int points;

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
    
}
