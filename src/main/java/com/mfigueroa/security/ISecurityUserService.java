package com.mfigueroa.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(String token);

}
