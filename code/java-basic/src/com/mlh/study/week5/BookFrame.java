package com.mlh.study.week5;

import javax.swing.*;

/**
 * @ClassName BookFrame
 * @Description TODO
 * @Author lh
 * @Date 2020/11/7
 **/

public class BookFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JTextField priceField;
    private JTextField ISBNField;
    private JButton 检查Button;
    private JTextField nameField;
    private JLabel resultLable;

    public BookFrame() {
        检查Button.addActionListener(e -> {
            System.out.println("click");
            String ISBN = ISBNField.getText();
            String name = nameField.getText();
            String price = priceField.getText();
            Book book = Book.builder().ISBN(ISBN).name(name).price(Integer.parseInt(price)).build();
            BookService bs = new BookServiceImpl();
            boolean b = false;
            try {
                b = bs.BookOnShelf(book);
            } catch (MyException ee) {
                JOptionPane.showMessageDialog(null,"上架未通过");
                resultLable.setText( book.getName() + "\t上架未通过");
            } finally {
                ISBNField.setText("");
                nameField.setText("");
                priceField.setText("");
            }
            if (b) {
                JOptionPane.showMessageDialog(null,"上架通过了");
                resultLable.setText( book.getName() + "\t上架通过了");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BookFrame");
        frame.setContentPane(new BookFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        //frame.pack();
        frame.setVisible(true);
    }
}
