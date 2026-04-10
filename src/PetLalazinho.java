public class PetLalazinho {

    private String name;
    private boolean clean;

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public PetLalazinho(String name) {
        this.name = name;
        this.clean = false;

    }
}
