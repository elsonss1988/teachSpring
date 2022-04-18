package com.ibm.hello.Repository;

import com.ibm.hello.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<User,Long> {
}
