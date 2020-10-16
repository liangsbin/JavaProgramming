/**
 * 练书，创建一个图书类，加书签，借书、还书等操作。
 * @author 梁胜彬
 * 2020-10-16
 */
public class Book {
    public String isbn;
    public String name;
    public String author;
    public String press;
    public String publishDate;
    public int pages;
    public double price;
    public String doi;

    public int currentPage;
    public boolean status; //true  在库,false 借出

    public void setMark(int page){
        if(page<1 || page >pages)
            System.out.println("设置合理的页码！");
        else{
            currentPage = page;
        }
        System.out.println("当前的书签位置：" + currentPage);
    }

    public void borrow(String bookName){
        if(name.equals(bookName)){
            if(status){
                System.out.println(name + "可以借出！");
                status = false;
            }
            else {
                System.out.println(name + "不在库！");
            }
        }else {
            System.out.println("图书馆没有此书！");
        }
    }

    public Book(String n,int p){
        name = n;
        pages = p;
    }
}
