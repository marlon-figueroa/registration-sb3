package com.mfigueroa.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mfigueroa.persistence.model.User;
import com.mfigueroa.persistence.model.UserLocation;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}
