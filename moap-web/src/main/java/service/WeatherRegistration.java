
package service;

import model.Weather;
import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.logging.Logger;

@Stateless
public class WeatherRegistration {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private Event<Weather> weatherEventSrc;

    public void register(Weather weather) throws Exception {
        log.info("Registering " + weather.getName());
        em.persist(weather);
        weatherEventSrc.fire(weather);
    }
}