public class Job {
    public static void main(String[] args) {
        Employee john = new Employee("John","11/21/2000", "02/21/2022");
        System.out.println(john);
        System.out.println("Age " + john.getAge());
        System.out.println("Pay " + john.collectPay());
    }
}
