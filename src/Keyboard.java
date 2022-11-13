import java.util.Arrays;

public class Keyboard{
    private String[] layout;
    private boolean backLight;
    private boolean additionalKeyboardOnTheRight;

    public Keyboard(String[] layout, boolean backLight, boolean additionalKeyboardOnTheRight) {
        this.layout = layout;
        this.backLight = backLight;
        this.additionalKeyboardOnTheRight = additionalKeyboardOnTheRight;
    }

    public String[] getLayout() {
        return layout;
    }

    public void setLayout(String[] layout) {
        this.layout = layout;
    }

    public boolean isBackLight() {
        return backLight;
    }

    public void setBackLight(boolean backLight) {
        this.backLight = backLight;
    }

    public boolean isAdditionalKeyboardOnTheRight() {
        return additionalKeyboardOnTheRight;
    }

    public void setAdditionalKeyboardOnTheRight(boolean additionalKeyboardOnTheRight) {
        this.additionalKeyboardOnTheRight = additionalKeyboardOnTheRight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "layout=" + Arrays.toString(layout) +
                ", backLight=" + backLight +
                ", additionalKeyboardOnTheRight=" + additionalKeyboardOnTheRight +
                '}';
    }
}
