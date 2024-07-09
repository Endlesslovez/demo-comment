package org.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    private static Log LOG = LogFactory.getLog(ExampleController.class);

    @GetMapping("/example")
    public String example(){
        LOG.info("Example request");
        return "HiHi";
    }
}
