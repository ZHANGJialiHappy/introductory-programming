import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ShoppingList {
    private Map<String, Integer> availablIngredients;
    private Map<String, Integer> recipeIngredients;
    private List<Map.Entry<String, Integer>> shoppingList;

    public ShoppingList() {
        availablIngredients = new HashMap<>();
        recipeIngredients = new HashMap<>();
        shoppingList = new ArrayList<>();
    }

    public void read() {
        boolean isAvailable = false;
        boolean isRecipe = false;
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextLine()) {
                String input = sc.nextLine().toLowerCase();
                if (!input.startsWith("available") && !input.startsWith("recipe") && isAvailable == true) {
                    addToIngredients(input, availablIngredients);
                }
                if (!input.startsWith("available") && !input.startsWith("recipe") && isRecipe == true) {
                    addToIngredients(input, recipeIngredients);
                }
                if (input.startsWith("available")) {
                    isAvailable = true;
                    isRecipe = false;
                }
                if (input.startsWith("recipe")) {
                    isRecipe = true;
                    isAvailable = false;
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private void addToIngredients(String input, Map<String, Integer> ingredients) {
        String[] inputArray = input.split(" ");
        if (inputArray.length != 3) {
            return;
        }
        String ingredient = inputArray[2];
        String unit = inputArray[1];
        Integer quantity = Integer.parseInt(inputArray[0]);
        if (unit.equals("kg")) {
            quantity = quantity * 1000;
        }
        if (ingredients.containsKey(ingredient)) {
            Integer value = ingredients.get(ingredient);
            ingredients.put(ingredient, value + quantity);
        } else {
            ingredients.put(ingredient, quantity);
        }
    }

    public void printShoppingList() {
        getDifferentIngredients();
        System.out.println("Shopping List:");
        for (Map.Entry<String, Integer> ingredient : shoppingList) {
            System.out.println(ingredient.getValue() + " g " + ingredient.getKey());
        }
    }

    private List<Map.Entry<String, Integer>> getDifferentIngredients() {
        Set<String> keysOfRecipe = recipeIngredients.keySet();
        if (keysOfRecipe.size() == 0) {
            return shoppingList;
        }
        Iterator<String> itr = keysOfRecipe.iterator();
        while (itr.hasNext()) {
            String keyOfRecipe = itr.next();
            if (!availablIngredients.containsKey(keyOfRecipe)) {
                Integer amountDifference = recipeIngredients.get(keyOfRecipe);
                shoppingList.add(Map.entry(keyOfRecipe, amountDifference));
            } else {
                Integer amountDifference = recipeIngredients.get(keyOfRecipe) - availablIngredients.get(keyOfRecipe);
                if (amountDifference > 0) {
                    shoppingList.add(Map.entry(keyOfRecipe, amountDifference));
                }
            }
        }
        Collections.sort(shoppingList, (i1, i2) -> {
            {
                return i1.getKey().compareTo(i2.getKey());
            }
        });

        return shoppingList;
    }
}
