public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("name1", "surname1");
        Author author2 = new Author("name2", "surname2");
        Book book1 = new Book("book1", author1,1990);
        Book book2 = new Book("book2", author2,1996);
        System.out.println(book1.getName()+" "+book1.getAuthor().getName()+" "+book1.getYear());
        System.out.println(book2.getName()+" "+book2.getAuthor().getName()+" "+book2.getYear());
        book1.setYear(2005);
        System.out.println(book1.getName()+" "+book1.getAuthor().getName()+" "+book1.getYear());
    }
}