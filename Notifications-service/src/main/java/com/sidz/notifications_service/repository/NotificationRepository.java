package com.sidz.notifications_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sidz.notifications_service.entity.Notifications;

@Repository
public interface NotificationRepository extends JpaRepository<Notifications, Integer>{

}
