package tn.maiko26.springboot.repository;

import tn.maiko26.springboot.models.Session ;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, String> {
    void deleteBySessionId(String sessionId);
}
