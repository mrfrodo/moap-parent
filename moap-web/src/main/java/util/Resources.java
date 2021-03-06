package util;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.logging.Logger;

public class Resources {

   @Produces
   @PersistenceContext
   private EntityManager em;
   
   @Produces
   @SuppressWarnings("unused")
   public Logger produceLog(InjectionPoint injectionPoint) {
       Logger logger = Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
       return logger;
   }
}
