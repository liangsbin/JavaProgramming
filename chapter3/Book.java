public class Book {
    String isbn;
    String name;
    String author;
    String press;
    double price;
    int pages;

    int currentPage;

    public Book(String n,int p){
        name = n;
        pages = p;
    }

    public void setMark(int page){
        if(page > pages || page <=0){
            System.out.println("设置合理的页码！");
        }else {
            currentPage = page;
            System.out.println("当前的页签位置：" + currentPage);
        }
    }

    public boolean find(String no){
        if(no.equals(isbn)){
            System.out.println("该书存在");
            return true;
        }else
        {
            System.out.println("该书不存在");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", price=" + price +
                ", pages=" + pages +
                ", currentPage=" + currentPage +
                '}';
    }
}
