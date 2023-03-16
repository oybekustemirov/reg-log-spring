package qqb.uz.reglogspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qqb.uz.reglogspring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
