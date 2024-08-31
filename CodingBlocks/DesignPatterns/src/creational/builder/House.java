package creational.builder;


//The Builder pattern is used to construct complex objects step by step. 
//It allows for the creation of different representations of an object using the same construction process.

//Example in Java: java.lang.StringBuilder, java.lang.StringBuffer


class House {
    private String foundation;
    private String structure;
    private String roof;

    // Setters for each component
    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}

class HouseBuilder {
    private House house;

    public HouseBuilder() {
        this.house = new House();
    }

    public HouseBuilder buildFoundation(String foundation) {
        house.setFoundation(foundation);
        return this;
    }

    public HouseBuilder buildStructure(String structure) {
        house.setStructure(structure);
        return this;
    }

    public HouseBuilder buildRoof(String roof) {
        house.setRoof(roof);
        return this;
    }

    public House build() {
        return house;
    }
}

