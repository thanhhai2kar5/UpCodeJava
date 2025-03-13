package codegiaodiendemo;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Sprint3 {
    public static void main(String[] args) {
        // Tạo frame
        JFrame frame = new JFrame("Ứng dụng Nhân Hai Số");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2, 5, 5));

        // Các thành phần nhập số
        JLabel labelA = new JLabel("Nhập số thứ nhất:");
        JTextField fieldA = new JTextField();
        JLabel labelB = new JLabel("Nhập số thứ hai:");
        JTextField fieldB = new JTextField();

        // Nút thực hiện phép nhân
        JButton btnMultiply = new JButton("x");

        // Nhãn hiển thị kết quả
        JLabel resultLabel = new JLabel("Kết quả: ");

        // Xử lý sự kiện cho nút nhân
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Lấy giá trị từ ô nhập
                    double a = Double.parseDouble(fieldA.getText());
                    double b = Double.parseDouble(fieldB.getText());
                    // Thực hiện phép nhân
                    double result = a * b;
                    // Hiển thị kết quả
                    resultLabel.setText("Kết quả: " + result);
                } catch (NumberFormatException ex) {
                    // Thông báo lỗi khi nhập sai định dạng số
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(labelA);
        frame.add(fieldA);
        frame.add(labelB);
        frame.add(fieldB);
        frame.add(btnMultiply);
        frame.add(new JLabel()); // Để căn chỉnh bố cục
        frame.add(resultLabel);

        // Hiển thị frame
        frame.setVisible(true);
    }
}
