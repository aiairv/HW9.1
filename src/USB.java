public class USB {
    private String usbType;
    private int portID;

    public USB(String usbType, int portID) {
        this.usbType = usbType;
        this.portID = portID;
    }

    public String getUsbType() {
        return usbType;
    }

    public void setUsbType(String usbType) {
        this.usbType = usbType;
    }

    public int getPortID() {
        return portID;
    }

    public void setPortID(int portID) {
        this.portID = portID;
    }

    @Override
    public String toString() {
        return "USB{" +
                "usbType='" + usbType + '\'' +
                ", portID=" + portID +
                '}';
    }
}
