import java.util.ArrayList;

public class Beer {
    private String name;
    private String type;
    private Boolean al;
    private String manufacturer;
    private ArrayList<String> ingridients;
    private Chars chars;
    private int commonIngridient;
    private int darkBeerIngridient = 0;
    private int lightBeerIngridient = 0;
    private int campBeerIngridient = 0;
    private int aliveBeerIngridient = 0;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Boolean getAl() {
        return al;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public ArrayList<String> getIngridients() {
        return ingridients;
    }

    public Chars getChars() {
        return chars;
    }

    public int getCommonIngridient() {
        return commonIngridient;
    }

    public int getDarkBeerIngridient() {
        return darkBeerIngridient;
    }

    public int getAliveBeerIngridient() {
        return aliveBeerIngridient;
    }

    public int getLightBeerIngridient() {
        return lightBeerIngridient;
    }

    public int getCampBeerIngridient() {
        return campBeerIngridient;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAl(Boolean al) {
        this.al = al;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setIngridients(ArrayList<String> ingridients) {
        this.ingridients = ingridients;
    }

    public void setChars(Chars chars) {
        this.chars = chars;
    }

    public void setCommonIngridient(int commonIngridient) {
        this.commonIngridient = commonIngridient;
    }

    public void setCampBeerIngridient(int campBeerIngridient) {
        this.campBeerIngridient = campBeerIngridient;
    }

    public void setAliveBeerIngridient(int aliveBeerIngridient) {
        this.aliveBeerIngridient = aliveBeerIngridient;
    }

    public void setDarkBeerIngridient(int darkBeerIngridient) {
        this.darkBeerIngridient = darkBeerIngridient;
    }

    public void setLightBeerIngridient(int lightBeerIngridient) {
        this.lightBeerIngridient = lightBeerIngridient;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String ing = "";
        ing += "commonINgridient - " + commonIngridient;
        if (darkBeerIngridient > 0)
            ing += " darkINgridient - " + darkBeerIngridient;
        if (lightBeerIngridient > 0)
            ing += " lightINgridient - " + lightBeerIngridient;
        if (campBeerIngridient > 0)
            ing += " campINgridient - " + campBeerIngridient;
        if (aliveBeerIngridient > 0)
            ing += " aliveINgridient - " + aliveBeerIngridient;
        return "name:" + name + " type:" + type + " al:" + al + " manufacturer: " + manufacturer + " ingredients: " + ing +
                " revolNumber: " + chars.getRevolNumber() + " transparency: " + chars.getTransparency() +
                " filtered: " + chars.getFiltered() + " nutritionalValue: " + chars.getNutritionalValue() +
                " spillMethod: " + chars.getSpillMethodCapacity() + chars.getSpillMethodMaterial();
    }
}