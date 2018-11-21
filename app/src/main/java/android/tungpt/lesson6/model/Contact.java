package android.tungpt.lesson6.model;

public class Contact {
    private String mName;
    private String mPhone;

    public Contact(String name, String number) {
        mName = name;
        mPhone = number;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }
}
