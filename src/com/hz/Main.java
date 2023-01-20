package com.hz;

import com.hz.RestaurantFacade;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        RestaurantFacade facade = new RestaurantFacade(1, "Dutch", 2);

        facade.introConversation();
        facade.waiterInteraction();
    }

}
