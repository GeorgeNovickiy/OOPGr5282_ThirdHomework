package Domain;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> steam;
    private Integer idSteam;
    
/**
 * Конструктор для инициализации потока групп студентов
 * @param steam - имя потока групп студентов
 * @param idclient - идентификатор потока групп студентов
 */
    public StudentSteam(List<StudentGroup> steam, Integer idSteam) {
        this.steam = steam;
        this.idSteam = idSteam;
    }

/**
 * Метод получения списка студенческих групп в потоке
 */

    public List<StudentGroup> getSteam() {
        return steam;
    }

/**
 * Метод изменения списка студенческих групп в потоке
 */
    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

/**
 * Метод получения идентификатора потока
 */
    public Integer getIdSteam() {
        return idSteam;
    }

/**
 * Метод изменения идентификатора потока
 */
    public void setIdSteam(Integer idSteam) {
        this.idSteam = idSteam;
    }
/**
 * Метод выведения информации о названии потока и его идентификатора
 */
    @Override
    public String toString() {
        return "StudentSteam{" +
                "steam=" + steam +
                ", idSteam=" + idSteam +
                '}';
    }

/**
 * Метод создания итератора для потока групп студентов
 */

    @Override
    public Iterator<StudentGroup> iterator() {
      return new GroupIterator(steam);
    }




}
