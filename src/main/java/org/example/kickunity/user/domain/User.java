package org.example.kickunity.user.domain;

import jakarta.persistence.*;
import lombok.Getter;
import org.example.kickunity.global.entity.BaseEntity;


import java.util.Objects;

@Entity
public class User extends BaseEntity {

    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Getter
    private String email;

    private String name;

    // 비밀번호 추가 필요
    private String psw;

    private String phone;

    private int score = 0;

    private Long team_id = null;


    protected User() {
    }

    public User(final String email, String psw) {
        this(null, email, psw);
    }
    public User(final Long id, final String email, String psw) {
        this.id = id;
        this.email = email;
        this.psw = psw;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final User member = (User) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}