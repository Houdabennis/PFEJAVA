package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table
@Getter
@Setter
@AllArgsConstructor
@Entity(name = "TClients")
 public class Client {

    public long id;
    public String nom ;
    public Client(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public Client() {
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
        @Override
        public String toString() {
            return "Client{" +
                    "id=" + id +
                    ", name='" + nom + '\'' +
                    '}';
        }
    }

