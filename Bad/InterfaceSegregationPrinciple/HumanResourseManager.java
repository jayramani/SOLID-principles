import jdk.jshell.spi.ExecutionControl;

public class HumanResourseManager implements EmployeeResponsibility{

    @Override
    public void design() {
        System.out.println("I can't design");
        throw new UnsupportedOperationException();

    }

    @Override
    public void develop() {
        System.out.println("I can't develop");
        throw new UnsupportedOperationException();
    }

    @Override
    public void test() {
        System.out.println("I can't test");
        throw new UnsupportedOperationException();
    }

    @Override
    public void hire() {
        System.out.println("I am HR. I am excellent at hiring");
    }
}
