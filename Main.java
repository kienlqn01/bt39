import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Khai báo danh sách ban đầu
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sử dụng lập trình hàm để tính toán
        int sum = numbers.stream()
                .map(n -> n * 2)         // Nhân đôi từng phần tử
                .filter(n -> n > 5)      // Lọc các phần tử lớn hơn 5
                .reduce(0, Integer::sum); // Tính tổng các phần tử

        System.out.println("Kết quả 1: " + sum);
    }
}
