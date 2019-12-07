package prv.saevel.drools.workshop.users;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {

    private long userId;

    private double balance;

    private Currency currency;
}
