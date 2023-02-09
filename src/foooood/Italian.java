package foooood;

public abstract class Italian implements Dishes {
    private String[] ingredients;


    public Italian(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public abstract void addingredient(String ingredient);

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getIngredients() {
        return ingredients;
    }
}
