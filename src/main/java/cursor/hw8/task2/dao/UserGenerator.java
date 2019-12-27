package cursor.hw8.task2.dao;

import cursor.hw8.task2.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserGenerator {
    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("email_1@gmail.com", LocalDate.of(2019, 12, 21), "A"));
        users.add(new User("email_2@gmail.com", LocalDate.of(2019, 12, 22), "B"));
        users.add(new User("email_3@gmail.com", LocalDate.of(2019, 12, 11), "C"));
        users.add(new User("email_4@gmail.com", LocalDate.of(2019, 12, 3), "A"));
        users.add(new User("email_5@gmail.com", LocalDate.of(2019, 12, 4), "A"));
        users.add(new User("email_6@gmail.com", LocalDate.of(2019, 12, 5), "B"));
        users.add(new User("email_7@gmail.com", LocalDate.of(2019, 12, 6), "B"));
        users.add(new User("email_8@gmail.com", LocalDate.of(2019, 12, 19), "A"));
        users.add(new User("email_9@gmail.com", LocalDate.of(2019, 12, 18), "C"));
        users.add(new User("email_10@gmail.com", LocalDate.of(2019, 12, 20), "A"));
        users.add(new User("email_11@gmail.com", LocalDate.of(2019, 12, 10), "C"));
        return users;
    }
}
