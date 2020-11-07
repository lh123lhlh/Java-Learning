package com.mlh.study.week5;

/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author lh
 * @Date 2020/11/7
 **/

public class BookServiceImpl implements BookService {
    @Override
    public boolean BookOnShelf(Book book) throws MyException {
        String ISBN = book.getISBN();
        String name = book.getName();
        int price = book.getPrice();
        boolean result = false;
        if (!ISBN.matches("\\d+") || ISBN.length() != 13){
            throw new MyException(name+ "\tISBN不能为13位数字");
        } else if (name.contains("暴力") || name.contains("恐怖")){
            throw new MyException(name + "\t书名中不能含有暴力和恐怖元素");
        } else if (price > 100){
            throw new MyException(name + "\t价格超过了100元");
        } else {
            result = true;
        }
        return result;
    }
}
