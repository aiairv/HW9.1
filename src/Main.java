public class Main {
    public static void main(String[] args) {
        Display myDisplay = new Display(30, "Lenovo", "TN+Film");
        SSD mySSD = new SSD(160,2);
        RAM myRAM = new RAM (4, "Lenovo");
        USB myUSB = new USB("USB-A", 5);
        String[] listLang = new String[3];
        listLang[0] = "Ru";
        listLang[1] = "En";
        listLang[2] = "Ky";

        Keyboard myKeyboard = new Keyboard(listLang, true,false );

        Computer myComputer = new Computer(myDisplay, "Lenovo", "Grey", mySSD, myRAM,myUSB, myKeyboard );
    printComputer(myComputer);
    }
    public static void printComputer(Computer myComputer){
        System.out.println(myComputer);
    }
}
