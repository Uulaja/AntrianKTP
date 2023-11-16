public class List {
    // atribut data
    public Node nodeAwal;
    public Node nodeAkhir;
    public String no;
    public String nama;
    public String alamat;

    // constructor SLL
    public List() {
        this("list");
    }

    // constructor SLL
    public List(String namaList) {
        nama = namaList;
        nodeAwal = nodeAkhir = null;
    }

    // procedure menyisipkan data di awal SLL
    public void sisipDiAwal(Object dt) {
        if (kosong()) {
            nodeAwal = nodeAkhir = new Node(dt);
        } else {
            nodeAwal = new Node(dt,
                    nodeAwal);
        }
    }

    // procedure menyisipkan data di akhir SLL
    public void sisipDiAkhir(Object dt) {
        if (kosong()) {
            nodeAwal = nodeAkhir = new Node(dt);
        } else {
            nodeAkhir = nodeAkhir.next = new Node(dt);
        }
    }

    // function menghapus data dari depan
    public Object hapusDrDepan() {
        Object itemDihapus = null;
        if (!kosong()) {
            itemDihapus = nodeAwal.data;
            if (nodeAwal == nodeAkhir) {
                nodeAwal = nodeAkhir = null;
            } else {
                nodeAwal = nodeAwal.next;
            }
        }
        return itemDihapus;
    }

    // function pengecekan apakah SLL kosong
    public boolean kosong() {
        return nodeAwal == null;
    }

    // procedure mencetak data
    public void cetak() {
        if (kosong()) {
            System.out.printf(" Antrian kosong \n", no, nama, alamat);
            return;
        }
        System.out.printf("Urutan Antrian : ", no, nama, alamat);
        Node kini = nodeAwal;
        while (kini != null) {
            System.out.printf("%s <-- ", kini.data);
            kini = kini.next;
        }
        System.out.println("\n");
    }
}
