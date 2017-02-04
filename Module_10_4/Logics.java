package Module_10_4;

import java.util.ArrayList;
import java.util.List;

public class Logics {

    Guest guest1 = new Guest(150, "Olga", "Savitska");
    Guest guest2 = new Guest(5000, "Volodymyr", "Illienko");
    List<Guest> debtList = new ArrayList<>();

    public void g() throws NameNotFoundException {
        debtList.add(guest1);
        debtList.add(guest2);
        System.out.println("You are searching for debts of 'Oleksandr Krasnov'...");
        boolean result = debtList.stream()
                .anyMatch(s -> s.getName().equals("Oleksandr") && s.getSurname().equals("Krasnov"));
        if (result) {
            System.out.println("Search successful!");
        }
        if (!result) {
            throw new NameNotFoundException();
        }
    }

    public void f() throws TestException {
        try {
            g();
        } catch (NameNotFoundException e) {
            throw new TestException("This is an exception");
        }
    }
}
