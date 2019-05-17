package testing2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.Directions;
import main.FieldCoordinates;
import main.FieldGame;

public class FieldGameTest {

	private FieldGame fieldgame = new FieldGame(); 
	private Directions directions = new Directions();
	private FieldCoordinates fieldcoordinates = new FieldCoordinates();
	
	@Test
	public void testNorthDirection() {
		
		assertEquals("North Direction is not working",directions.northDirection(5),"turning 5 metres North" );
	}
	 
	@Test
	public void testSouthDirection() {
		
		assertEquals("South Direction is not working",directions.southDirection(5),"turning 5 metres South" );
	}
	
	@Test
	public void testWestDirection() {
		
		assertEquals("West Direction is not working",directions.westDirection(5),"turning 5 metres West" );
	}
	
	
	@Test
	public void testButtonEntered() {
		
		assertTrue("Start Button is not working",fieldgame.commandGame("start") );
		
	}
	
	@Test
	public void testField() {
		
		assertEquals("Fieldmap not correct",fieldcoordinates.fieldMap(0,0), "You are in the middle of an infinite grey swamp." );
		
	}
	
	
	@Test
	public void testField2() {
		
		assertEquals("Fieldmap not correct",fieldcoordinates.fieldMap(7,7), "You are on fire" );
		
	}
	
	@Test
	public void testField3() {
		
		assertEquals("Fieldmap not correct",fieldcoordinates.fieldMap(13,9), "Treasure! you win! The end!" );
		
	}
	
	
	
	

	

}
