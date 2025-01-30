public class OCP {
    // Salah: Harus mengubah class jika ada jenis diskon baru
    // class DiscountService {
    //     public double calculateDiscount(String type, double amount) {
    //         if (type.equals("STUDENT")) {
    //             return amount * 0.10;
    //         } else if (type.equals("SENIOR")) {
    //             return amount * 0.15;
    //         }
    //         return 0;
    //     }
    // }

    // Benar: Gunakan polimorfisme untuk menambahkan diskon baru tanpa mengubah kode yang ada
    interface Discount {
        double apply(double amount);
    }

    class StudentDiscount implements Discount {
        public double apply(double amount) {
            return amount * 0.10;
        }
    }

    class SeniorDiscount implements Discount {
        public double apply(double amount) {
            return amount * 0.15;
        }
    }

    class DiscountService {
        public double calculateDiscount(Discount discount, double amount) {
            return discount.apply(amount);
        }
    }
}
