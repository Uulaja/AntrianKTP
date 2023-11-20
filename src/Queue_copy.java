import java.util.ArrayList;

public class Queue_copy {
    private Node nodeAwal;
    private ArrayList<Node> queList;

    public Queue_copy() {
        queList = new ArrayList<>();
    }

    public void enqueue(int nomor, String nama, String alamat) {
        if (isEmpty()) {
            nodeAwal = new Node(nomor, nama, alamat);
            queList.add(nodeAwal);
        } else {
            Node temp = nodeAwal;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(nomor, nama, alamat);
            queList.add(temp.next);
        }

    }

    public Node dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return null;
        }

        // Removing and returning the first node in the queue
        Node removedNode = queList.get(0);
        System.out.println("Nomor antrian : " + removedNode.getNomor() + " Telah dikeluarkan");

        // Updating the nodeAwal variable correctly
        if (removedNode == nodeAwal) {
            nodeAwal = nodeAwal.next;
        }

        return queList.remove(0);

    }

    public Node peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        }

        // Returning the first node in the queue without removing it
        return queList.get(0);
    }

    public boolean isEmpty() {
        return queList.isEmpty();
    }

    public int size() {
        return queList.size();
    }

    // Display method to show nodes in the order they are enqueued
    public void displayQueue() {
        for (Node node : queList) {
            node.displaynode();
        }
    }

    public void cetak() {
        if (isEmpty()) {
            System.out.print(" Antrian kosong \n");
            return;
        }
        System.out.print("Urutan Antrian : ");
        Node kini = nodeAwal;
        while (kini != null) {
            System.out.print(kini.getNomor() + " <-----");
            kini = kini.next;
        }
        System.out.println();
    }
}
