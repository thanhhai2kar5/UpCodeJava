package hii;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Sprint6 {
    public static void main(String[] args) {
        // Tạo frame
        JFrame frame = new JFrame("Tính Tiền Nước");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new GridLayout(4, 2, 5, 5));

        // Các thành phần nhập liệu
        JLabel labelStart = new JLabel("Nhập số đầu:");
        JTextField fieldStart = new JTextField();
        JLabel labelEnd = new JLabel("Nhập số cuối:");
        JTextField fieldEnd = new JTextField();

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
                    int start = Integer.parseInt(fieldStart.getText());
                    int end = Integer.parseInt(fieldEnd.getText());

                    if (end < start) {
                        JOptionPane.showMessageDialog(frame, "Số cuối phải lớn hơn hoặc bằng số đầu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Tính thành tiền
                        int usage = end - start;
                        int total = usage * 10000;

                        // Hiển thị kết quả
                        resultLabel.setText("Thành tiền: " + total + " VND");
                    }
                } catch (NumberFormatException ex) {
                    // Thông báo lỗi khi nhập sai định dạng số
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(labelStart);
        frame.add(fieldStart);
        frame.add(labelEnd);
        frame.add(fieldEnd);
        frame.add(btnCalculate);
        frame.add(new JLabel()); // Để căn chỉnh bố cục
        frame.add(resultLabel);

        // Hiển thị frame
        frame.setVisible(true);
    }
}