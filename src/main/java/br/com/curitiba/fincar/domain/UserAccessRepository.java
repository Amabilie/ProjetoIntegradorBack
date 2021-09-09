package br.com.curitiba.fincar.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccessRepository extends JpaRepository<UserAccess, Long> {

    UserAccess findByLogin(String login);
}
