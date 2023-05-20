package Labs07.Bai5;

import java.util.Optional;

class User {
    private Address address;

    public Address getAddress() {
        return this.address;
    }
}

class Address {
    private String street;

    public String getStreet() {
        return this.street;
    }
}

public class Bai5_3 {
    private static User getUser() {
        return null;
    }

    public String notUsedOptional() {
        User user = getUser();
        if (user != null) {
            Address address = user.getAddress();
            if (address != null) {
                String street = address.getStreet();
                if (street != null)
                    return street;
            }
        }

        return "not specified";
    }
    public String usedOptional(){
        Optional<User> user = Optional.ofNullable(getUser());
        return user.map(User::getAddress)
                .map(Address::getStreet)
                .orElse("not specified");
    }
}
