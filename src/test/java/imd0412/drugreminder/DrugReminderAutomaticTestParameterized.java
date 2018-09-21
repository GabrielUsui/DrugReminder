
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DrugReminderAutomaticTestParameterized 
{
	@Parameters( name = "TestesParametrizaveis" )
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]
		{
			{"10/12/16 14:30", "6 horas", 1, Arrays.asList({"10/12/16 14:30", "10/12/16 20:30", "11/12/16 02:30", "11/12/16 08:30", "11/12/16 14:30"})},
			{"10/12/16 14:30", "8 horas", 1, Arrays.asList({"10/12/16 14:30", "10/12/16 22:30", "11/12/16 06:30"})},
			{"10/12/16 14:30", "12 horas", 1, Arrays.asList({"10/12/16 14:30", "11/12/16 02:30"})},
			{"10/12/16 14:30", "24 horas", 1, Arrays.asList({"10/12/16 14:30"})},
		});
	}
	
	@Parameter(0)
	public String startTime;
	@Parameter(1)
	public String frequency;
	@Parameter(2)
	public int duration;
	@Parameter(3)
	public List<String> expectedType;
	

	@Test
	public void testDefineType() {
	DrugReminderImpl reminder = new DrugReminderImpl();
	String returnedType = reminder.createReminders(startTime, frequency, duration);
	assertEquals(expectedType, returnedType);
	}

}