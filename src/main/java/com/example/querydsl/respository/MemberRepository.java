package com.example.querydsl.respository;

import com.example.querydsl.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
    //select m from Member m where m.username = ?
    List<Member> findByUsername(String username);
}
