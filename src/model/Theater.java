package model;

public class Theater {
    protected int number;
    protected int seats;

    public Theater(int number, int seats) {
        this.number = number;
        this.seats = seats;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Theater details");
        sb.append("Number: "+this.getNumber());
        sb.append("Seats: "+this.getSeats());
        return sb.toString();
    }
}
