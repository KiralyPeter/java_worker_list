public class Worker {
     
    private String name;
    private String city;
    private String address;
    private String salary;
    private String bonus;
    private String born;
    private String hire;

    public Worker() {

        name = "";
        city = "";
        address = "";
        salary = "";
        bonus = "";
        born = "";
        hire = "";
    }

    public String getName() { return name; }
    public void setName( String name ) { this.name = name; }

    public String getCity(){ return city; }
    public void setCity( String city ) { this.city = city; }

    public String getAddress() { return address; }
    public void setAddress( String address ) { this.address = address; }

    public String getSalary() { return salary; }
    public void setSalary( String salary ) { this.salary = salary; }

    public String getBonus() { return bonus; }
    public void setBonus( String bonus ) { this.bonus = bonus; }

    public String getBorn() { return born; }
    public void setBorn( String born ){ this.born = born; }

    public String getHire() { return hire; }
    public void setHire( String hire ) { this.hire = hire; }

   
}
