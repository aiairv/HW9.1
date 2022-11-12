public class Keyboard{
    private String[][] layout = {
            {"Esc","F1","F2", "F3","F4","F5","F6", "F7", "F8","F9", "F10","F11", "F12","PrtSc", "Delete", "Off/On"},
            {"~","1","2","3","4","5","6", "7", "8","9", "-","=", "Backspace"},
            {"Tab","Q", "W","E","R","T","Y","U","I", "O", "P","{", "}","|"},
            {"CapsLk","A","S","D","F","G","H","J","K","L",":","'","Enter"},
            {"Shift","Z","X","C","V","B","N","M","<",">","?","Shift"},
            {"Ctrl","Fn","Wn","Alt","--------","Alt","Ctrl","<","^","V",">"}};
    private boolean backLight;
    private boolean additionalKeyboardOnTheRight;

    public Keyboard(String[][] layout, boolean backLight, boolean additionalKeyboardOnTheRight) {
        this.layout = layout;
        this.backLight = backLight;
        this.additionalKeyboardOnTheRight = additionalKeyboardOnTheRight;
    }

    public String[][] getLayout() {
        return layout;
    }

    public void setLayout(String[][] layout) {
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
}
