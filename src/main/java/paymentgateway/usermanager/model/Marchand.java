package paymentgateway.usermanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Marchand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String imageUrl;
    @Column(nullable = false,updatable = false)
    private String marchandCode;




    @Override
    public String toString() {
        return "Marchand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", marchandCode='" + marchandCode + '\'' +
                '}';
    }
}
