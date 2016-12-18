package Module_7;

public class GeneratorRunner {

    public static void main(String[] args) {
        Generator generator = new Generator();

        generator.addRand1000();
        generator.addRandInt10K();
        generator.timeCalcInt();
        generator.timeCalcInt10K();

        generator.randomStr();
        generator.addRandStr();
        generator.addRandStr10K();
        generator.timeCalcStr();
        generator.timeCalcStr10K();
    }
}
