package com.covidunit.covidunitapi.User;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class UserModel {
    private @Id @GeneratedValue long id;
    private @Column(name = "name", nullable=false, length=20) String name;
    private @Column(name = "email", nullable=false, length=50,  unique = true) String email;
    private @Column(name = "password", nullable=false) String password;
    private @Column(name = "loggedIn") boolean loggedIn;

    public UserModel(){}
    public UserModel(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.loggedIn = false;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserModel)) return false;
        UserModel user = (UserModel) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, loggedIn);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", password='" + password + '\'' +
                ", loggedIn=" + loggedIn + '}';
    }

}
