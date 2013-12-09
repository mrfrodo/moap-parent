package no.mrfrodo.services;

import no.mrfrodo.model.Member;

public interface MemberService {

    public void saveNewMember(Member member) throws Exception;

    public Member findById(Long id) throws Exception;
}
