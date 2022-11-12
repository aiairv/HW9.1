public class SSD{
    private int memorySize;
    private int diskDivision;

    public SSD(int memorySize, int diskDivision) {
        this.memorySize = memorySize;
        this.diskDivision = diskDivision;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getDiskDivision() {
        return diskDivision;
    }

    public void setDiskDivision(int diskDivision) {
        this.diskDivision = diskDivision;
    }

}
