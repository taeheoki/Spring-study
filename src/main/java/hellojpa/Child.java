package hellojpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Child {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
