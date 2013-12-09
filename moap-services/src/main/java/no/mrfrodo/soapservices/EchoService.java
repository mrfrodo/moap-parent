package no.mrfrodo.soapservices;

@javax.jws.WebService
public class EchoService {

    public String echo(String input) {
        return input;
    }
}
