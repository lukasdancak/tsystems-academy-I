public class ProcessTimer {
    private long startTime;
    private long endTime;
    private String nameOfProcess;

    public ProcessTimer(String name) {
        this.startTime = 0L;
        this.endTime = 0L;
        this.nameOfProcess = name;
    }

    public void startTimer (){ // spusti stopky
        this.setStartTime(System.currentTimeMillis());
    }

    public void stopTimerPrintResult (){
        setEndTime(System.currentTimeMillis());
        System.out.println("Procces: " + getNameOfProcess() + " - duration: "
                + (getEndTime() - getStartTime()) + " milliseconds");
    }


    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getNameOfProcess() {
        return nameOfProcess;
    }

    public void setNameOfProcess(String nameOfProcess) {
        this.nameOfProcess = nameOfProcess;
    }
}
