
public class Computer {
    private Display display;
    private String brand;
    private String colour;
    private SSD ssd;
    private RAM ram;
    private USB usb;
    private Keyboard keyboard;

    public Computer(Display display, String brand, String colour, SSD ssd, RAM ram, USB usb, Keyboard keyboard) {
        this.display = display;
        this.brand = brand;
        this.colour = colour;
        this.ssd = ssd;
        this.ram = ram;
        this.usb = usb;
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer" + "\n" +
                display + "\n" +
                "brand='" + brand + "\n" +
                "colour='" + colour + "\n" +
                ssd + "\n" +
                ram + "\n" +
                usb + "\n" +
                keyboard;
    }
}
