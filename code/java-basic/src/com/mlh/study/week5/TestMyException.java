package com.mlh.study.week5;

/**
 * @ClassName TestMyException
 * @Description TODO
 * @Author lh
 * @Date 2020/11/7
 **/

public class TestMyException {
    public static void main(String[] args) {
        Book[] books = {
                new Book("0123487964153","Java从入门到精通",90),
                new Book("012348796415a","Java从入门到暴力破解",90),
                new Book("0123487964151","Java从入门到精通",101)};
        BookService bs = new BookServiceImpl();

        for (Book book : books) {
            try{
                boolean result = bs.BookOnShelf(book);
                if (result){
                    System.out.println("成功上架");
                }
            } catch (MyException e){
                System.out.println(e.showMsg());
            }
        }
    }
}
