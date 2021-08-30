package Chapter34.Task43;

public abstract class PublicBuilding implements Building{
    protected String typeBuilding;
    public abstract String getNameBuilding();
    public String printDefaultInfo(){
        return "It's now public building, but it's until abstract idea";
    }
}
