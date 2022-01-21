package cigma.pfe.models;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
@ToString
public class Client {
    //...
    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
            name = "client_fk",
            referencedColumnName = "id"
    ),
            inverseJoinColumns = @JoinColumn(
                    name = "promotion_fk",
                    referencedColumnName = "id"
            ))
    private List<promotion> promotions;
//...
@OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
private CarteFidelio carteFidelio;




}
