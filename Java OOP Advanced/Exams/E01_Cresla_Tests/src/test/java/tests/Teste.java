package tests;

import com.sun.org.apache.xpath.internal.operations.Mod;
import cresla.entities.containers.ModuleContainer;
import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.EnergyModule;
import cresla.interfaces.Module;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class Teste {
    private ModuleContainer container;
    private EnergyModule energyModule;
    private AbsorbingModule absorbingModule;

    @Before
    public void init()
    {
        this.container=new ModuleContainer(2);
        this.energyModule= Mockito.mock(EnergyModule.class);
        this.absorbingModule=Mockito.mock(AbsorbingModule.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestWithNullEnergyModule()
    {
        this.container.addEnergyModule(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestWithNullAbsorbModule()
    {
        this.container.addAbsorbingModule(null);
    }

    @Test
    public void TestAddEnergyModule() throws NoSuchFieldException, IllegalAccessException {
       EnergyModule e1= Mockito.mock(EnergyModule.class);
       EnergyModule e2=Mockito.mock(EnergyModule.class);
       container.addEnergyModule(e1);
       container.addEnergyModule(e2);
        Field field =this.container.getClass().getDeclaredField("modulesByInput");
        field.setAccessible(true);
        List<Module> list= (List<Module>) field.get(this.container);

        Assert.assertEquals("Wrong answer",2,list.size());
    }

    @Test
    public void TestAddAModule() throws NoSuchFieldException, IllegalAccessException {
        AbsorbingModule e1= Mockito.mock(AbsorbingModule.class);
        AbsorbingModule e2=Mockito.mock(AbsorbingModule.class);
        container.addAbsorbingModule(e1);
        container.addAbsorbingModule(e2);
        Field field =this.container.getClass().getDeclaredField("modulesByInput");
        field.setAccessible(true);
        List<Module> list= (List<Module>) field.get(this.container);

        Assert.assertEquals("Wrong answer",2,list.size());
    }

    @Test
    public void TestgetEnergy() throws NoSuchFieldException, IllegalAccessException {
        EnergyModule e1= Mockito.mock(EnergyModule.class);
        EnergyModule e2=Mockito.mock(EnergyModule.class);
        Mockito.when(e1.getEnergyOutput()).thenReturn(10);
        Mockito.when(e1.getId()).thenReturn(1);
        Mockito.when(e2.getEnergyOutput()).thenReturn(15);
        Mockito.when(e2.getId()).thenReturn(2);

        container.addEnergyModule(e1);
        container.addEnergyModule(e2);

        Assert.assertEquals("Wrong answer",25,container.getTotalEnergyOutput());
    }

    @Test
    public void TestgetHeat() throws NoSuchFieldException, IllegalAccessException {
        AbsorbingModule e1= Mockito.mock(AbsorbingModule.class);
        AbsorbingModule e2=Mockito.mock(AbsorbingModule.class);
        Mockito.when(e1.getHeatAbsorbing()).thenReturn(10);
        Mockito.when(e1.getId()).thenReturn(1);
        Mockito.when(e2.getHeatAbsorbing()).thenReturn(15);
        Mockito.when(e2.getId()).thenReturn(2);

        container.addAbsorbingModule(e1);
        container.addAbsorbingModule(e2);

        Assert.assertEquals("Wrong answer",25,container.getTotalHeatAbsorbing());
    }

    @Test
    public void returnLongValueAbs() throws NoSuchFieldException, IllegalAccessException {
        AbsorbingModule e1= Mockito.mock(AbsorbingModule.class);
        AbsorbingModule e2=Mockito.mock(AbsorbingModule.class);
        Mockito.when(e1.getHeatAbsorbing()).thenReturn(2000000000);
        Mockito.when(e1.getId()).thenReturn(1);
        Mockito.when(e2.getHeatAbsorbing()).thenReturn(2000000000);
        Mockito.when(e2.getId()).thenReturn(2);

        container.addAbsorbingModule(e1);
        container.addAbsorbingModule(e2);

        Assert.assertEquals("Wrong answer",4000000000L,container.getTotalHeatAbsorbing());
    }

    @Test
    public void returnLongValueEn() throws NoSuchFieldException, IllegalAccessException {
        EnergyModule e1= Mockito.mock(EnergyModule.class);
        EnergyModule e2=Mockito.mock(EnergyModule.class);
        Mockito.when(e1.getEnergyOutput()).thenReturn(2000000000);
        Mockito.when(e1.getId()).thenReturn(1);
        Mockito.when(e2.getEnergyOutput()).thenReturn(2000000000);
        Mockito.when(e2.getId()).thenReturn(2);

        container.addEnergyModule(e1);
        container.addEnergyModule(e2);

        Assert.assertEquals("Wrong answer",4000000000L,container.getTotalEnergyOutput());
    }

    @Test
    public void removeTest() throws NoSuchFieldException, IllegalAccessException {
        EnergyModule e1= Mockito.mock(EnergyModule.class);
        EnergyModule e2=Mockito.mock(EnergyModule.class);
        EnergyModule e3=Mockito.mock(EnergyModule.class);
        Mockito.when(e1.getEnergyOutput()).thenReturn(2000000000);
        Mockito.when(e1.getId()).thenReturn(1);
        Mockito.when(e2.getEnergyOutput()).thenReturn(2000000000);
        Mockito.when(e2.getId()).thenReturn(2);
        Mockito.when(e3.getEnergyOutput()).thenReturn(2000000000);
        Mockito.when(e3.getId()).thenReturn(3);

        container.addEnergyModule(e1);
        container.addEnergyModule(e2);
        container.addEnergyModule(e3);

        Field energyModules=this.container.getClass().getDeclaredField("energyModules");
        energyModules.setAccessible(true);
        Map<Integer, EnergyModule> moduleMap=(Map<Integer, EnergyModule>) energyModules.get(this.container);

        Assert.assertEquals("Wrong answer",2,moduleMap.size());

        AbsorbingModule e4= Mockito.mock(AbsorbingModule.class);
        AbsorbingModule e5=Mockito.mock(AbsorbingModule.class);
        AbsorbingModule e6=Mockito.mock(AbsorbingModule.class);
        Mockito.when(e4.getHeatAbsorbing()).thenReturn(2000000000);
        Mockito.when(e5.getId()).thenReturn(5);
        Mockito.when(e6.getHeatAbsorbing()).thenReturn(2000000000);
        Mockito.when(e4.getId()).thenReturn(6);
        Mockito.when(e5.getHeatAbsorbing()).thenReturn(2000000000);
        Mockito.when(e6.getId()).thenReturn(7);

        container.addAbsorbingModule(e4);
        container.addAbsorbingModule(e5);
        container.addAbsorbingModule(e6);

        Field absorbModules=this.container.getClass().getDeclaredField("absorbingModules");
        absorbModules.setAccessible(true);
        Map<Integer, AbsorbingModule> absorbMap=(Map<Integer, AbsorbingModule>) absorbModules.get(this.container);

        Assert.assertEquals("Wrong answer",2,absorbMap.size());
    }
}
