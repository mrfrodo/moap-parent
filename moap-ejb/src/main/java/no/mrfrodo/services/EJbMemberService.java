
package no.mrfrodo.services;

import no.mrfrodo.model.Member;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.logging.Logger;

@Stateless
//@Alternative
public class EJbMemberService implements MemberService {


                                                // Now we can inject a Logger
                                                // Because we have a class, Resources, that produces this for us



                                                // Now we can inject an entity manager
                                                // Because we have a class, Resources, that produces this for us
    @PersistenceContext(name="primary")
    private EntityManager em;

    @Inject
    private Event<Member> memberEventSrc;

    public void saveNewMember(Member member) throws Exception {
        em.persist(member);
        memberEventSrc.fire(member);
    }

    @Override
    public Member findById(final Long id) throws Exception {
        return null;
    }
}
