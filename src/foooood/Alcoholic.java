package foooood;

public abstract class Alcoholic implements Beverages {
    private String[] ingredients;

    public Alcoholic(String[] ingredients) {
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
