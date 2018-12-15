package com.github.tibor17;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public final class Booter {
    public static void main(String... args) throws Exception {
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        try (SeContainer container = initializer.initialize()) {
            MyBean myBean = container.select(MyBean.class).get();
            System.out.println(myBean);
        }
    }
}
