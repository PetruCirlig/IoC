package pixel.academy.spring.core.ioc;

import org.springframework.stereotype.Component;

public class ItalianChef {


    @Component
    public class ItalianChef implements Chef {
        @Override
        public  String getDailyRecipe() {
            return "Prepare pasta al pomodoro with fresh tomatoes and basil!";
        }
    }
}
