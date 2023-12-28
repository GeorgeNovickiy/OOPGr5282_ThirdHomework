package Domain;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<StudentGroup> {
    private int count;
    private final List<StudentGroup> list;
    
/**
 * Конструктор для инициализации итератора студенческой группы
 * @param list - список студенческой группы
 */
    public GroupIterator(List<StudentGroup> list) {
        this.list = list;
        this.count = 0;
    }
    
/**
 * Метод проверки наличия следующей группы
 */

    @Override
    public boolean hasNext() {
       return count < list.size();
    }

/**
 * Метод возвращающий текущую группу
 */
    @Override
    public StudentGroup next() {
        return this.list.get(count++);        
    }
    
}