package com.practice.micro_receiver.micro_receiver.repository;

import com.practice.micro_receiver.micro_receiver.model.Micro_Receiver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiverRepository extends JpaRepository<Micro_Receiver, Long> {
}
