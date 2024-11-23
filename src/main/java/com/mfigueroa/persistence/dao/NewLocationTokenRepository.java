package com.mfigueroa.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mfigueroa.persistence.model.NewLocationToken;
import com.mfigueroa.persistence.model.UserLocation;

public interface NewLocationTokenRepository extends JpaRepository<NewLocationToken, Long> {

    NewLocationToken findByToken(String token);

    NewLocationToken findByUserLocation(UserLocation userLocation);

}
