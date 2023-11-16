public class Node {
    // atribut data
    Object data;
    Node next;

    // constructor node
    Node(Object object) {
        this(object, null);
    }

    // constructor node
    Node(Object object, Node node) {
        data = object;
        next = node;
    }

    // function getter data
    Object getObject() {
        return data;
    }

    // function getter pointer next
    Node getNext() {
        return next;
    }
}
