public class Main {
    // Enkapsulasi dan Abstraksi
    abstract static class Mahasiswa {
        protected String name;
        private int IPK;

        public int getIPK() {
            return IPK;
        }

        public void setIPK(int newIPK) {
            this.IPK = newIPK;
        }

        public abstract void berbicara();
    }

    public interface Slogan {
        void sebutSlogan();
    }

    // Inheritance dan Polimorfisme
    static class Safar extends Mahasiswa implements Slogan {
        public Safar() {
            this.name = "Safar";
            setIPK(4);
        }

        @Override
        public void berbicara() {
            System.out.println("Safar Say : Halo, Saya Suka Rendang.");
        }

        @Override
        public void sebutSlogan() {
            System.out.println("Slogan : \"Saya Safar Backend!\"");
        }
    }

    static class Davinco extends Mahasiswa implements Slogan {
        public Davinco() {
            this.name = "Davinco";
            setIPK(4);
        }

        @Override
        public void berbicara() {
            System.out.println("Davinco Say : Halo, Saya Suka Ayam.");
        }

        @Override
        public void sebutSlogan() {
            System.out.println("Slogan : \"Saya Sehat!\"");
        }
    }

    static class Rihal extends Mahasiswa implements Slogan {
        public Rihal() {
            this.name = "Rihal";
            setIPK(4);
        }

        @Override
        public void berbicara() {
            System.out.println("Davinco Say : Terbang Tanpa Batas Dan Melampauinya.");
        }

        @Override
        public void sebutSlogan() {
            System.out.println("Slogan : \"Saya Anak Kuat!\"");
        }
    }

    static class Rasyid extends Mahasiswa implements Slogan {
        public Rasyid() {
            this.name = "Rasyid";
            setIPK(4);
        }

        @Override
        public void berbicara() {
            System.out.println("Rasyid Say : Aku Adalah Jawa.");
        }

        @Override
        public void sebutSlogan() {
            System.out.println("Slogan : \"Jawa Adalah Kunci!\"");
        }
    }

    static class Zaki extends Mahasiswa implements Slogan {
        public Zaki() {
            this.name = "Zaki";
            setIPK(4);
        }

        @Override
        public void berbicara() {
            System.out.println("Davinco Say : Halo, Saya Suka Telur.");
        }

        @Override
        public void sebutSlogan() {
            System.out.println("Slogan : \"Saya Sabuk Hitam!\"");
        }
    }

    public static void main(String[] args) {
        // Membuat objek secara manual dan mencetak hasilnya
        Safar safar = new Safar();
        Davinco davinco = new Davinco();
        Rihal rihal = new Rihal();
        Rasyid rasyid = new Rasyid();
        Zaki zaki = new Zaki();

        System.out.println("       *****      ");
        System.out.println("     *       *    ");
        System.out.println("    *  O   O  *   ");
        System.out.println("    *    ^    *   ");
        System.out.println("    *  \\___/  *   ");
        System.out.println("     *       *    ");
        System.out.println("       *****      ");

        System.out.println("############################");
        System.out.println("      DATA KELOMPOK       ");
        System.out.println("############################");

        System.out.println("\nNama   : " + safar.name);
        System.out.println("IPK    : " + safar.getIPK());
        safar.berbicara();
        safar.sebutSlogan();

        System.out.println("\nNama   : " + davinco.name);
        System.out.println("IPK    : " + davinco.getIPK());
        davinco.berbicara();
        davinco.sebutSlogan();

        System.out.println("\nNama   : " + rihal.name);
        System.out.println("IPK    : " + rihal.getIPK());
        rihal.berbicara();
        rihal.sebutSlogan();

        System.out.println("\nNama   : " + rasyid.name);
        System.out.println("IPK    : " + rasyid.getIPK());
        rasyid.berbicara();
        rasyid.sebutSlogan();

        System.out.println("\nNama   : " + zaki.name);
        System.out.println("IPK    : " + zaki.getIPK());
        zaki.berbicara();
        zaki.sebutSlogan();
    }
}
