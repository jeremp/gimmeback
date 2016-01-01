
package com.jeremp.gimmeback.data.model;

import java.util.Date;

/**
 *
 * @author jeremp
 */
public class LostStuff {
    
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
    
    
    
}
