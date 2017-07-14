package javalabs.lang.covariantreturn;

public class Dog extends Animal {

    /**
     * As DogFood is a subtype of Food, we can override the method and return
     * DogFood.
     *
     * More info : https://stackoverflow.com/questions/1882584/what-is-a-covariant-return-type
     *
     * @return a new DogFood
     */
    protected DogFood seekFood() {

        return new DogFood();
    }
}