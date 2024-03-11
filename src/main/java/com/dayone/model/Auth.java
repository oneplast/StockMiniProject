package com.dayone.model;

import com.dayone.persist.entity.MemberEntity;
import java.util.List;
import lombok.Data;

public class Auth {

    @Data
    public static class SingIn {
        private String username;
        private String password;
    }

    @Data
    public static class SingUp {
        private String username;
        private String password;
        private List<String> roles;

        public MemberEntity toEntity() {
            return MemberEntity.builder()
                    .username(this.username)
                    .password(this.password)
                    .roles(this.roles)
                    .build();
        }
    }
}
