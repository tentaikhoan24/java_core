package Labs07.Bai6;

import java.util.*;
import java.util.stream.Collectors;

public class Bai6 {
    public static void main(String[] args) {
        List<Transaction> transactionList = new ArrayList<>();
        Customer customer1 = new Customer("Nguyen Van A", "Ha Noi");
        Customer customer2 = new Customer("Tran Thi B", "Ha Noi");
        Customer customer3 = new Customer("Hoang Manh C", "Ho Chi Minh");
        Customer customer4 = new Customer("Ta Thu D", "Da Nang");

        transactionList.add(new Transaction(customer1, 2023, "iphone", 1));
        transactionList.add(new Transaction(customer2, 2021, "nokia", 2));
        transactionList.add(new Transaction(customer3, 2023, "samsung", 3));
        transactionList.add(new Transaction(customer4, 2023, "xiaomi", 4));
        transactionList.add(new Transaction(customer1, 2022, "nokia", 6));
        transactionList.add(new Transaction(customer2, 2020, "oppo", 7));
        transactionList.add(new Transaction(customer3, 2020, "iphone", 8));
        transactionList.add(new Transaction(customer4, 2021, "samsung", 9));
        transactionList.add(new Transaction(customer4, 2022, "samsung", 11));

        //bai 6_2_1
        List<Transaction> bai6_2_1 = transactionList.stream().
                filter(t -> t.getYear() == 2023)
                .sorted(Comparator.comparing(Transaction::getAmount))
                .collect(Collectors.toList());
        System.out.println(bai6_2_1);

        //bai 6_2_2
        Set<String> bai6_2_2 = transactionList.stream()
                .map(Transaction::getCustomer)
                .map(Customer::getCity)
                .collect(Collectors.toSet());
        System.out.println(bai6_2_2);

        //bai 6_2_3
        Map<String,List<Customer>> bai6_2_3 = transactionList.stream()
                .map(Transaction::getCustomer)
                .distinct()
                .collect(Collectors.groupingBy(Customer::getCity));
        bai6_2_3.forEach((address,cus)-> System.out.println(address + " - " + cus));

        //bai 6_2_4
        List<Customer> bai6_2_4 = transactionList.stream()
                .map(Transaction::getCustomer)
                .distinct()
                .sorted(Comparator.comparing(Customer::getName))
                .collect(Collectors.toList());
        bai6_2_4.forEach(System.out::println);

        //bai 6_2_5
        long count = transactionList.stream()
                .filter(t -> t.getCustomer().getCity().equals("Dang Nang"))
                .count();

        if (count == 0) System.out.println("No");
        else System.out.println("Yes");

        //bai 6_2_6
        Integer max = transactionList.stream()
                .map(Transaction::getAmount)
                .max(Comparator.comparingInt(n -> n)).get();;
        System.out.printf("Số lượng lớn nhất là: %d",max);

        //bai 6_2_7
        int sum = transactionList.stream()
                .filter(t -> t.getCustomer().getCity().equals("Hung Yen"))
                .mapToInt(Transaction::getAmount)
                .sum();
        System.out.printf("Tổng số lượng hàng tại Hung Yen là: %d",sum);

        //bai 6_2_8
        int min = transactionList.stream()
                .map(Transaction::getAmount)
                .min(Integer::compare)
                .get();
        System.out.println("Giao dịch có số lượng nhỏ nhất là: " + min);
        transactionList.stream()
                .filter(t->t.getAmount() == min)
                .forEach(System.out::println);
    }
}
