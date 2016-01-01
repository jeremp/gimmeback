/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeremp.gimmeback.data.repositories;

import com.jeremp.gimmeback.data.model.LostStuff;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author jpass_000
 */
public interface LostStuffRepository extends MongoRepository<LostStuff, String> {
    
    
    
}
