
package no.mrfrodo.services;

import no.mrfrodo.model.Member;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.logging.Logger;

@Stateless
@Alternative
public class EJbMemberService implements MemberService {

    @Inject
    private Logger log;

    @Inject
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
