package cursor.hw8.task2.service;

import cursor.hw8.task2.dao.UserGenerator;
import cursor.hw8.task2.model.User;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserService {

    public static Map<String, List<String>> getUsersLoggedWeekAgo() {
        return UserGenerator.getUsers().stream()
                .filter(user -> user.getLoginDate().isAfter(LocalDate.now().minusDays(7)))
                .collect(Collectors.groupingBy(User::getTeam,
                        Collectors.mapping(User::getEmail, Collectors.toList())));
    }
}
