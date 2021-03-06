import converter.DefaultConverter;
import domain.Host;
import domain.HouseHost;
import domain.pets.Dog;
import domain.pets.Husky;
import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {

    @Test
    public void convertTest() {
        DefaultConverter defaultConverter = new DefaultConverter(new Husky(), HouseHost.class);
        Host host = defaultConverter.convertTo(new Husky(), HouseHost.class);
        Assert.assertEquals("withing", host.getName());
        Assert.assertEquals("jason", host.getPetName());
    }

    public <T> void genricTest(T source) {
        Class<?> clazz = source.getClass();
        System.out.println(clazz);
    }

    @Test
    public void methodTest() {
        Dog dog = new Dog();
        genricTest(dog);
    }

    @Test
    public void cloneTest(){
        Host host = new Host();
        host.setName("withing");
        host.setPetName("123qwe");
        Host clonehost = host.clone();
        System.out.println(clonehost);
    }
}
