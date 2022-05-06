package com.atamie.braintrainer.authentication.repository;


import com.atamie.braintrainer.authentication.user.User;
//import microservices.book.authentication.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UserRepository extends CrudRepository<User, Long> {

    User findByAliasAndPassword(final String alias, final String password);
    Optional<User> findByAlias(final String alias);

}
