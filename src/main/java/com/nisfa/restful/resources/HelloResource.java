package com.nisfa.restful.resources;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author Administrator
 */
@ApplicationPath("api/v1")
public class HelloResource extends Application {

    /**
     * primarily used to polymorphic the BaseResource from the different version
     * control
     *
     * @return
     */
//    @Override
//    public Set<Class<?>> getClasses() {
//        return super.getClasses();
//
//    }
}
