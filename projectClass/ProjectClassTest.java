public class ProjectClassTest{
    public static void main(String[] args){
        ProjectClass testProject = new ProjectClass("Add Bowling Alley", "North rooftop adjacent to Chipotle", 59999.99);
        testProject.setName("Downtown HQ");
        testProject.setDescription("Relocating to Seattle.");
        testProject.setCost(7999.99);
        System.out.println(testProject.getName());
        System.out.println(testProject.getDescription());
        System.out.println(testProject.getCost());
        System.out.println(testProject.elevatorPitch());
    }
}