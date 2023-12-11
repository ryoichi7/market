package ryo.market.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    @NotEmpty(message = "Username should not be empty!")
    @Size(min = 3, max = 30, message = "Username should be between 3 and 30 characters!")
    private String username;

    @Column(name = "email")
    @Email(message = "Email should follow the format example@example.com!")
    @Size(max = 50, message =  "Email should have less than 50 characters!")
    private String email;

    @Column(name = "password")
    @Min(value = 8, message = "Password should contain at least 8 characters!")
    @Max(value = 60, message = "Password should have less than 60 characters!")
    private String password;

    @Column(name = "balance")
    @Min(value = 0, message = "Balance should be greater than zero!")
    @NotNull(message = "Balance should be a number!")
    private Integer balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
