import java.io.IOException;
import java.io.FileWriter;

public class Ticket {
    int row;
    int seat;
    int price;
    Person person;

    public Ticket(int row, int seat,int price, Person person){
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }

    public int getPrice() {
        return price;
    }

    void printTicketsInfo(){
        System.out.println("Row: "+row);

        System.out.println("Seat: "+seat);
        System.out.println("Price: £"+price);
        person.printPersonInfo();
    }
}