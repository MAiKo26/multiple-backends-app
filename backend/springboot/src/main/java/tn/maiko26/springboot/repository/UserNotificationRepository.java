package tn.maiko26.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.maiko26.springboot.models.Session;

public interface UserNotificationRepository extends JpaRepository<Session, String> {
}