package P02_Book_Shop;

class GoldenEditionBook extends Book {

    GoldenEditionBook(String author, String tittle, double price) {
        super(author, tittle,price);
    }

    @Override
    public double getPrice()
    {
        return super.getPrice()+super.getPrice()*0.3;
    }

}
