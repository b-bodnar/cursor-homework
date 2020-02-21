package cursor.hw12.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {

    private int averageSalary;
    private int frequency;

    public Node(int data) {
        this.averageSalary = data;
    }
}
