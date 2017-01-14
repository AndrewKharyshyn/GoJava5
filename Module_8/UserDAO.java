package Module_8;

class UserDAO extends AbstractDAOImpl {

    long id;
    String name;

    public UserDAO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDAO " +
                "id = " + id +
                ", name = " + name;
    }


}
