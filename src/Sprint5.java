package hii;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Sprint5 {
    public static void main(String[] args) {
        // Tạo frame
        JFrame frame = new JFrame("Tính Thành Tiền");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2, 5, 5));

        // Các thành phần nhập liệu
        JLabel labelQuantity = new JLabel("Nhập số lượng:");
        JTextField fieldQuantity = new JTextField();
        JLabel labelPrice = new JLabel("Nhập đơn giá:");
        JTextField fieldPrice = new JTextField();

        // Nút tính thành tiền
        JButton btnCalculate = new JButton("Tính");

        // Nhãn hiển thị kết quả
        JLabel resultLabel = new JLabel("Thành tiền: ");

        // Xử lý sự kiện cho nút tính
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Lấy giá trị từ ô nhập
                    int quantity = Integer.parseInt(fieldQuantity.getText());
                    double price = Double.parseDouble(fieldPrice.getText());

                    // Tính thành tiền
                    double total = quantity * price;

                    // Hiển thị kết quả
                    resultLabel.setText("Thành tiền: " + total);
                } catch (NumberFormatException ex) {
                    // Thông báo lỗi khi nhập sai định dạng số
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(labelQuantity);
        frame.add(fieldQuantity);
        frame.add(labelPrice);
        frame.add(fieldPrice);
        frame.add(btnCalculate);
        frame.add(new JLabel()); // Để căn chỉnh bố cục
        frame.add(resultLabel);

        // Hiển thị frame
        frame.setVisible(true);
    }
}