package warmup;

class UserAccount {
    String model;
    int year;
    double price;

    public UserAccount(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public UserAccount() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
