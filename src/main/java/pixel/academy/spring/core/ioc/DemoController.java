package pixel.academy.spring.core.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

public class DemoController {
    @RestController
    public class DemoController {

        private Chef myChef;

        //constructor
        @Autowired
        public Democontroller(Chef theChef) {
            myChef = theChef;
        }
    }
}
