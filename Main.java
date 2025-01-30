public class Main {
    //Enkapsulasi
    abstract class Mahasiswa {
        public String name;
        private int IPK;
      
        public int getIPK() {
          return IPK;
        }
      
        public void setIPK(int newIPK) {
          this.IPK = newIPK;
        }

        public abstract void berbicara();
    }

    //inheritance
    public class Safar extends Mahasiswa {
        public Safar() { // Constructor untuk inisialisasi
            this.name = "Safar";
            setIPK(4); // Memanfaatkan setter dari parent
        }

        @Override
        public void berbicara() {
            System.out.println("Halo Saya Suka Rendang");
        }
    }

    //polimorfisme
    public class Davinco extends Mahasiswa {
        public Davinco() { // Constructor untuk inisialisasi
            this.name = "Davinco";
            setIPK(4); // Memanfaatkan setter dari parent
        }

        @Override
        public void berbicara() {
            System.out.println("Halo Saya Suka Ayam");
        }
    }

    public class Rihal extends Mahasiswa {
        public Rihal() { // Constructor untuk inisialisasi
            this.name = "Rihal";
            setIPK(4); // Memanfaatkan setter dari parent
        }

        @Override
        public void berbicara() {
            System.out.println("Terbang Tanpa Batas Dan Melampauinya");
        }
    }

    public class Rasyid extends Mahasiswa {
        public Rasyid() { // Constructor untuk inisialisasi
            this.name = "Rasyid";
            setIPK(4); // Memanfaatkan setter dari parent
        }

        @Override
        public void berbicara() {
            System.out.println("Aku Adalah Jawa");
        }
    }

    public class Zaki extends Mahasiswa {
        public Zaki() { // Constructor untuk inisialisasi
            this.name = "Zaki";
            setIPK(4); // Memanfaatkan setter dari parent
        }

        @Override
        public void berbicara() {
            System.out.println("Halo Saya Suka Telur");
        }
    }


    public static void main(String[] args) {
        
    }
}
