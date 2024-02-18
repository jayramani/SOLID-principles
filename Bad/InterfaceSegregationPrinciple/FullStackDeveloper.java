public class FullStackDeveloper implements EmployeeResponsibility{

    @Override
    public void design() {
        System.out.println("I am excellent at designing");
    }

    @Override
    public void develop() {
        System.out.println("I am excellent at developing");
    }

    @Override
    public void test() {
        System.out.println("I am excellent at testing");
    }

    @Override
    public void hire() {
        System.out.println("I can't hire employee");
        throw new UnsupportedOperationException();
    }
}
