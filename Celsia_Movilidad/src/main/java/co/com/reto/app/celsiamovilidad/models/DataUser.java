package co.com.reto.app.celsiamovilidad.models;

public class DataUser {
    private final String name;
    private final String lastName;
    private final Integer id;
    private final Integer phoneNumber;
    private final String city;
    private final String adress;
    private final String email;
    private final String password;
    private final String confirmPassword;

    public DataUser(String name, String lastName, Integer id, Integer phoneNumber, String city, String adress,
                    String email, String password, String confirmPassword){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.adress = adress;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}