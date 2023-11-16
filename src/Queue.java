public class Queue {
    // atribut data
    private final List listAntrian;

    // constructor Queue
    public Queue() {
        listAntrian = new List("antrian");
    }

    // procedure menyisipkan data pada queue
    public void enqueue(Object object, int priority) {
        if (priority == 0) {
            listAntrian.sisipDiAkhir(object);
        } else {
            listAntrian.sisipDiAwal(object);
        }
    }

    // function mengambil data pada queue
    public Object dequeue() {
        return listAntrian.hapusDrDepan();
    }

    // function pengecekan apakah queue kosong
    public boolean kosong() {
        return listAntrian.kosong();
    }

    // procedure mencetak data pada queue
    public void cetak() {
        listAntrian.cetak();
    }

    void cetak(String no, String nama, String alamat, boolean kondisi) {
        listAntrian.cetak();
        // System.out.print(no+"."+nama+","+alamat+"\n");
    }
}
