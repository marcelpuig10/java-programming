package day50_inheritance;

public class AudioBook extends Book{
   int length;
   String narrator;

   public void listen(){
       System.out.println("listening to audiobook");
       System.out.println("title = " + title);
       System.out.println("author = " + author);
       System.out.println("price = " + price);
       System.out.println("narrator = " + narrator);
       System.out.println("length = " + length);

       AudioBook audiobook = new AudioBook();
       audiobook.author ="unmesh";
       audiobook.length = 60;
       audiobook.narrator = "irina";
       audiobook.price = 44.99;
       audiobook.title = "selenium";
       audiobook.type = "automation";
       audiobook.listen();

       EBook eBook = new EBook();
       eBook.title = "java";
       eBook.author = "akbar";
       eBook.type = "programming";
       eBook.price = 45.0;
       eBook.size = 2;
       eBook.pages = 1000;
       eBook.readBook();


   }
}
