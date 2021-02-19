package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://nsa40.casimages.com/img/2021/02/17/mini_210217110029308694.png"),
            new User("002", "Paul", "https://nsa40.casimages.com/img/2021/02/17/mini_210217111644923794.png"),
            new User("003", "Phil", "https://nsa40.casimages.com/img/2021/02/17/mini_21021711173957388.png"),
            new User("004", "Guillaume", "https://nsa40.casimages.com/img/2021/02/17/mini_210217112615819473.png"),
            new User("005", "Francis", "https://nsa40.casimages.com/img/2021/02/17/mini_210217112750733777.png"),
            new User("006", "George", "https://nsa40.casimages.com/img/2021/02/17/mini_210217112817684320.png"),
            new User("007", "Louis", "https://nsa40.casimages.com/img/2021/02/17/mini_210217112851435162.png"),
            new User("008", "Mateo", "https://nsa40.casimages.com/img/2021/02/17/mini_210217113341794490.png"),
            new User("009", "April", "https://nsa40.casimages.com/img/2021/02/17/mini_210217111502963074.png"),
            new User("010", "Louise", "https://nsa40.casimages.com/img/2021/02/17/mini_210217112538893465.png"),
            new User("011", "Elodie", "https://nsa40.casimages.com/img/2021/02/17/mini_21021711300289563.png"),
            new User("012", "Helene", "https://nsa40.casimages.com/img/2021/02/17/mini_210217113433894320.png"),
            new User("013", "Fanny", "https://nsa40.casimages.com/img/2021/02/17/mini_210217113859433591.png"),
            new User("014", "Laura", "https://nsa40.casimages.com/img/2021/02/17/mini_210217113932525023.png"),
            new User("015", "Gertrude", "https://nsa40.casimages.com/img/2021/02/17/mini_210217114002822238.png"),
            new User("016", "Chloé", "https://nsa40.casimages.com/img/2021/02/17/mini_210217114029847282.png"),
            new User("017", "April", "https://nsa40.casimages.com/img/2021/02/17/mini_210217114450602014.png"),
            new User("018", "Marie", "https://nsa40.casimages.com/img/2021/02/17/mini_210217114511788536.png"),
            new User("019", "Henri", "https://nsa40.casimages.com/img/2021/02/17/mini_210217113507311084.png"),
            new User("020", "Rémi", "https://nsa40.casimages.com/img/2021/02/17/mini_210217114242448976.png")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://nsa40.casimages.com/img/2021/02/17/mini_210217114908745542.png"),
            new User("022", "Geoffrey", "https://nsa40.casimages.com/img/2021/02/17/mini_210217114843283009.png"),
            new User("023", "Simon", "https://nsa40.casimages.com/img/2021/02/17/mini_210217114954128185.png"),
            new User("024", "André", "https://nsa40.casimages.com/img/2021/02/17/mini_210217115018529599.png"),
            new User("025", "Leopold", "https://nsa40.casimages.com/img/2021/02/17/mini_210217115101745622.png")
    );
}
