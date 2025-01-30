public class ISP {
    // Salah: Interface terlalu besar, tidak semua metode digunakan oleh semua implementasi
    // interface Worker {
    //     void work();
    //     void eat();
    // }

    // class Developer implements Worker {
    //     public void work() { System.out.println("Coding..."); }
    //     public void eat() { throw new UnsupportedOperationException(); } // Developer tidak butuh ini
    // }

    // Benar: Pisahkan interface menjadi bagian yang lebih spesifik
    interface Workable {
        void work();
    }

    interface Eatable {
        void eat();
    }

    class Developer implements Workable {
        public void work() { System.out.println("Coding..."); }
    }

    class OfficeWorker implements Workable, Eatable {
        public void work() { System.out.println("Working..."); }
        public void eat() { System.out.println("Eating lunch..."); }
    }


}
