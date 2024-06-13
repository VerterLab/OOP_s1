package impl;

public enum EPackage {
    PLASTIC("plastik"), GLASS("glass"), CARTON("carton");

    private final String material;

    EPackage(String material){
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }
}
