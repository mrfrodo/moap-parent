package no.mrfrodo.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named
@ApplicationScoped
public class GrowlBean {

    private String text;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public void save(ActionEvent actionEvent) {
        FacesContext context = FacesContext.getCurrentInstance();
        UIComponent cmp = actionEvent.getComponent();

        context.addMessage(null, new FacesMessage("Successful", "Hello " + text));
        context.addMessage(null, new FacesMessage("Second Message", "Additional Info Here..."));
    }
}  