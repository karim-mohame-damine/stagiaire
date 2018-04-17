package com.example.demo.security;

import com.example.demo.entities.Authority;
import com.example.demo.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getStagiaire().getPrenom(),
                user.getStagiaire().getNom(),
                user.getStagiaire().getEmail(),
                user.getPassword(),
                mapToGrantedAuthorities( user.getAuthorities() ),
                user.getEnabled(),
                user.getLastPasswordResetDate()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Authority> authorities) {
        return authorities.stream()
                .map( authority -> new SimpleGrantedAuthority( authority.getName().name() ) )
                .collect( Collectors.toList() );
    }
}
