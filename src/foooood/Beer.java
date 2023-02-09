package foooood;

import java.util.Arrays;

public class Beer extends Alcoholic{

    public Beer(String[] ingredients){
        super(ingredients);
    }

    @Override
    public void addingredient(String ingredient) {
        String[] newIngredients = Arrays.copyOf(getIngredients(), getIngredients().length + 1);
        newIngredients[newIngredients.length-1] = ingredient;
        setIngredients(newIngredients);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (String ingrid: this.getIngredients()) {
            sb.append(ingrid);
            sb.append(" + ");
        }
        return sb.substring(0,sb.length()-3);
    }
}
