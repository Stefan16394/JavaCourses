package P02_Book_Shop;

 class Book {
    private String author;
    private String tittle;
    private double price;

     public Book(String author, String tittle, double price) {
         setAuthor(author);
         setTittle(tittle);
         setPrice(price);
     }

     public void setAuthor(String author) {
         String[] name=author.split("\\s+");
         if (name.length==2)
         {
             if (Character.isDigit(name[1].charAt(0)))
             {
                 throw new IllegalArgumentException("Author not valid!");
             }
         }
         this.author = author;
     }

     public void setTittle(String tittle) {
         if (tittle.length()<3)
         {
             throw new IllegalArgumentException("Title not valid!");
         }
         this.tittle = tittle;
     }

     public void setPrice(double price) {
         if (price<=0)
         {
             throw new IllegalArgumentException("Price not valid!");
         }
         this.price = price;
     }

     public String getAuthor() {
         return author;
     }

     public String getTittle() {
         return tittle;
     }

     public double getPrice() {
         return price;
     }

     @Override
     public String toString()
     {
         final StringBuilder sb = new StringBuilder();
         sb.append("Type: ").append(this.getClass().getSimpleName())
                 .append(System.lineSeparator())
                 .append("Title: ").append(this.getTittle())
                 .append(System.lineSeparator())
                 .append("Author: ").append(this.getAuthor())
                 .append(System.lineSeparator())
                 .append("Price: ").append(this.getPrice())
                 .append(System.lineSeparator());
         return sb.toString();

     }
 }
