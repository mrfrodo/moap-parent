package no.mrfrodo.controller;

import no.mrfrodo.model.Member;
import no.mrfrodo.services.MemberService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ApplicationScoped
public class MemberBean {

    private String name;

    private Member newMember;

    @Inject
    private MemberService memberRegistration;

    @Produces
    @Named
    public Member getNewMember() {
        return newMember;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void save(ActionEvent actionEvent) {
        try {
            newMember.setName(name);
            memberRegistration.saveNewMember(newMember);
        } catch (Exception e) {
            e.printStackTrace();
        }

        initNewMember();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registered!", "Registration successful"));
        context.addMessage(null, new FacesMessage("Successful", "Welcome new member " + name));
        context.addMessage(null, new FacesMessage("Second Message", "Additional Info Here..."));
    }

    @PostConstruct
    public void initNewMember() {
        newMember = new Member();
    }
}  