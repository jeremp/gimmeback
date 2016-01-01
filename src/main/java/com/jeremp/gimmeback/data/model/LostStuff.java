
package com.jeremp.gimmeback.data.model;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author jeremp
 */
public class LostStuff {
    
    @Id
    private String id ;
    
    private String name ;
    private String description ;
    private Date date ;
    
    /**
     * A location Point, as described in the mongodb 2 indexes documentation
     * https://docs.mongodb.org/manual/core/2d/
     */
    private double[] location = new double[2] ;
    /**
     * Max dostance from the location point, in meters
     */
    private long maxDistance = 200 ;

    public LostStuff() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double[] getLocation() {
        return location;
    }

    public void setLocation(double[] location) {
        this.location = location;
    }

    public long getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(long maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
