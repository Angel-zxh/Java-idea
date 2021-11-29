package Chap6_4;

public class ComputerController {
    public Computer getComputer(ComputerBuilder computerBuilder) {
        computerBuilder.buildeCPU();
        computerBuilder.buildeDisplay();
        computerBuilder.buildeHost();
        computerBuilder.buildeHardDisk();
        computerBuilder.buildeStorage();
        Computer computer = computerBuilder.creComputer();
        return computer;
    }
}
