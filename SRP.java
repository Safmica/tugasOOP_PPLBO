public class SRP {
    // Salah: Kelas memiliki lebih dari satu tanggung jawab (mengelola data dan mencetak laporan)

    // class Employee {
    //     private String name;
    //     private double salary;

    //     public Employee(String name, double salary) {
    //         this.name = name;
    //         this.salary = salary;
    //     }

    //     public void printSalaryReport() {
    //         System.out.println("Employee: " + name + ", Salary: " + salary);
    //     }
    // }

    // Benar: Pisahkan tanggung jawab ke kelas berbeda
    class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() { return name; }
        public double getSalary() { return salary; }
    }

    class SalaryPrinter {
        public void printSalary(Employee emp) {
            System.out.println("Employee: " + emp.getName() + ", Salary: " + emp.getSalary());
        }
    }

}
