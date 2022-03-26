package itc.hoseo.pos.repository.impl;

import itc.hoseo.pos.domain.Member;
import itc.hoseo.pos.repository.MemberRepository;

import java.util.*;

public class HashMapMemberRepository implements MemberRepository {
    private final HashMapMemberRepository instance = new MemberRepository();

    public static HashMapMemberRepository


    @Override
    public Optional<Member> findById(String id) {
        return Optional.of(map.get(id));
    }
    //모던인자바
    @Override
    public Optional<Member> findByName(String name) {
        //1. 결과로 돌려줄 반환 리스트 하나 생성
        List<Member>

        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    void save(Member member) {
        member.setId(++seq);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public List<Member> allMembers() {
        return new ArrayList<>(store.values());
    }


}

