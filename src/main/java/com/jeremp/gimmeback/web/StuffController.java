
package com.jeremp.gimmeback.web;

import com.jeremp.gimmeback.data.model.LostStuff;
import com.jeremp.gimmeback.data.repositories.LostStuffRepository;
import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jeremp
 */
@RestController
@RequestMapping("/loststuff")
public class StuffController {
    
    final static Logger LOG = LoggerFactory.getLogger(StuffController.class);
    
    @Autowired
    private LostStuffRepository lostStuffRepository ;
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<LostStuff> findAllLostStuffs(){
        LOG.info("calling findAllLostStuffs ...");
        return lostStuffRepository.findAll(new Sort(Sort.Direction.DESC, "date"));
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public LostStuff create(@RequestParam String name, @RequestParam String desc, @RequestParam double lat, @RequestParam double lon){
        LOG.info("calling create ...");
        Date now = new Date();
        LostStuff stuff =  new LostStuff();
        stuff.setDate(now);
        stuff.setName(name);
        stuff.setDescription(desc);
        stuff.getLocation()[0] = lat ;
        stuff.getLocation()[1] = lon ;
        LostStuff saved = lostStuffRepository.save(stuff);
        return saved ;
    }
    
}
