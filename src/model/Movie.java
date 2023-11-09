package model;

public class Movie {

    protected String code;
    protected String name;
    protected String description;
    protected String category;

    public Movie(String code, String name, String description, String category) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Movie details");
        sb.append("Code: \n"+this.getCode());
        sb.append("Name: \n"+this.getName());
        sb.append("Category: \n"+this.getCategory());
        sb.append("Description: \n"+this.getDescription()+"\n");
        return sb.toString();
    }
}
