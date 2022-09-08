public interface Book {

    void totalPage();
}

class Archie implements Book{
    int page;
   public void totalPage(){

       System.out.println("total page is " + this.page);
    }

        }