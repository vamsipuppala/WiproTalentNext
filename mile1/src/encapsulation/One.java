package encapsulation;
class Author
{  
    String name,email;
    char gender;
    Author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
       this.gender=gender;
        
    }
    
}
class Book
{
    String name;
    Author author;
    double price;
    int qtyInStock;
    Book(String name,Author author,double price,int qtyInStock)
    {
    this.name=name;
    this.author=author;
    this.price=price;
    this.qtyInStock=qtyInStock;
    }
    String getName()
    {
        return this.name;
    }
    String getAuthorName()
    {
        return this.author.name;
    }
    String getAuthorEmail()
    {
        return this.author.email;
    }
    char getAuthorGender()
    {
        return this.author.gender;
    }
    double getPrice()
    {
        return this.price;
    }
     int getqtyInStock()
    {
        return this.qtyInStock;
    }
    //setters
     void setName(String name)
    {
        this.name=name;
    }
    void setAuthor(Author author)
    {
        this.author=author;
    }
    void setPrice(double price)
    {
       this.price=price;
    }
     void setqtyInStock()
    {
         this.qtyInStock=qtyInStock;
    }
}
public class One {
    public static void main(String args[]) {
     Author a=new Author("Rookie","rookie@g.com",'M');
     Book b=new Book("StrangeTrilogies",a,200,3);
     System.out.println(b.getName()+" "+b.getAuthorName()+" "+b.getAuthorEmail()+" "+b.getAuthorGender()+" "+b.getPrice()+" "+b.getqtyInStock());
    }
}