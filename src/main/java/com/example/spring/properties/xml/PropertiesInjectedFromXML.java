package com.example.spring.properties.xml;

public class PropertiesInjectedFromXML {
    private String constructorProperty;
    private int simpleProperty;

    public String getConstructorProperty() {
        return constructorProperty;
    }

    public void setConstructorProperty(String constructorProperty) {
        this.constructorProperty = constructorProperty;
    }

    public int getSimpleProperty() {
        return simpleProperty;
    }

    public void setSimpleProperty(int simpleProperty) {
        this.simpleProperty = simpleProperty;
    }



    public PropertiesInjectedFromXML(){
        constructorProperty = "default";
        simpleProperty = -1;
    }

    public PropertiesInjectedFromXML(String constructorProperty) {
        this.constructorProperty = constructorProperty;
    }
}
