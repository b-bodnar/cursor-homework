package cursor.hw8.task2.model;

import java.time.LocalDate;

public class User {

    private String email;
    private LocalDate loginDate;
    private String team;

    public User(String email, LocalDate loginDate, String team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", loginDate=" + loginDate +
                ", team='" + team + '\'' +
                '}';
    }
}
