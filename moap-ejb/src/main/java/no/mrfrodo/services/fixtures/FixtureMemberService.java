
package no.mrfrodo.services.fixtures;

import no.mrfrodo.model.Member;
import no.mrfrodo.services.MemberService;

//@Alternative
public class FixtureMemberService implements MemberService {

    public void saveNewMember(Member member) throws Exception {
        System.out.println("saveNewMember");
    }

    @Override
    public Member findById(final Long id) throws Exception {
        Member mockedMember = new Member();
        mockedMember.setId(1l);
        mockedMember.setName("frodo");
        return mockedMember;
    }
}
