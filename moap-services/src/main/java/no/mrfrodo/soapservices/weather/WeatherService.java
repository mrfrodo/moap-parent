package no.mrfrodo.soapservices.weather;

import no.mrfrodo.soapservices.Model.Weather;

public interface WeatherService {

    public Weather findWeather(final int zipCode);
}
