class Address{
    String city, state, country;
    Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }    
}


class Emp{
    String id, name;
    Address address;
    Emp(String id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println(id + "\t" + name);
        System.out.println(address.city + "\t" + address.state + "\t" + address.country);
    }

    public static void main(String[] args) {
        Address address = new Address("Agra", "Utter Pradesh", "India");
        Emp emp = new Emp("001", "Pramo", address);
        emp.display();
    }
}