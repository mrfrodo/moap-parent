package no.mrfrodo.soapservices.echo;

@javax.jws.WebService
public class EchoService {

    public String echo(String input) {
        return input;
    }
}
