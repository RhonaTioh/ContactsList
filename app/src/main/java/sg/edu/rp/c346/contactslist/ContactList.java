package sg.edu.rp.c346.contactslist;

/**
 * Created by 17010318 on 24/7/2018.
 */

public class ContactList {
    private String name;
    private int code;
    private int number;

    public ContactList(String name, int code, int number) {
        this.name = name;
        this.code = code;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", number=" + number +
                '}';
    }
}