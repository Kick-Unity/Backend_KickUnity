package org.example.kickunity.user.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.kickunity.global.entity.BaseEntity;


import java.util.Objects;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", updatable = false)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "name", nullable = false)
    private String name;

    // 비밀번호 추가 필요
    @Column(name = "password", nullable = false)
    private String psw;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "score", nullable = false)
    private int score = 0;

    @Column(name = "team_id")
    private Long team_id = null;


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